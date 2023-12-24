package org.example;
import java.util.ArrayList;
public class Books {
    static ArrayList<Book> Present_Books = new ArrayList<Book>();
    //View Book with Book ID
    public static void View_Book_With_ID(long Book_ID_To_Search){
        for(int i=0;i<Present_Books.size();i++){
            if(Present_Books.get(i).getBook_ID()==Book_ID_To_Search){
                System.out.println(Present_Books.get(i).getTitle()+"\t\t"+Present_Books.get(i).getBook_ID()+"\t\t"+Present_Books.get(i).getAuthor()+"\t\t");
            }
        }
    }
    
    //Add the books
    public void AddBook(String title,String author,int copies_tobeadded){
        Book new_book = new Book(title,author,copies_tobeadded);
        Present_Books.add(new_book);
    }
    //Remove Book
    public static void RemoveBook(int book_id){
        boolean remove_book = false;
        for(int i=0;i<Present_Books.size();i++){
            Book book1 = Present_Books.get(i);
            if(book1.getBook_ID()==book_id){
                if(book1.getTotal_copies()==0){
                    System.out.println("Error: The book has been issued by someone There are no more copies to Remove..");
                }
                else if(book1.getTotal_copies()==1){
                    Present_Books.remove(i);
                    remove_book =true;
                    i--;
                }
                else{
                    book1.setTotal_copies(book1.getTotal_copies()-1);
                    remove_book = true;
                }
            }
        }
        //Error Handling
        if(remove_book){
            System.out.println(".......................................\n"+".......................................");
            System.out.println("Book with ID"+book_id+"Has been removed succesfully");
            System.out.println(".......................................\n"+".......................................");
        }
        else{
            System.out.println(".......................................\n"+".......................................");
            System.out.println("No Book with ID"+book_id+"is presnt in library");
            System.out.println(".......................................\n"+".......................................");
        }
    }
    //View All Books
    public static void View_All_Books(){
        System.out.println("Book Title\t\t"+"Book Author\t\t"+"Book ID\t\t"+"Book Copies\t\t");
        for(Book books:Present_Books){
            System.out.println(books.getTitle()+"\t\t\t"+books.getAuthor()+"\t\t\t"+books.getBook_ID()+"\t\t\t"+books.getTotal_copies());
        }
    }
}
