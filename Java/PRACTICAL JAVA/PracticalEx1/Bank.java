package PracticalEx1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Bank {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    private double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public Bank() {

    }

    public double calculateInterest() {
        double interest = this.getBalance() * (rate / 1200);
        return interest;
    }
}
