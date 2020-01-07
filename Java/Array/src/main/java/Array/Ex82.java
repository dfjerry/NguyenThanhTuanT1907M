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
public class Ex82 {
    int marks[][];
    public void storeMarks(){
        marks = new int[4][2];
        System.out.println("Storing Marks. Please wait...");
        marks[0][0]=23;
        marks[0][1]=24;
        marks[1][0]=25;
        marks[1][1]=26;
        marks[2][0]=27;
        marks[2][1]=28;
        marks[3][0]=29;
        marks[3][1]=30;
    }
    public void displayMarks(){
        System.out.println("Marks are ");
        System.out.println("Roll no.1: "+marks[0][0]+","+marks[0][1]);
        System.out.println("Roll no.2: "+marks[1][0]+","+marks[1][1]);
        System.out.println("Roll no.3: "+marks[2][0]+","+marks[2][1]);
        System.out.println("Roll no.4: "+marks[3][0]+","+marks[3][1]);
    }
    public void displayMarks1(){
          System.out.println("Marks are: ");
        for(int count=0;count<marks.length;count++){
            System.out.println(""+marks[count]);
        }
    }
    public void displayMarks2(){
        System.out.println("Marks are ");
        for(int row = 0;row<marks.length;row++){
            System.out.println("Roll no."+(row+1));
            for(int col = 0;col<marks[row].length;col++){
                System.out.println(marks[row][col]);
            }
        }
    }
//    public void displayMarks3(){
//        System.out.println("Marks are: ");
//        for(int value:marks){
//            System.out.println(value);
//        }
//    }
    public void totalMarks(){
        
        System.out.println("Total Marks are: ");
        for(int row = 0;row<marks.length;row++){
                        int sum=0;

            System.out.println("Roll no."+(row+1));
            for(int value:marks[row]){
                sum+=value;
            }
             System.out.println(sum);
        }
       
    }
    public static void main(String[] args) {
        Ex82 objEx82 = new Ex82();
        objEx82.storeMarks();
        objEx82.displayMarks();
        objEx82.displayMarks1();
        objEx82.displayMarks2();
//        objEx82.displayMarks3();
        objEx82.totalMarks();
    }
}
