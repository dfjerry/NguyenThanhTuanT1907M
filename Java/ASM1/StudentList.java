/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentList {
    private ArrayList<Student> student;
    public StudentList(){
        this.student = new ArrayList<>();
    }
    public boolean studenLogin(){
        String id;
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao username: ");
        id = sc.next();
        System.out.println("Nhap vao password: ");
        password = sc.next();
        for(int i=0;i<student.size();i++){
            if(id.equals(student.get(i).getUserName()) & password.equals(student.get(i).getPassWord())){
            System.out.println("Login success");   
            return true;
            }
        }
        System.out.println("Login Fail");
        return false;

    }
    public void disPlayStudent(){
        student.add(new Student("tuan","1", "Nguyen Thanh Tuan"));
        student.add(new Student("thang","2","Nguyen Minh Thang"));
        student.add(new Student("tranh","3","Nguyen Trung Anh"));
        student.add(new Student("thang","4","Nguyen Tien Dat"));
        student.add(new Student("thang","5","Nguyen Van Phu"));
        System.out.println("Student: ");
        for(int i=0;i<this.student.size();i++){
            System.out.println("Username: "+this.student.get(i).getUserName()+"\n"
                              +"Full name: " + this.student.get(i).getFullName()
            );
        }
    }
}
