/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestCircle {
    public static void main(String[] args) {
        double radius = 300;
        Circle c1 = new Circle(radius, "red");
        System.out.println("The cricle radius "+c1.getRadius()+"\nAnd area "+c1.getArea() +"\n Color "+c1.getColor());
        Circle c2 = new Circle(10,"black");
        System.out.println("The cricle radius "+c2.getRadius()+"\nAnd area "+c2.getArea()+"\n Color "+c2.getColor());
        
    }
}
