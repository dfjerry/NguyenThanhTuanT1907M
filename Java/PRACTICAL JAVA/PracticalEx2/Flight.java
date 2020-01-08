/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticalEx2;

/**
 *
 * @author NguyenThanhTuan
 */
public class Flight {    
    private int number = 0;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }  
    private String destination = "";
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }
    public void displayFlight(){
        System.out.println(+number +", " +destination);
    }
}
