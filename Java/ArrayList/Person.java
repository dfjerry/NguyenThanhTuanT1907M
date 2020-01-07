/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Person {
    //Sap xep arraylist cua cac doi tuong bang cach sd trinh so sanh tuy chinh
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Tuan", 25));
        people.add(new Person("Tr Anh", 19));
        people.add(new Person("Thang", 24));
        people.add(new Person("Dat", 23));
        System.out.println("Person list "+people);
        //Sap xep nguoi theo tuoi
        people.sort((person1, person2) -> {
            return person1.getAge() - person2.getAge(); //To change body of generated lambdas, choose Tools | Templates.
        });
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Sorted Person List by Age: "+people);
        //Collections.sort() NHANH hon 
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted Person List by Name: "+people);
    }
}
