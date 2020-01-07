/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab036;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Account {
    String id;
    String name;
    int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        return amount + balance;
    }
    public int debit(int amount){
        System.out.println("Moi nhap so tien can dung ");
            Scanner a = new Scanner(System.in);
            amount = a.nextInt();
        if(amount<balance){
            
            balance = balance - amount;
            System.out.println("so tien con lai "+balance);
            return balance;
        }else{
            System.out.println("Amount exceeded balance");
            return balance;
        }
     
    }
    public int transfer(String id1, String name1, int balance1, int amount){
         System.out.println("Moi nhap so tien can chuyen ");
            Scanner a = new Scanner(System.in);
            amount = a.nextInt();
        if(amount<balance){
            balance = balance - amount;
           balance1 = balance1 + amount;
            System.out.println("so tien sau khi nhan duoc "+balance1);
            return balance1;
        }else{
            System.out.println("Amount exceeded balance!");
            return balance;
        }
      
    }
    public String toString(){
        return "Account id "+id+"\nname "+name+"balance "+balance;
    }
    
}
