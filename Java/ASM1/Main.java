/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM1;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int choose;
        StudentList objStudent = new StudentList();
        BookList objBookList = new BookList();
        Scanner sc = new Scanner(System.in);
        objStudent.disPlayStudent();
        objBookList.displayBooklist();
        while (objStudent.studenLogin() != true) {            
            
        }
        for(;;){
            System.out.println("-MENU");
            System.out.println("1: Hien thi thu vien sach");
            System.out.println("2: Tim sach");
            System.out.println("3: Muon sach");
            System.out.println("4: Hien thi nhung sinh vien muon sach");
            System.out.println("5: Exit");
            System.out.println("Chon chuc nang:");
            choose = sc.nextInt();
            switch(choose){
                 case 1:
                    objBookList.displayBooklist();
                    break;
                case 2:
                    objBookList.findBook();
                    break;
                case 3:
                    objBookList.borrowBook();
                    break;
                case 4:
                    objBookList.showstudentBook();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
       
    }
}
