/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MovieList;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class MovieList {
    //Khai bao ArrayList
    private ArrayList<String> movieList = new ArrayList<String>();
    public void addMovie(String movie){
        movieList.add(movie);
    }
    public ArrayList<String> getMovie(){
        return movieList;
    }
    public void displayMovie(){
        System.out.println("You have "+movieList.size()+ " Items in favorite");
        for(int i=0;i<movieList.size();i++){
            System.out.println("Movie "+(i+1 )+":" + movieList.get(i));
        }
    }
    public void updateMovie(int index, String movie){
        movieList.set(index, movie);
        System.out.println("Updated ");
        System.out.println("Movie "+(index+1)+":"+movie);
    }
    public void removeMovie(int index){
        String movie = movieList.get(index);
        movieList.remove(index);
        System.out.println("Remoted" +movie);
    }
    public String findMovie(String search){
        int position = movieList.indexOf(search);
        if(position>0){
            System.out.println(position);
            return movieList.get(position);
            
        }
        return null;
    }
    public static void main(String[] args) {
      MovieList obList = new MovieList();
        System.out.println("Movie List \n");
        obList.addMovie("Mat Biec");
        obList.addMovie("Titanic");
        obList.addMovie("You have got email");
        obList.displayMovie();
        obList.updateMovie(1, "Avenger");
        obList.displayMovie();
        obList.removeMovie(0);
        obList.displayMovie();
        obList.findMovie("Avenger");
        obList.displayMovie();
    }
}
