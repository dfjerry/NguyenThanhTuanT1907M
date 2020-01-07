/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Admin
 */
public class Exp2 {
    int empID;
    String empName;
    private String SSN;
    protected String empDesig;
    public void Employee(int ID, String name){
        empID = ID;
        empName = name;
    }
    public String getSSN(){
        return SSN;
    }
    public void setSSN(String ssn){
        SSN = ssn;
    }
    public void setDesignation(String desig){
        empDesig = desig;
    }
    public void display(){
        System.out.println("Employy ID: "+empID);
        System.out.println("Employee name is: "+empName);
        System.out.println("Designation is "+empDesig);
        System.out.println("SSN is "+SSN);
    }
    public void add(int num1, int num2){
        System.out.println("Result after addition is: "+(num1+num2));
    }
    public void add(int num1, int num2, int num3){
        System.out.println("Result after addition is "+(num1+num2+num3));
    }
    public void add(float num1, int num2){
        System.out.println("Result after addition is "+(num1+num2));
    }
    public static void main(String[] args) {
        Exp2 objExp2 = new Exp2();
        objExp2.empDesig = "Manager";
        objExp2.SSN = "281-72-3873";
        objExp2.display();
        objExp2.add(1.2F, 2);
        objExp2.add(4, 5);
        objExp2.add(6, 7, 8);
    }
}
