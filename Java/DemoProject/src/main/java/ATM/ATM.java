/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ATM {
    String id;
    String password;
    int balance;

    public ATM(String id, String password, int balance) {
        this.id = id;
        this.password = password;
        this.balance = balance;
    }
    public String getID(){
        return id;
    }
  
    public String getpassWord(){
        return password;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public String toString(){
        return "So tk: "+id+"So du: "+balance;
    }
    public int rutTien(int st){
        if(balance < st){
            System.out.println("Tai khoan khong du tien de rut!!");
            return 0;
        }else{
            balance = balance - st;
            return balance;
        }
    }
    public void napTien(int st){
        System.out.printf("Nhap so tien can nap vao TK:%d ",st);
        System.out.printf("Tong so tien trong TK: ", balance = st + balance);
    }
    public static boolean CK(ATM tuan, ATM thang){
        Scanner st = new Scanner(System.in);
        System.out.println("Nhap so tien can ck: ");
        int amount = st.nextInt();
        if(tuan.getBalance()>amount){
            tuan.setBalance(tuan.getBalance() - amount);
            thang.setBalance(thang.getBalance() + amount);
            return true;
        }else{
            return false;
        }
            
    }
 
    public static void main(String[] args) {
        ATM tuan = new ATM("123","tuan",100);
        ATM thang = new ATM("124","thang",200);
       
        Scanner amount = new Scanner(System.in);
       
        String nhapId;
        String nhapPassword;

        do { 
            System.out.println("Sai id hoac password moi ban nhap lai");
        System.out.println("id: ");
        nhapId = amount.next();
        System.out.println("password: ");
        nhapPassword = amount.next();
        System.out.println("id: "+nhapId);
        System.out.println("nhap pass: "+nhapPassword);
        } while (!(nhapId.equals(tuan.getID()) & nhapPassword.equals(tuan.getpassWord())));
        System.out.println("Ban da dang nhap thanh cong!!!");
        
        
    
        tuan.rutTien(10);
        System.out.println(""+tuan.getBalance());
        
        CK(tuan, thang);
        System.out.println("TK tuan"+tuan.getBalance());
        System.out.println("TK thang "+thang.getBalance());
    
}
}
