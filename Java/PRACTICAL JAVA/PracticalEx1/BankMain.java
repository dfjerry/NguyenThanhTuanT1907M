/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticalEx1;

import java.util.Scanner;

/**
 *
 * @author NguyenThanhTuan
 */
public class BankMain {
    public static void main(String[] args) {
        Bank objBank = new Bank();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter balance: ");
        objBank.setBalance(scanner.nextDouble());
        System.out.println("Enter rate: ");
        objBank.setRate(scanner.nextDouble());
        System.out.println("Interest: ");
        System.out.println(objBank.calculateInterest());
    }
}
