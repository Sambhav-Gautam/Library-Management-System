package org.example;
import java.util.Scanner;

public class Book {
    //Encapsulation
    private static long Prev_BOOK_ID=333;
    private long book_ID;
    private String title;
    private String author;
    private int total_copies;
    Scanner sc = new Scanner(System.in);
    //Constructor 1
    public Book(String title,String author,int total_copies){
        this.author = author;
        this.title = title;
        this.total_copies = total_copies;
        this.book_ID =++Prev_BOOK_ID;
    }
    //Constructor 2
    public Book(){
        this.book_ID = ++Prev_BOOK_ID;
        System.out.print("Enter Book_Title::");
        this.title = sc.nextLine();
        System.out.print("Enter Book_Author::");
        this.author = sc.nextLine();
        System.out.print("Enter Total_Copies::");
        this.total_copies = Integer.parseInt(sc.nextLine());//to be tested
    }
    
    //Getter Methods
    public long getBook_ID() {
        return book_ID;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getTotal_copies() {
        return total_copies;
    }

    //Setter Methods
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setBook_ID(long book_ID) {
        this.book_ID = book_ID;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setTotal_copies(int total_copies) {
        this.total_copies = total_copies;
    }

}
