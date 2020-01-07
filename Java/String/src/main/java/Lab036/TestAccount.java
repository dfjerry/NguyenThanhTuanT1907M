/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab036;

/**
 *
 * @author Admin
 */
public class TestAccount {
    public static void main(String[] args) {
        Account b = new Account("1", "Tuan", 10);
        b.debit(2);
        b.transfer("2", "Tr Anh", 10, 13);
    }
}
