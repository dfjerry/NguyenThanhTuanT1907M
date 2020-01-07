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
public class Temprature {
    public static void main(String[] args) {
        //Nhap vao may so ngay + mang? nhiet do;
        Scanner console = new Scanner(System.in);
        System.out.println("Nhap vao so ngay can nhap nhiet do: ");
        int numDays = console.nextInt();
        int [] temps = new int[numDays];
        //Nhap vao gia tri
        int sum = 0;
        for(int i = 0;i<numDays;i++){
            System.out.println("Day"+(i+1)+"'s high temp: ");
            temps[i]=console.nextInt();
            sum+=temps[i];
        } 
        double average = (double) sum / numDays;
        //count days above average
        int above = 0;
        for(int i =0;i<temps.length;i++){
            if(temps[i]>average){
                above++;
            }
        }
        System.out.println("-------------");
        System.out.println("Average = " + average);
        System.out.println(above +" day above averge");
    }
}
