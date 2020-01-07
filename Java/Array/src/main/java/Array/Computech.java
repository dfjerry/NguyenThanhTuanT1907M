/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Computech {
    int EmployeeId;
    String EmployeeName;
    String designation;
    int Basicsalary;
    int salesDone;
    int Commission;
    int totalsalary;

    public Computech(int EmployeeId, String EmployeeName, String designation, int Basicsalary, int salesDone, int Commission, int totalsalary) {
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.designation = designation;
        this.Basicsalary = Basicsalary;
        this.salesDone = salesDone;
        this.Commission = Commission;
        this.totalsalary = totalsalary;
    }
    
    

    
    public void totalSalary(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao so luong ma nhan vien da ban duoc: ");
//        salesDone = sc.nextInt();
        if(salesDone>=10000){
            totalsalary = (int) (Basicsalary *1.3);
        }else if(salesDone>=8000){
            totalsalary = (int) (Basicsalary *1.3);
        }else if(salesDone>=6000){
            totalsalary = (int) (Basicsalary *1.2);
        }else if(salesDone>=4000){
            totalsalary = (int) (Basicsalary *1.1);
        }else if(salesDone<4000){
            totalsalary = (int) (Basicsalary*0.9);
        }
        System.out.println("Tong luong "+totalsalary);
    }
    public static void main(String[] args) {
        Computech Tuan = new Computech(1,"Tuan","Leader",40,10001,1,0);
        Computech Thang = new Computech(2, "Thang", "Tester", 20, 2000, 0, 0);
        Tuan.totalSalary();
        Thang.totalSalary();
    }
}
