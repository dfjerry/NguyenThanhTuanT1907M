/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Ex84 {
        String st = "Hello";
        String str1 = " World";
        Integer StrLength = 5;
    public void displayString(){
        System.out.println("String length is "+StrLength);
        System.out.println("Character at index 2 is "+st.length());
        System.out.println("Concatenated string is: "+st.concat(" World"));
        System.out.println("Compareto string is: "+st.compareTo("World"));
        System.out.println("Index of string "+st.indexOf("o"));
        System.out.println("Last index of "+st.lastIndexOf("1"));
        System.out.println("Replaced string "+st.replace('e', 'a'));
        System.out.println("Substring is "+st.substring(2,5));
        System.out.println("Interger to string "+StrLength.toString());
        String str1 = "Hello";
        System.out.println("Trimmed to "+str1.trim());
    }
    public static void main(String[] args) {
        Ex84 objEx84 = new Ex84();
        objEx84.displayString();
     
    }
}
