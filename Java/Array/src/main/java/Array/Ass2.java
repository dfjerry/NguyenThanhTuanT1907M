/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
package Array;

import java.util.Scanner;

public class Ass2 {
    public static void main(String[] args) {
//        String string = new String(data);
//        String string = "Hello";
//        char data[] = {'H','e','l','l','o'};
//        
          String empName;
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhap vao EmpName: ");
          empName = sc.nextLine();
          System.out.println("EmpName: "+empName);
          int doDai;
          doDai = empName.length();
          System.out.println("Do dai: "+doDai);
    }
}
