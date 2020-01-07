/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM1;

/**
 *
 * @author Admin
 */
public class Book{
     int bookId;
     String bookName;
     int bookAmount;
     String category;

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookAmount() {
        return bookAmount;
    }

    public String getCategory() {
        return category;
    }
    public Book(int bookId, String bookName, int bookAmount, String category) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAmount = bookAmount;
        this.category = category;
    }
}
