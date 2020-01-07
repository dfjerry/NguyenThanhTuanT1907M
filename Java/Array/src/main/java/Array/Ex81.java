/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Admin
 */
public class Ex81 {
    int marks[];
    public void storeMarks(){
        marks = new int[4];
        System.out.println("Storing marks. Please wait...");
        marks[0]=1;
        marks[1]=2;
        marks[2]=3;
        marks[3]=4;
    }
    public void displayMarks(){
        System.out.println("Marks are: ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
    }
    public static void main(String[] args) {
        Ex81 objEx81 = new Ex81();
        objEx81.storeMarks();
        objEx81.displayMarks();
    }
}
