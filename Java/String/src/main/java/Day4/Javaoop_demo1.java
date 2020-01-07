/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Javaoop_demo1 {
    //Khai bao bien
    public static void main(String[] args) {
        Person person;
        //Khoi tao doi tuong
        person = new Person();
        person.setPersonID(10);
        System.out.println("person id "+person.getPersonID());
        System.out.println("person name "+person.getPersonName());
        System.out.println("person age "+person.getPersonAge());
    //Nhap thong tin cho user ==> in ra thong tin da nhap
        Person person2 = new Person(2,25,"Tuan");
        System.out.println("Person info: ID " +person2.getPersonID() + " \nPerson age "+ person2.getPersonAge()+" \nPerson name " + person2.getPersonName());
    }
}
