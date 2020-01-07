/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

import java.util.Scanner;

/**
 * Quy dinh cac thong tin ve Person
 *
 * @author Nguyen Thanh Tuan
 */
public class Person {

    //Cac thuoc tinh cua Person
     int personID;
     String personName;
     int personAge;

    //Constructor - khoi tao doi tuong
    public Person() {
        personID = 0;
        personName = "No name";
        personAge = 19;
    }
public Person(int id, int age, String name){
    personID = id;
    personAge = age;
    personName = name;
    
}
    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int id) {
        personID = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String name) {
        personName = name;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int age) {
        personAge = age;
    }

    public static void main(String[] args) {
        //Khai bao bien
    }
     
}
