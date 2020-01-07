/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Collections;
import java.util.Iterator;
/**
 *
 * @author Admin
 */
public class Ex83 {
    Ex83 marks = new Ex83();
    public void storeMarks(){
        System.out.println("Storing marks.Please wait...");
        marks.add(67);
        marks.add(50);
        marks.add(45);
        marks.add(70);
    }
    public void displayMarks(){
        System.out.println("Marks are: ");
        System.out.println("Iterating ArrayList using for loop: ");
        for(int i=0;i<marks.size();i++){
            System.out.println(marks.get(i));
        }
        System.out.println("--------------------");
        Iterator imarks = marks.iterator();
        System.out.println("Iterating ArrayList using iterating: ");
        while(imarks.hasNext()){
            System.out.println(imarks.next());
        }
        System.out.println("-----------");
//        Collections.sort(marks);
        System.out.println("Sorted list is: "+marks);
    }
    
    private void add(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        Ex83 objEx83 = new Ex83();
        objEx83.storeMarks();
        objEx83.displayMarks();
    }
}
