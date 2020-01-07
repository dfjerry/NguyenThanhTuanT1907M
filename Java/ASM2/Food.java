/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Food { 
    private String Food;

  
    public String getFood() {
        return Food;
    }
    public void setFood(String Food) {
        this.Food = Food;
    }
    private String Money;
    public String getMoney() {
        return Money;
    }
    public void setMoney(String Money) {
        this.Money = Money;
    }
    private String Payment;
    public String getPayment() {
        return Payment;
    }
    public void setPayment(String Payment) {
        this.Payment = Payment;
    }    
    private int amount;
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Food(String Food, String Payment, int amount) {
        this.Food = Food;
        this.Payment = Payment;
        this.amount = amount;
    }

    

    public Food() {
    }
    

    
}
