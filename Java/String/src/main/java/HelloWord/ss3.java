/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWord;

import HelloWord.Helloworld.Direction;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ss3 {
    public static void main(String[] args) {
        //        System.out.println("A \"quoted\" String is \n'much' better tf you learn\nthe rules of \"escape sequences.\"\n\nAlse, \"\" represents an empty String.\nDon't forget use \\\"instead of \" !\n'' is not the same as \"");
        //Code snippet 1
        int rollNumber;
        char gender;
        //Code snippet 2,3     
        rollNumber=101;
        gender='M';
        //Code snippet 4
        int x,y,z;
        int a=5,b,c=10;
        byte num = 20;
        char c1 = 'c';
        //Code snippet 5
        String str="A string data";
        //Code snippet 6
        int empNumber;
        float salary;
        double shareBalance = 4567890.789;
        char gender1 = 'M';
        boolean ownVehicle = false;
        empNumber = 101;
        salary = 6789.50f; 
        System.out.println("EmployeeNumber: "+empNumber);
        System.out.println("Salay: "+salary);
        System.out.println("Gender: "+gender);
        System.out.println("ShareBalance: "+shareBalance);
        System.out.println("Owns vehicle: "+ownVehicle);
        System.out.println("In ra bien rollNumber: "+rollNumber);
        //Code snippet 7
        System.out.println("Java\t Programming \n Language");
        System.out.println("Tom\"Dick\"Harry");
        //Code snippet 8
        System.out.println("\u0048\u0065\u006C\u006C\u006F"+"!\n");
        System.out.println("B1\141ke\"2007\"");
        //Code snippet 9
        final double PI = 3.14159;
        double radius = 5.87;
        double area;
        area = PI * radius * radius;
        System.out.println("area: "+area);
        //Code snippet 10
        Direction direction;
        direction = Direction.East;
        System.out.println("Value: "+direction);
        //Code snippet 11
        int num1 = 5;
        int num2 = 10;
        int sum = num1 + num2;
        System.out.println("The sum of");
        System.out.println(num1);
        System.out.println("and");
        System.out.println(num2);
        System.out.println("is");
        System.out.println(sum);
        System.out.println(".");
        int num3=2;
        sum = num1 + num2 + num3;
        System.out.println("The sum of "+num1+","+num2+"and"+num3+"is"+sum+".");
        //Code snippet 12
        int i = 55 / 22;
    System.out.printf("55/22 = %d %n", i);
        double q = 1.0 / 2.0;
        System.out.printf("1.0/2.0 = %09.3f %n", q);
        q = 5000.0 / 3.0;
        System.out.printf("5000/3.0 = %7.2e %n", q);
        q = -10.0 / 0.0;
        System.out.printf("-10.0/0.0 = %7.2e %n", q);
        //Code snippet 13
        int numm = 2;
        double result = numm * numm;
        System.out.format("The square root of %d is %f.%n",numm,result);
        //Code snippet 14
        Scanner s=new Scanner(System.in);
        System.out.println("Enter s: ");
        int intValue = s.nextInt();
        System.out.println("Enter a decimal number: ");
        float floatValue = s.nextFloat();
        System.out.println("Enter a String value");
        String strValue = s.next();
        System.out.println("Values entered are: ");
        System.out.println(intValue+" " + floatValue + " " + strValue);
        //Code snippet 15
        x = 10;
        x += 5;
        x -= 5;
        x *= 5;
        x /=2;
        x %=2;
        //Code snippet 16
        x = 2+3;
        y= 8-5;
        x = 5*2;
        x = 5/2;
        y = 10%3;
        //Code snippet 17
        int i1 = 5;
        int j = i1++;
        int k = ++i1;
         i = -i;
//         boolean result = false;
//         result =!result;
        //Code snippet 18
        int value1 = 10;
        int value2 = 20;
        System.out.println("value1==value2");
        System.out.println(value1==value2);
        System.out.println("value1!=value2");
        System.out.println(value1!=value2);
        System.out.println("value1>value2");
        System.out.println(value1>value2);
        System.out.println("value1<value2");
        System.out.println(value1<value2);
        System.out.println("value1<=value2");
        System.out.println(value1<=value2);
        //Code snippet 19
        int first = 20;
        int second = 30;
        System.out.println((first==30)&&(second==40));  
        System.out.println((first==30)||(second==40));
        //Code snippet 20
        int x1 = 23;
        int y1 = 12;
        System.out.println("x1&y1:");
        System.out.println(x1&y1);
        System.out.println("x1|y1:");
        System.out.println(x1|y1);
        System.out.println("x1^y1");
        System.out.println(x1^y1);
        int a1=43;
        int b1=1;
        System.out.println("a1>>b1:");
        System.out.println(a1>>b1);
        System.out.println("a1<<b1");
        System.out.println(a1<<b1);
        //Code snippet 21
//        boolean someCondition = true;
//        boolean someCondition;
//        result = someCondition?value1 : value2;
        System.out.println(result);
          //Code snippet 22
          double dbl = 10;
          long lng = 100;
          int in = 10;
          dbl = in;
          lng = in;
          //Code snippet 23
          float a2 = 21.3476f;
          int b2 = (int)a2+5;
    }
}
