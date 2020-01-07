/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {  
    String userName;
    public String getUserName() {
        return userName;
    }
     
    String passWord;

    public String getPassWord() {
        return passWord;
    }
   
    String fullName;

    public String getFullName() {
        return fullName;
    }
   

    public Student(String userName, String passWord, String fullName) {
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
    }

    public Student() {
    }
    
    
    
    
}
