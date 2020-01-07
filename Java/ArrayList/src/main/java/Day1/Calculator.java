/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gia tri cua mang");
        int numArray = sc.nextInt();
        int[] ArrayList = new int[numArray];
        int sum = 0;
        for(int i = 0;i<numArray;i++){
            System.out.println("Arraylist"+(i+1));
            ArrayList[i]=sc.nextInt();
            sum+=ArrayList[i];
        } 
        for(int i=0;i<ArrayList.length;i++){
            sum = sum+i;
        }
        double Average;
        Average = sum/numArray;
        System.out.println("Gia tri trung binh cua mang "+Average);
        for(int i=0;i<numArray;i++){
            System.out.printf("\nGia tri ArrayList[%d] cua mang la: %d",i,ArrayList[i]);
        }
    }
}
