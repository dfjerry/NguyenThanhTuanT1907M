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
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Thanh","Tuan",100);
        System.out.println(e1.fullName());
        System.out.println(e1.getSalary());
        System.out.println(e1.getAnnualSalary());
      
        
    }
}
