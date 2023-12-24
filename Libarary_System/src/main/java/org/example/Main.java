package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(true){
            Library_interface.Welcome();
            boolean valid_int_input= false;
            //Here the Error is when the user don't give the Correct Choice
            while(!valid_int_input){
                try{
                    System.out.print("Enter your Choice::");
                    choice = Integer.parseInt(sc.nextLine().trim());
                    valid_int_input = true;

                } catch(InputMismatchException e){
                    Library_interface.error1();
                    sc.nextLine();
                }
            }
            if(choice==1){
                /*
                Reason 1:
                Static methods in Java are associated with the class or interface itself,
                not with instances of that class or interface.
                Therefore, you should call static methods using the class or interface name,
                not through an instance of that class or interface.
                 */
                Library_interface.Librarian();
                Librariran.function_for_librarian();
            }
            else if(choice==2) {
                // Reason 1 stated in line 28
                Library_interface.Student();
                System.out.println("Name:::");
                String name = sc.nextLine();
                System.out.println("Phone_Number:::");
                long phone_no = sc.nextLong();
                sc.nextLine();
                long Should_Login = EnterMember.login(name,phone_no);
                if(Should_Login!=-1){
                        System.out.println("Welcome "+name+" Member ID::: < "+Should_Login+" >");
                        EnterMember.function_for_Student(name,phone_no);
                        valid_int_input = true;
                    }
                else{
                    System.out.println(".................................................");
                    System.out.println("Member with Name:"+name +" and  Phone NO. "+phone_no+" doesnot exists....");
                    System.out.println(".................................................");
                    //sc.nextLine();
                }
            }
            else if(choice==3){
                // Reason 1 stated in line 28
                Library_interface.exit();
                break;
            }
            else{
                Library_interface.error1();//In case the user presses inavlid key
            }
        }
        sc.close();
    }
}