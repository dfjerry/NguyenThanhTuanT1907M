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
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle objR1 = new Rectangle();
        objR1.setLenght(0.5f);
        objR1.setWidth(0.7f);
        System.out.println("Width "+objR1.getWidth()+"\nLength"+objR1.getLenght()+"\nPerimeter"+objR1.getPerimeter());
        System.out.println("===========");
        System.out.println(objR1.toString());
    }
}
