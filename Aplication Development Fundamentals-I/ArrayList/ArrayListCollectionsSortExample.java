/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ArrayListCollectionsSortExample {
    public static void main(String[] args) {
        //Vdu sắp xếp mảng
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(13);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        numbers.add(1);
        System.out.println("Before: "+numbers);
        //Sap xep mang su dung ham` collection.sort() 
        Collections.sort(numbers);
        System.out.println("After "+numbers);
    }
}
