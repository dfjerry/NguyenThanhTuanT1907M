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
public class ArrayListIteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(18);
        numbers.add(23);
        numbers.add(30);
        
        Iterator<Integer> numbersIterator = numbers.iterator();
        while(numbersIterator.hasNext()){
            Integer num = numbersIterator.next();
            if(num%2!=0){ //numbers nào chia 2 dư khác không thì remove
                numbersIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
