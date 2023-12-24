package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Librariran {
    static ArrayList<Member> Present_Members = new ArrayList<Member>();
    public static void function_for_librarian(){
        Scanner sc = new Scanner(System.in);
        while(true){
            Library_interface.Librarian_options();
            int lib_choice=0; 
            //validating Lib_input
            boolean valid_lib_input= false;
            //Here the Error is when the user don't give the Correct Choice
            while(!valid_lib_input){
                try{
                    System.out.print("Enter your Choice::");
                    lib_choice = sc.nextInt();
                    valid_lib_input = true;
                } catch(InputMismatchException e){
                    Library_interface.error2();
                    sc.nextLine();
                }
            }
            //Most Probably done left for finally checking NOW
            //1. ADD A MEMBER
            if(lib_choice==1){
                //ArrayList to store the refernces of the objects
                Member new_member = new Member();
                boolean Duplicate_Phone_NO =new_member.processMembers(Present_Members);
                if(Duplicate_Phone_NO){
                    Library_interface.Duplicate_Phone_No_Exists();
                }
                else{
                    //Add the member to the Library
                    Present_Members.add(new_member);
                    System.out.println(".......................................\n"+".......................................");
                    System.out.println("Member < "+new_member.Get_Name()+" > Successfully Registered with ID < "+new_member.Get_ID()+" >");
                    System.out.println(".......................................\n"+".......................................");
                }
            }

            //2. Remove a Member 
            else if (lib_choice == 2) {
                //I am using Phone number as unique identifier
                long Phone_Number;
                boolean removed = false;
                System.out.print("Enter Phone_Number To Remove A Person :: ");
                Phone_Number = sc.nextLong();
                
                for (int i = 0; i < Present_Members.size(); i++){
                    Member member = Present_Members.get(i);
                    if (member.Get_Phone() == Phone_Number){
                        Present_Members.remove(i); // Remove the matching member
                        i--; // Decrement i to account for the removed element
                        removed = true;
                    }
                }
                if(removed){
                    System.out.println(".......................................\n"+".......................................");
                    System.out.println("Person with Phone Number < "+Phone_Number+" >Has been Removed");
                    System.out.println(".......................................\n"+".......................................");
                }
                else Library_interface.Error_Message_for_Removing_Member();;
            }
            
            //3. Add a book
            else if(lib_choice==3){
                sc.nextLine();//Consuming the space I dont know why???
                System.out.print("Enter Title of the book:::");
                String title1 = sc.nextLine();
                System.out.print("Enter  Author's Name:::");
                String author1 = sc.nextLine();
                System.out.print("Enter number of copies:::");
                int copies_tobeadded1 = Integer.parseInt(sc.nextLine());
                boolean no_error = true;
                if(copies_tobeadded1<=0){
                    System.out.println("Error::total copies cannot be less than one....");
                    no_error= false;
                    continue;
                }
                Books ob = new Books();
                ob.AddBook(title1, author1, copies_tobeadded1);
                if(no_error){
                    System.out.println("....Book Added Successfully.....");
                }
            }
            //4. Remove a book
            else if(lib_choice==4){
                System.out.print("Enter Book_Id to delete the book::");
                sc.nextLine();
                int book_id = Integer.parseInt(sc.nextLine());
                Books.RemoveBook(book_id);

            }
            //5. Display all members
            else if(lib_choice==5){
                for(int i=0;i<Present_Members.size();i++){
                    System.out.println("Name::: "+Present_Members.get(i).Get_Name());
                    System.out.println("Member Id::: "+Present_Members.get(i).Get_ID());
                    boolean borrowed_not = false;
                    if(Present_Members.get(i).getBorrowed_Books()[0]!=0L){
                        if(!borrowed_not) System.out.println("BOOKS:::");
                        Books.View_Book_With_ID(Present_Members.get(i).getBorrowed_Books()[0]);
                        borrowed_not = true;
                        
                    }
                    if(Present_Members.get(i).getBorrowed_Books()[1]!=0L){
                        if(!borrowed_not) System.out.println("BOOKS:::");
                        Books.View_Book_With_ID(Present_Members.get(i).getBorrowed_Books()[1]);
                        borrowed_not = true;
                    }
                    System.out.println("Phone_Number:::"+Present_Members.get(i).Get_Phone());
                    
                    if(!borrowed_not){
                        System.out.println("No Book Has Been Borrowed By:::"+Present_Members.get(i).Get_Name());
                    }
                    boolean fines_or_not = false;
                    long curr1=0L,curr2=0L;
                    if(Present_Members.get(i).getIssuetime()[0]!=0L){
                        long curr_time_1 = Fines.Current_time();
                        long ans11 =Present_Members.get(i).getIssuetime()[0];
                        curr1 = Fines.difference(curr_time_1, ans11);
                        fines_or_not = true;
                    }
                    if(Present_Members.get(i).getIssuetime()[1]!=0L){
                        long curr_time_2 = Fines.Current_time();
                        long ans122 =Present_Members.get(i).getIssuetime()[1];
                        curr1 = Fines.difference(curr_time_2, ans122);
                        fines_or_not = true;
                    }   
                    if(fines_or_not) System.out.println("Total Fine To be Payed is::: "+(curr1+curr2));
                    else System.out.println("....User Has No Dues....");
                }
            }
            //6. Display all books
            else if(lib_choice==6){
                Books.View_All_Books();
            }
            //7. back
            else if(lib_choice==7){
                break;
            }
            else{
                Library_interface.error2(); 
                //Error in case User is using his brain
            }
        }
    }
}
