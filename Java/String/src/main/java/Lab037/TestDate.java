/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab037;

/**
 *
 * @author Admin
 */
public class TestDate {
    public static void main(String[] args) {
        Date a = new Date(20,12,95);
       
        System.out.println("day "+a.getDay());
        System.out.println("date "+a.toString());
        a.setDate(15, 7, 96);
        System.out.println("date new "+a.toString());
    }
}
