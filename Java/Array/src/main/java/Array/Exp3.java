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
public class Exp3 {
    int rollNo;
    String name;
    String address;
    float marks;
    public Exp3(){
        rollNo = 0;
        name = "";
        address = "";
        marks = 0;
    }
    public Exp3(int rNo, String name){
        rollNo = rNo;
        name = name;
    }
    public Exp3(int rNo, float score){
        rollNo = rNo;
        marks = score;
    }
    public Exp3(String sName, String addr){
        name = sName;
        address = addr;
    }
    public Exp3(int rNo, String sname, float score){
        rollNo = rNo;
        name = sname;
        marks  = score;
    }
    public void displayDetails(){
        System.out.println("Rollno: "+rollNo);
        System.out.println("Student name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Score "+marks);
        System.out.println("=========");
    }
    float area;
    public float getPI(){
        return 3.14F;
    }
    public void calcArea(int rad){
        this.area = getPI()*rad*rad;
    }
    public void calcArea1(int rad){
        this.area = this.getPI()*rad*rad;
    }
    private float rad;
    private float PI;
    
    public Exp3(float r){
        this();
        rad = r;
    }
//    public Exp3(float rad){
//        this();
//        this.rad = rad;
//    }
    public static void main(String[] args) {
        Exp3 objExp3 = new Exp3("David", "TTT");
        objExp3.displayDetails();
        Exp3 objExp31 = new Exp3(103,46);
        objExp31.displayDetails();
        Exp3 objExp32 = new Exp3(104,"roger",50);
        objExp32.displayDetails();
    }
    
}
