/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(9);
        firstFivePrimeNumbers.add(11);
        //Tạo firstTen
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        //Tạo nextFive
        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(15);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(23);
        //add thêm nextFive vào firstFive thành firstTen
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        
        System.out.println(firstTenPrimeNumbers);
        
        
    }
}
