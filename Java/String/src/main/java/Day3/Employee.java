/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

/**
 *
 * @author Admin
 */
public class Employee {
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean maritalStatus;
    void displayEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("=======");
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Age "+employeeAge);
        System.out.println("status "+maritalStatus);
    }
    public static void main(String[] args) {
        Employee objEmp = new Employee();
        objEmp.displayEmployeeDetails();
        
    }
}
