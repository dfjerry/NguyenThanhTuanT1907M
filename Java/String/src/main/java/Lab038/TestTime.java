/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab038;

/**
 *
 * @author Admin
 */
public class TestTime {
    public static void main(String[] args) {
        Time t = new Time(8,30,30);
        System.out.println("Time "+t.toString());
        t.nextSecond(1);
        System.out.println("Time "+t.toString());
        t.previousSecond(1);
        System.out.println("Time "+t.toString());
    }
}
