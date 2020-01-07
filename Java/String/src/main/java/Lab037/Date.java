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
public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

 
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day1){
        day1 = day;
    }
    public void setMonth(int Mo){
        Mo = month;
    }
    public void setYear(int Ye){
        Ye = year;
    }
    public void setDate(int day1, int Mo, int Ye){
         day = day1;
        month =Mo;
        year = Ye;
    }
    public String toString(){
        return "dd/mm/yy "+day +"//"+ month+"//"+year;
    }
}
