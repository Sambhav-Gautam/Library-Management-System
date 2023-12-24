package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class EnterMember {
    //Login Function
    public static long login(String name, long phone_no){
        ArrayList<Member> Member_Present_Refernce = Librariran.Present_Members;
        for(int i=0;i<Member_Present_Refernce.size();i++){
            if(Member_Present_Refernce.get(i).Get_Name().equalsIgnoreCase(name) && Member_Present_Refernce.get(i).Get_Phone()==phone_no){
                return Member_Present_Refernce.get(i).Get_ID();
            }
        }
        return -1;
    }

    public static void function_for_Student(String name,long phone_no){
        Scanner sc = new Scanner(System.in);
        while(true){
            //Interface Look
            Library_interface.Student_options();
            int Member_Choice =0;
            boolean valid_input = false;

            //InputMismatchException Error
            while(!valid_input){
                try{
                    System.out.print("Enter your Choice::");
                    Member_Choice = sc.nextInt();
                    valid_input = true;
                } catch(InputMismatchException e){
                    Library_interface.error3();
                    sc.nextLine();
                }
            }

            //Display all books that are available 
            if(Member_Choice==1){
                Books.View_All_Books();
            }
            //This function requires testing on 4 testcases
            else if(Member_Choice==2){
                MemberChoices.Funciton_For_Member_Choice_2(name, phone_no);
            }
            //Issue a Book Function
            else if(Member_Choice==3){
                MemberChoices.Function_For_Member_Choice_3(name, phone_no);
            
            }
            //Display borrowed books and return
            else if(Member_Choice==4){
                MemberChoices.Function_For_Member_Choice_4(name, phone_no);
            }
            //Calculate time using clock and after 10 secs apply fine 3rs perday
            else if(Member_Choice==5){
                MemberChoices.Function_For_Member_Choice_5(name, phone_no);

            }
            //back
            else if(Member_Choice==6){ 
                break;
            }
            else{
                Library_interface.error3();
            }


        }
    }
}
