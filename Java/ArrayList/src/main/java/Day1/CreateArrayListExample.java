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
public class CreateArrayListExample {
    public static void main(String[] args) {
        //Tạo 1 array list và thêm vào các phần tử cho nó
        List<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Mouse");
        System.out.println(animals);
        animals.add(2, "Tiger");
        //Thêm vào 1 phần tử ở vị trí thứ 2
        System.out.println(animals);
    }
}
