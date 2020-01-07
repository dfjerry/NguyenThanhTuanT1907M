/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab033;

/**
 *
 * @author Admin
 */
public class Rectangle {
    float length = 0.1f;
    float width = 0.1f;

 
    public float getLenght(){
        return length;
    }
    public float getWidth(){
        return width;
    }
    public void setLenght(float le){
        length = le;
    }
    public void setWidth(float wi){
        width = wi;
    }
    public float getArea(){
        return length * width;
    }
    public float getPerimeter(){
        return (length+width)*2;
    }
    public String toString(){
        return "Rectangle: width "+width+"\nlength"+length+"\nArea"+getArea()+"\nPerimeter"+getPerimeter();
    }
}
