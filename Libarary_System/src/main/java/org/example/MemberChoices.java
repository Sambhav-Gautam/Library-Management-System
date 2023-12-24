package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class MemberChoices {
    
    public static void Funciton_For_Member_Choice_2(String name,long phone_no){
        ArrayList<Member> Member_Present_Refernce = Librariran.Present_Members;
        boolean Member_Existence = false;
        for(int i=0;i<Member_Present_Refernce.size();i++){
            if(Member_Present_Refernce.get(i).Get_Name().equalsIgnoreCase(name) && Member_Present_Refernce.get(i).Get_Phone()==phone_no){
                Member_Existence = true;
                if(Member_Present_Refernce.get(i).getBorrowed_Books()[0]!=0L && Member_Present_Refernce.get(i).getBorrowed_Books()[1]!=0L){
                    System.out.println("Book Title\t\t"+"Book Id\t\t"+"Author\t\t");
                    Books.View_Book_With_ID(Member_Present_Refernce.get(i).getBorrowed_Books()[0]);
                    Books.View_Book_With_ID(Member_Present_Refernce.get(i).getBorrowed_Books()[1]);
                }
                else if(Member_Present_Refernce.get(i).getBorrowed_Books()[0]!=0L){
                    System.out.println("Book Title\t\t"+"Book Id\t\t"+"Author\t\t");
                    Books.View_Book_With_ID(Member_Present_Refernce.get(i).getBorrowed_Books()[0]);
                }
                else if(Member_Present_Refernce.get(i).getBorrowed_Books()[1]!=0L){
                    System.out.println("Book Title\t\t"+"Book Id\t\t"+"Author\t\t");
                    Books.View_Book_With_ID(Member_Present_Refernce.get(i).getBorrowed_Books()[1]);
                }
                else{
                    System.out.println("..............................................");
                    System.out.println("No Book Has Been Borrowed::");
                    System.out.println("..............................................");
                }
            }
        }
        //incase Credentails not found
        if(!Member_Existence){
            System.out.println("..............................................");
            System.out.println("Member with "+name+" and Phone Number"+ phone_no+"Donot exists....");
            System.out.println("..............................................");
        }
    }
    public static void Function_For_Member_Choice_3(String name,long phone_no){
        Scanner sc = new Scanner(System.in);
        ArrayList<Member> Member_Present_Refernce = Librariran.Present_Members;
                System.out.println("Enter Book_ID to issue the book:::");
                long Book_ID_Is = sc.nextLong();
                Boolean Book_Id_Exists = false;
                Boolean issue_kru_ya_na = false;
                ArrayList<Book> All_Books = Books.Present_Books;
                int index =-1;
                for(int i=0;i<All_Books.size();i++){
                    if(All_Books.get(i).getBook_ID()==Book_ID_Is){
                        Book_Id_Exists = true;
                        if(All_Books.get(i).getTotal_copies()==0){
                            System.out.println("..............................................");
                            System.out.println("No copies are available for issuing of this book");
                            System.out.println("..............................................");
                        }
                        else{
                            index =i;
                            issue_kru_ya_na = true;
                        }
                    }
                }
                if(issue_kru_ya_na){
                    for(int i=0;i<Member_Present_Refernce.size();i++){
                        if(Member_Present_Refernce.get(i).Get_Name().equalsIgnoreCase(name) && Member_Present_Refernce.get(i).Get_Phone()==phone_no){
                            Member Current_Member =  Member_Present_Refernce.get(i);
                            //agr bhai ne ek bhi book issue nhi hai toh issue krdo fir
                            //yha pr current time ki reference bhi store krani hai bhai
                            if (Current_Member.getBorrowed_Books()[0]==0L && Current_Member.getBorrowed_Books()[1]==0L){
                                //Checking if the person dont have any fines with him
                                if(Current_Member.getFines()[0]==0L && Current_Member.getFines()[1]==0L){
                                    long[] arr = new long[2];
                                    arr[0] =Book_ID_Is;
                                    //borrowed Books m set krdia hai
                                    //Ab date of issue set krna h fine calculate krne ke liye 
                                    Current_Member.setBorrowed_Books(arr);
                                    //Maine total copies set krdi hai pr abhi check nhi kia ki copy exist or not
                                    All_Books.get(index).setTotal_copies(All_Books.get(index).getTotal_copies()-1);
                                    long[] arr_for_fines = new long[2];
                                    arr_for_fines[0] = Fines.Current_time();
                                    
                                    //set the time of issue in secs
                                    Current_Member.setIssuetime(arr_for_fines);
                                    System.out.println("Book Has Been Issued Successfully");
                                }
                                else{
                                    System.out.println("..............................................");
                                    System.out.println("You cannot issue a book you have a fine of "+Current_Member.getFines().toString());
                                    System.out.println("..............................................");
                                }
                            }
                            //In teeno m abhi maine fine bhi check krna hai
                            //If a guy have a fine I will not issue the Book to him
                            //agr bhai ne ek hi book issue ki hai toh dusri issue krdo fir
                            else if(Current_Member.getBorrowed_Books()[0]==0L ){
                                if(Current_Member.getFines()[0]==0L && Current_Member.getFines()[1]==0L){
                                    long[] arr = new long[2];
                                    arr[0] =Book_ID_Is;
                                    arr[1] =Current_Member.getBorrowed_Books()[1];
                                    Current_Member.setBorrowed_Books(arr);
                                    All_Books.get(index).setTotal_copies(All_Books.get(index).getTotal_copies()-1);
                                    long[] arr_for_fines = new long[2];
                                    arr_for_fines[0] = Fines.Current_time();
                                    arr_for_fines[1] = Current_Member.getFines()[1];
                                    //set the time of issue in secs
                                    Current_Member.setIssuetime(arr_for_fines);
                                    System.out.println("Book Has Been Issued Successfully");
                                }
                                else{
                                    System.out.println("..............................................");
                                    System.out.println("You cannot issue a book you have a fine of ::"+Current_Member.getFines()[0]+Current_Member.getFines()[1]);
                                    System.out.println("..............................................");
                                }
                            }
                            //agr bhai ne ek hi book issue ki hai to
                            //fine check krna hai teeno function mai abhi toh bhai shab
                            else if(Current_Member.getBorrowed_Books()[1]==0){
                                if(Current_Member.getFines()[0]==0L && Current_Member.getFines()[1]==0L){
                                    long[] arr = new long[2];
                                    arr[1] =Book_ID_Is;
                                    arr[0] =Current_Member.getBorrowed_Books()[0];
                                    Current_Member.setBorrowed_Books(arr);
                                    All_Books.get(index).setTotal_copies(All_Books.get(index).getTotal_copies()-1);
                                    long[] arr_for_fines = new long[2];
                                    arr_for_fines[1] = Fines.Current_time();
                                    arr_for_fines[0] = Current_Member.getFines()[0];
                                    //set the time of issue in secs
                                    Current_Member.setIssuetime(arr_for_fines);
                                    System.out.println("Book Has Been Issued Successfully");
                                }
                                else{
                                    System.out.println("..............................................");
                                    System.out.println("You cannot issue a book you have a fine of ::"+Current_Member.getFines()[0]+Current_Member.getFines()[1]);
                                    System.out.println("..............................................");
                                }
                            }
                            else{
                                System.out.println("..............................................");
                                System.out.println("Cannot Issue More Than Two Books...");
                                System.out.println("..............................................");
                            }
                        }
                    }
                }
                else if(!Book_Id_Exists){
                    System.out.println("..............................................");
                    System.out.println("Book ID doesn't exists....");
                    System.out.println("..............................................");
                }
                
    }
    //please check it
    public static void Function_For_Member_Choice_4(String name ,long phone_no){
        Scanner sc = new Scanner(System.in);
        ArrayList<Member> Member_Present_Refernce = Librariran.Present_Members;
        for(int i=0;i<Member_Present_Refernce.size();i++){
            if(Member_Present_Refernce.get(i).Get_Name().equalsIgnoreCase(name) && Member_Present_Refernce.get(i).Get_Phone()==phone_no){
                Member Current_Member =  Member_Present_Refernce.get(i);
                if(Current_Member.getBorrowed_Books()[0]!=0L){
                    System.out.print("BOOK1 :: ");
                    Books.View_Book_With_ID(Current_Member.getBorrowed_Books()[0]);
                }
                if(Current_Member.getBorrowed_Books()[1]!=0L){
                    System.out.print("BOOK2 :: ");
                    Books.View_Book_With_ID(Current_Member.getBorrowed_Books()[1]);
                }

                
                System.out.println("Enter Book_ID:::");
                long Book_ID = sc.nextLong();
                ArrayList<Book> All_Books = Books.Present_Books;
                //Fine bhi adjust krna hai check krna hai
                //Bhai Bohot kam hai abhi Toh
                boolean Lets_check_Book = false;
                //what I did here is setting the Book_ID to 0L to indicate that the book is returned 
                for(int j=0;j<All_Books.size();j++){
                    if(All_Books.get(j).getBook_ID()==Book_ID){
                        Lets_check_Book = true ;
                        All_Books.get(j).setTotal_copies(All_Books.get(j).getTotal_copies()+1);
                        if(Current_Member.getBorrowed_Books()[0]==Book_ID){
                            long[] arr_borrowed = new long[2];
                            arr_borrowed[0] = 0L;
                            arr_borrowed[1] = Current_Member.getBorrowed_Books()[1];
                            Current_Member.setBorrowed_Books(arr_borrowed);
                            boolean[] return_arr = new boolean[2];
                            return_arr[0] = true;
                            return_arr[1] = false;
                            Current_Member.setBook_returned(return_arr);
                        }
                        else if(Current_Member.getBorrowed_Books()[1]==Book_ID){
                            long[] arr_borrowed = new long[2];
                            arr_borrowed[1] = 0L;
                            arr_borrowed[0] = Current_Member.getBorrowed_Books()[1];
                            Current_Member.setBorrowed_Books(arr_borrowed);
                            boolean[] return_arr = new boolean[2];
                            return_arr[1] = true;
                            return_arr[0] = false;
                            Current_Member.setBook_returned(return_arr);
                            
                        }
                        else{
                            System.out.println("..............................................");
                            System.out.println("Book with Book_ID"+Book_ID+"Has not been issued by the user");
                            System.out.println("..............................................");
                        }
                    }
                }
                if(Lets_check_Book){
                    System.out.println("..............................................");
                    System.out.println("Book Has Been Returned.. Thank you.....");
                    System.out.println("..............................................");
                }
                else{
                    System.out.println("..............................................");
                    System.out.println("Book with Book_ID->"+Book_ID+" Donot Exist in Library how can you return it then ???.....");
                    System.out.println("..............................................");
                }

            }
        }
        
    }
    public static void Function_For_Member_Choice_5(String name,long phone_no){
        ArrayList<Member> Member_Present_Refernce = Librariran.Present_Members;
        for(int i=0;i<Member_Present_Refernce.size();i++){
            if(Member_Present_Refernce.get(i).Get_Name().equalsIgnoreCase(name) && Member_Present_Refernce.get(i).Get_Phone()==phone_no){
                Member Current_Member =  Member_Present_Refernce.get(i);
                boolean fine_pay = false;
                if(Current_Member.getBook_returned()[0]){
                    long curr_time = Fines.Current_time();
                    long ans = Current_Member.getIssuetime()[0];
                    long diff = Fines.difference(curr_time,ans);
                    if(diff>10){
                        System.out.println("..............................................");
                        System.out.println("Total Fine to be payed is::: "+((diff-10)*3));
                        System.out.println("..............................................");
                        fine_pay= true;
                    }
                    else{
                        System.out.println("Total Fine Amount is::"+0);
                    }
                }
                else if(Current_Member.getBook_returned()[1]){
                    long curr_time = Fines.Current_time();
                    long ans = Current_Member.getIssuetime()[1];
                    long diff = Fines.difference(curr_time,ans);
                    if(diff>10){
                        System.out.println("..............................................");
                        System.out.println("Total Fine to be payed is::: "+((diff-10)*3));
                        System.out.println("..............................................");
                        fine_pay = true;
                    }
                    else{
                        System.out.println("..............................................");
                        System.out.println("Total Fine Amount is::"+0);
                        System.out.println("..............................................");
                    }
                }
                else{
                    System.out.println("..............................................");
                    System.out.println("Book Not returned yet");
                    System.out.println("..............................................");
                }
                if(fine_pay){
                    Scanner sc = new Scanner (System.in);
                    boolean correct_input =false;
                    while(!correct_input){
                        System.out.println("..............................................");
                        System.out.println("Do you want to pay the fine:press (y/n) to continue");
                        System.out.println("y -> Yes and n -> No :::");
                        System.out.println("..............................................");
                        String ch = sc.nextLine();
                        if(ch.equals("y")){
                            System.out.println("..............................................");
                            System.out.println("Fine Payed Successfully::");
                            System.out.println("..............................................");
                            long arr[] = new long[2];
                            arr[0] = 0L;
                            arr[1] = 0L;
                            Current_Member.setFines(arr);//clear the fines of the user
                            correct_input= true;
                        }
                        else if(ch.equals("n")){
                            long curr_time = Fines.Current_time();
                            long ans = Current_Member.getIssuetime()[1]+Current_Member.getIssuetime()[0];
                            long diff = Fines.difference(curr_time,ans);
                            System.out.println("..............................................");
                            System.out.println("Thanks :your total dues are"+((diff-10)*3));
                            System.out.println("..............................................");
                            correct_input = true;
                        }
                        else{
                            System.out.println("..............................................");
                            System.out.println("Error:Enter Correct Choice...");
                            System.out.println("..............................................");
                        }
                    }
                }
                
            }
        }
    }   
}
