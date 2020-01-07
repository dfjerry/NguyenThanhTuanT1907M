/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab035;

/**
 *
 * @author Admin
 */
public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem aItem = new InvoiceItem("1","Bim Bim",2,12.0);
        System.out.println("id "+aItem.getid());
        System.out.println("total "+aItem.getTotal());
        System.out.println("qty "+aItem.getqty());
        System.out.println("To string "+aItem.toString());
        aItem.setqty(100);
         System.out.println("To string "+aItem.toString());
    }
}
