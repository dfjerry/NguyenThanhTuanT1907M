/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab032;

/**
 *
 * @author Admin
 */
public class TestCircle1 {
    public static void main(String[] args) {
        Circle1 c3 = new Circle1(10.0);
        System.out.println("Area: "+c3.getArea()+"\nCircumference"+c3.getCircumference());
        System.out.println(c3.getString());
        c3.setRadius(100);
        System.out.println(c3.getRadius());
    }
}
