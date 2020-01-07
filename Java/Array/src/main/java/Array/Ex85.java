/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Ex85 {
    StringBuilder str = new StringBuilder("JAVA");
    public void displayStrings(){
        System.out.println("AppendedString is "+str.append("7"));
        System.out.println("Inserted String is "+str.insert(5, "SE"));
        System.out.println("Deleted String is "+str.delete(4, 7));
        System.out.println("Reverse String is "+str.reverse());
    }
    public static void main(String[] args) {
        Ex85 objEx85 = new Ex85();
        objEx85.displayStrings();
    }
}
