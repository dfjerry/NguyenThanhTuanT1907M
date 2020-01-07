/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab034;

/**
 *
 * @author Admin
 */
public class Employee {
    int id;
    String fistName;
    String lastName;
    int salary;
    public Employee(int id, String fistName, String lastName,int salary){
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getID(){
        return id;
    }
    public String firstName(){
        return fistName;
    }
    public String lastName(){
        return lastName;
    }
    public String fullName(){
        return fistName + lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int Sa){
        salary = Sa;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public int raiseSalary(int percent){
        return salary * percent;
    }
    public String toString(){
        return "Employee: id "+id+"\nFist Name "+fistName+"\nLast name "+lastName+"\nSalary "+salary;
    }
}
