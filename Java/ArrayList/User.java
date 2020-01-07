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
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Tuan", 25));
        users.add(new User("Phu", 20));
        users.add(new User("Tr Anh", 19));
        users.forEach(user -> {
            System.out.println("Name: "+user.getName()+", Age: "+user.getAge());
        });
    }
}
