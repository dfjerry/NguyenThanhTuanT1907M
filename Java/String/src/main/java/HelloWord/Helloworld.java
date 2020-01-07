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
public class Helloworld {
    enum Direction {
    East, West, North, South
    }
    public static void main(String[] args) {
        System.out.println("A \"quoted\" String is \n'much' better tf you learn\nthe rules of \"escape sequences.\"\n\nAlse, \"\" represents an empty String.\nDon't forget use \\\"instead of \" !\n'' is not the same as \"");
        int rollNumber;
        char gender;
        rollNumber=101;
        gender='M';
        String str="A string data";
        System.out.println("In ra bien rollNumber: "+rollNumber);
        final double PI = 3.14159;
        double radius = 5.87;
        double area;
        area = PI * radius * radius;
        System.out.println("area: "+area);
        Direction direction;
        direction = Direction.East;
        System.out.println("Value: "+direction);
        int i = 55 / 22;
        // Decimal integer
        System.out.printf("55/22 = %d %n", i);
        // Pad with zeros
        double q = 1.0 / 2.0;
        System.out.printf("1.0/2.0 = %09.3f %n", q);
        // Scientific notation
        q = 5000.0 / 3.0;
        System.out.printf("5000/3.0 = %7.2e %n", q);
        // Negative infinity
        q = -10.0 / 0.0;
        System.out.printf("-10.0/0.0 = %7.2e %n", q);
        int num = 2;
        double result = num * num;
        System.out.format("The square root of %d is %f.%n",num,result);
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter s: ");
        int intValue = s.nextInt();
        System.out.println("Enter a decimal number: ");
        float floatValue = s.nextFloat();
        System.out.println("Enter a String value");
        String strValue = s.next();
        System.out.println("Values entered are: ");
        System.out.println(intValue+" " + floatValue + " " + strValue);
        
        int value1 = 10;
        int value2 = 20;
        System.out.println("value1==value2");
        System.out.println(value1==value2);
        System.out.println(value1 <= value2);
        
        int first = 20;
        int second = 30;
        System.out.println((first==30)&&(second==40));  
        System.out.println((first==30)||(second==40));
    }
}
