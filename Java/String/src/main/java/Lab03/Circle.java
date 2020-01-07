/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

/**
 *
 * @author Admin
 */
public class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    
    public String getColor(){
        return color;
    }
    public double getArea(){
        return radius  * radius * Math.PI;
    }
    
}
