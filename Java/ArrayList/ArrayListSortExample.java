/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ArrayListSortExample {
    public static void main(String[] args) {
        //sap xep mang bang cach su dung ham arraylist.sort()
        List<String> names = new ArrayList<>();
        names.add("Tuan");
        names.add("Thang");
        names.add("Hung");
        names.add("Dat");
        System.out.println("Names "+names);
        //arraylist.sort()
        names.sort(new Comparator<String>(){
            public int compare(String name1, String name2){
                return name1.compareTo(name2);
            }
        });
        //
        names.sort((name1, name2) -> name1.compareTo(name2));
        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted names: "+names);
    }
}
