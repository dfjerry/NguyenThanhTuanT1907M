/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MovieList {
    
    public static void main(String[] args) {
        List<String> MovieString = new ArrayList<>();
        //THem phim moi
        MovieString.add("Avatar");
        MovieString.add("Avenger 4");
        MovieString.add(1,"Hulkk");
        System.out.println(MovieString);  
        Iterator movieIterator = MovieString.iterator();
        while (movieIterator.hasNext()) {
            Object element = movieIterator.next();
            System.out.println(element);
            
        }
        System.out.println();
        ListIterator MoIterator = MovieString.listIterator();
        while (MoIterator.hasNext()) {
            Object elment = MoIterator.next();
            MoIterator.set(elment+"Tuan");
        }
        System.out.println(MovieString);
        System.out.println("Noi dung da duoc sua ");
        movieIterator = MovieString.iterator();
        while (movieIterator.hasNext()) {
            Object element = movieIterator.next();
            System.out.println(element);
            
        }
        System.out.println(MovieString);
        MovieString.remove(1);
        System.out.println(MovieString);
        System.out.println("Tim kiem ten phim yeu thich:(Hulkk) " + MovieString.lastIndexOf("Avatar"));
    }
}
