/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
/**
 *
 * @author Admin
 */
public class IterateOverArrayListExample {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Ai la trieu phu");
        tvShows.add("Dau truong 100");
        tvShows.add("Vong quay ky dieu");
        tvShows.add("Giong ai giong ai");
        System.out.println("==================");
        //Iterate using java 8 forEach and lambda( Lặp đi lặp lại bằng cách sd java 8)
        tvShows.forEach(tvShow -> {
            System.out.println(tvShow);
        });
        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while(tvShowIterator.hasNext()){
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }
        System.out.println("\n===Iterate using iterator() and JAVA 8 forEachRemaining method ===");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
            System.out.println(tvShow);
        });
        
        System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
        //Ở đây, bắt đầu từ cuối và đi ngược danh sách
        ListIterator<String> tvshowListIterator = tvShows.listIterator(tvShows.size());
        while(tvshowListIterator.hasPrevious()){
            String tvShow = tvshowListIterator.previous();
            System.out.println(tvShow);
        }
        System.out.println("\n=== Iterate using simple for-each loop ===");
        for(String tvShow: tvShows){
            System.out.println(tvShow);
        }
        System.out.println("\n=== Iterate using for loop with index ===");
        for(int i=0;i<tvShows.size();i++){
            System.out.println(tvShows.get(i));
        }
    }
}
