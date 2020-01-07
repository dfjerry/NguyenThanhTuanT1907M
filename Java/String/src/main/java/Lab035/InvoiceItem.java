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
public class InvoiceItem {
    String id;
    String desc;
    int qty;
    double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public String getid(){
    return id;
}
    public String desc(){
        return desc;
    }
    public int getqty(){
        return qty;
    }
    public double getunitPrice(){
        return unitPrice;
    }
    public void setqty(double q){
        q = qty;
    }
    public double getTotal(){
        return qty * unitPrice;
    }
    public String toString(){
        return "InvoiceItem: id "+id+"\ndesc "+desc+"\nqty"+qty+"\nunitPrice "+unitPrice;
    }
}
