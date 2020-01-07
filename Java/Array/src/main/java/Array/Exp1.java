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
public class Exp1 {
    public void add(int num1, int num2){
        int num3;
        num3 = num1 + num2;
        System.out.println("Addition is "+num3);
    }
    public void sub(int num1, int num2){
        int num3;
        num3 = num1 - num2;
        System.out.println("Phep tru "+num3);
    }
    public void mul(int num1, int num2){
        int num3;
        num3 = num1*num2;
        System.out.println("Phep nhan "+num3);
    }
    public void div(int num1, int num2){
        int num3;
        num3 = num1/num2;
        System.out.println("Phep chia "+num3);
    }
    public void setVal(int num1){
        num1 = num1 + 10;
        System.out.println("num1 "+num1);
    }
    public double getPI(){
        return 3.14;
    }
    public void calcArea(Exp1 objPi, double rad){
        double area = objPi.getPI()*rad*rad;
        System.out.println("Area of the circle is: "+area);
    }
    private double PI = 3.14;
    public double getPI(double PI){
        return PI;
    }
    public void addNumber(int...num){
         int sum = 0;
         for(int i:num){
             sum = sum + i;
         }
         System.out.println("Sum of numbers is: "+sum);
    }
    public double calcArea(double rad){
        return(3.14*rad*rad);
    }
    public static void main(String[] args) {
        Exp1 objExp1 = new Exp1();
        objExp1.add(3, 4);
        objExp1.div(4,2);
        objExp1.mul(2, 4);
        objExp1.sub(2, 4);
        objExp1.setVal(1);
        Exp1 objp1 = new Exp1();
        objp1.calcArea(new Exp1(), 2);
        Exp1 obj6  = new Exp1();
        obj6.addNumber(10,30,20,40,50,60);
    }
}
