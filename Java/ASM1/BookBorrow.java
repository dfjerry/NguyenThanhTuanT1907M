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
public class BookBorrow {
    public String studentID;
    public String BorrowDate;
    public String ReturnDate;
    public String bookId;
    public String bookName;

    public BookBorrow(String studentID, String borrowDate, String returnDate,String bookId,String bookName) {
        this.studentID = studentID;
        this.BorrowDate = borrowDate;
        this.ReturnDate = returnDate;
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public BookBorrow(){
        
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookID() {
        return bookId;
    }

    public void setBookID(String bookID) {
        this.bookId = bookID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getBorrowDate() {
        return BorrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        BorrowDate = borrowDate;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(String returnDate) {
        ReturnDate = returnDate;
    }
}
