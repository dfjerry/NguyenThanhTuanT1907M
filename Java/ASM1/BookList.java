/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM1;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Admin
 */
public class BookList {
    private ArrayList<Book> booklist;
    private ArrayList<BookBorrow> borrows;
    public BookList(){
        this.booklist = new ArrayList<>();
        this.borrows = new ArrayList<>();
    }
  
    public void displayBooklist(){
        booklist.add(new Book(1, "Van", 2, "Van hoc"));
        booklist.add(new Book(2, "Toan", 1, "TOan hoc"));
        booklist.add(new Book(3, "Su", 5, "Su hoc"));
        booklist.add(new Book(4, "Dia", 10, "Dia hoc"));
        booklist.add(new Book(4, "Tin", 2, "Tin hoc"));
        booklist.add(new Book(5, "Sinh", 4, "Sinh hoc"));
        booklist.add(new Book(6, "My thuat", 2, "My thuat hoc"));
        booklist.add(new Book(7, "Tieng ANh", 1, "NN hoc"));
        booklist.add(new Book(8, "Tieng PHap", 8, "NN hoc"));
        booklist.add(new Book(9, "Vat Ly", 7, "Vat ly hoc"));
        System.out.println("Booklist: ");
        for(int i=0;i<this.booklist.size();i++){
            System.out.println(+booklist.get(i).getBookId()
                    +". Ten sach: "+booklist.get(i).getBookName()+"\n"
                    +"The loai sach: "+booklist.get(i).getCategory()+"\n"
                    +"So luong sach: "+booklist.get(i).getBookAmount()
            );
        }
    }
    public int findBook( ){
       String bookName;
       String category;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten sach: ");
        bookName = sc.next();
        System.out.println("Nhap vao the loai sach");
        category = sc.next();
        for(int i=0;i<booklist.size();i++){
            Book booklist = this.booklist.get(i);
            if(booklist.getBookName().equals(bookName)||booklist.getCategory().equals(category)){
                System.out.println(+booklist.getBookId()
                    +". Ten sach: "+booklist.getBookName()+"\n"
                    +"The loai sach: "+booklist.getCategory()+"\n"
                    +"So luong sach: "+booklist.getBookAmount());
                return i;
            }  
        }
        System.out.println("Khong thay sach can tim");
        return -1;
    }
    public boolean borrowBook(){
        String borrowBookID ,studentID, borrowD, borrowBookN, returnD;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma sach can muon : ");
        borrowBookID = sc.next();
        for(int i=0;i<booklist.size();i++){
            if(borrowBookID.equals(booklist.get(i).getBookId())){
                System.out.println("Co sach trong TV");
                System.out.println("Nhap ma sinh vien: ");
                studentID = sc.next();
                System.out.println("Ngay muon sach: ");
                borrowD = sc.next();
                borrowBookID = booklist.get(i).getBookId();
                borrowBookN = booklist.get(i).getBookName();
                System.out.println("Nhap vao ngay tra sach:  ");
                returnD = sc.next();
                return true;
            }
        }
        System.out.println("Khong tim thay sach can muon");
        return false;
    }
    public int showstudentBook(){
        String stdID;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sv : ");
        stdID = sc.next();
        for(int i=0;i<booklist.size();i++){
            BookBorrow borrowBooks = borrows.get(i);
            if(borrowBooks.getStudentID().equals(stdID)){
                System.out.println("Danh sach nhung sv muon sach : "+borrowBooks.getStudentID());
                System.out.println("BookID:"+borrowBooks.getBookID()+"\nBookName:"+borrowBooks.getBookName()+"\nBorrowDate: "+borrowBooks.getBorrowDate()+"\nReturn Date:"+borrowBooks.getReturnDate());
                return i;
            }
        }
        System.out.println("Khong co sv nao muon sach!");
        return -1;
    }
}



 
