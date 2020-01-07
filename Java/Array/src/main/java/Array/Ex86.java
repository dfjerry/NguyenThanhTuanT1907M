/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Ex86 {
    String[] empID = new String[5];
    public void createArray(){
        System.out.println("CreatingArray. Please wait ...");
        for(int count = 1;count<empID.length;count++){
            empID[count] = "E00"+count;
        }
    }
    public void printArray(){
        System.out.println("The Array is: ");
        for(int count = 1;count<empID.length;count++){
            System.out.println("Employee is: "+empID[count]);
        }
    }
    public static void main(String[] args) {
        Ex86 objEx86 = new Ex86();
        objEx86.createArray();
        objEx86.printArray();
    }
}
