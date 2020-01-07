/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWord;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tinhtong {
    public static void main(String[] args) {
        int num1, num2;
        Scanner a =new Scanner(System.in);       
        System.out.println("Nhap vao gia tri num1: ");
        num1 = a.nextInt();
        System.out.println("Nhap vao gia tri num2: ");
        num2 = a.nextInt();
        int sum = 0;
        sum = num1 + num2;
        System.out.printf("Tong hai gia tri %d + %d = %d",num1,num2,sum);
    
    }
    
}
