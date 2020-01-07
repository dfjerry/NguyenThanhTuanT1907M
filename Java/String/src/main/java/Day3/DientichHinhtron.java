/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DientichHinhtron {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius;
        Scanner b = new Scanner(System.in);
        double area;
        System.out.println("Nhap vao ban kinh: ");
        radius = b.nextDouble();
        area = PI * radius * radius;
        System.out.println("Dien tich la: "+area);
    }
}
