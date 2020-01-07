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
public class Rectangle {
   
//    int customerID;
//    String customerName;
//    String customerAddress;
//    int customerAge;
//    public ss6(int customerID,String customerName, String customerAddressString, int customerAge){
//          this.customerID = customerID;
//        this.customerName = customerName;
//        this.customerAddress = customerAddress;
//        this.customerAge = customerAge;
//    }
//  void changeCustomerAddress(String address){
//      customerAddress = address;
//      System.out.println("dc"+customerAddress);
//  }
//  void displayCustomerInformation(){
//      System.out.println("Ma"+customerID);
//      System.out.println("ten"+customerName);
//      System.out.println("dc"+customerAddress);
//      System.out.println("tuoi"+customerAge);
//  }
//    public static void main(String[] args) {
//        ss6 objCustomer = new ss6(5, "Tuan", "Van Mon", 25);
//       objCustomer.customerID = 100;
//       objCustomer.customerName = "John";
//       objCustomer.customerAddress = "Paris";
//       objCustomer.customerAge = 26;
//       objCustomer.displayCustomerInformation();
//       objCustomer.changeCustomerAddress("Bac Ninh");
//        System.out.println("\n");
//       objCustomer.displayCustomerInformation();
//    }
    
            //code snippet 6
//    int width;
//    int height;
    private int width;
    private int height;
    Rectangle(){
        System.out.println("Constructor Invoked...");
        width = 10;
        height = 10;
       
    }

    public Rectangle(int wid, int heig) {
        width = wid;
        height = heig;
    }
    void displayDimensions(){
        System.out.println("Width: "+width);
        System.out.println("Height" +height);
    }
    public static void main(String[] args) {
//        Rectangle objRec = new Rectangle();
//        System.out.println("Width: " + objRec.width);
//        System.out.println("Height: " + objRec.height);
    }

}
