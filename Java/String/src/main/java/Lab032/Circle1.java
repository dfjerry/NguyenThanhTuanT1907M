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
public class Circle1 {
    double radius = 1.0;
    public Circle1(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double ras){
        radius = ras;
    }
    public double getCircumference(){
        return radius * 2 * Math.PI;
    }
     public double getArea(){
        return radius  * radius * Math.PI;
    }
    public String getString(){
        return "Circle: Radius ="+ getRadius();
    }
}
