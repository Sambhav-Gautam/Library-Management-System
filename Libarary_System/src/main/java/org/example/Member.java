package org.example;
import java.util.ArrayList;
import java.util.Scanner;


public class Member {
    private static long prevstudent=0;
    private String name;
    private int age;
    private long phone_no;
    private long ID;
    private long[] Borrowed_Books = new long[2];
    private long[] issuetime = new long[2];
    private boolean[] book_returned ={false,false};
    
    public boolean[] getBook_returned() {
        return book_returned;
    }
    public void setBook_returned(boolean[] book_returned) {
        this.book_returned = book_returned;
    }
    public long[] getIssuetime() {
        return issuetime;
    }
    public void setIssuetime(long[] issuetime) {
        this.issuetime = issuetime;
    }
    private long[] Fines = new long[2];
    
    public long[] getFines() {
        return Fines;
    }
    public void setFines(long[] fines) {
        Fines = fines;
    }
    public long[] getBorrowed_Books() {
        return Borrowed_Books;
    }
    public void setBorrowed_Books(long[] borrowed_Books) {
        Borrowed_Books = borrowed_Books;
    }
    Scanner sc = new Scanner(System.in);
    public boolean processMembers(ArrayList<Member> members) {
        // Access and process the members ArrayList 
        boolean phoneExists = false;
        for (Member member : members){
            if (member.Get_Phone()==this.Get_Phone()){
                phoneExists = true;
                break; // Exit the loop once a match is found
            }
        }
        if (phoneExists) {
            return true; //True if phone number exists
        } else {
            return false; //false if donot exists
            
        }
    }
    public Member(){
        System.out.print("Enter Name:");
        this.name = sc.nextLine();

        System.out.print("Enter Age:");
        this.age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Phone_Number:");
        this.phone_no = sc.nextLong();

        //static variable prevstudent which stores the the Id of prev stduent 
        this.ID=++prevstudent;
    }
    //Getter Methods
    public long Get_ID(){
        return this.ID;
    }
    public String Get_Name(){
        return this.name;
    }

    public int Get_Age(){
        return this.age;
    }
    public long Get_Phone(){
        return this.phone_no;
    }

    //Setter Methods
    
    public void Set_Name(String name){
        this.name = name;
    }
    public void Set_Age(int age){
        this.age = age;
    }
    public void Set_Phone(int Phone){
        this.phone_no = Phone;
    }
}
