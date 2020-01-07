/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

/**
 *
 * @author Admin
 */
public class RectangleInstances {
    
    public static void main(String[] args) {
        Rectangle ObjRec1 = new Rectangle(10,20);
        Rectangle ObjRec2 = new Rectangle(6,9);
        System.out.println("\nRectangle1 Details");
        System.out.println("======");
        ObjRec1.displayDimensions();
        System.out.println("======");
        ObjRec2.displayDimensions();
        Rectangle objRec1 = new Rectangle(10,20);
        Rectangle objRec2;
        ObjRec2 = ObjRec1;
        System.out.println("\nRectangle 1");
        System.out.println("=========");
        ObjRec1.displayDimensions();
        System.out.println("==========");
        ObjRec2.displayDimensions();
    }
    
}
