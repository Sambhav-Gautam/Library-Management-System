package org.example;

//The class here will used for printing purpose
//that why I avoid instantiation
public class Library_interface{
    /*
    Private Constructor to prevent instantiation.
     */
    private Library_interface() {
    }
    
    public static void Error_Message_for_Removing_Member(){
        printHeader("Error :: No Person exists with this Phone Number");
        printFooter();
    }

    public static void Duplicate_Phone_No_Exists(){
        printHeader("Error: Duplicate Phone Number");
        System.out.println("A person with the same phone number already exists.");
        printFooter();
    }

    public static void Student_options(){
        printHeader("Student Menu");
        System.out.println("1. List Available Books");
        System.out.println("2. List My Books");
        System.out.println("3. Issue Book");
        System.out.println("4. Return Book");
        System.out.println("5. Pay Fine");
        System.out.println("6. Back");
        printFooter();
    }

    public static void Librarian_options(){
        printHeader("Librarian Menu");
        System.out.println("1. Register a member");
        System.out.println("2. Remove a member");
        System.out.println("3. Add a book");
        System.out.println("4. Remove a book");
        System.out.println("5. View all members, their books, and fines");
        System.out.println("6. View all books");
        System.out.println("7. Back");
        printFooter();
    }

    public static void Welcome(){
        printHeader("Welcome to POSSIBLE_LIBRARY");
        System.out.println("1. Enter as Librarian");
        System.out.println("2. Enter as Member");
        System.out.println("3. Exit");
        printFooter();
    }

    public static void Librarian(){
        printHeader("Welcome Librarian");
        printFooter();
    }

    public static void Student(){
        printHeader("Welcome Student");
        printFooter();
    }

    public static void exit(){
        printHeader("Thanks for Visiting");
        System.out.println("               _____          ");
        System.out.println("               |. .|  (bye)     ");
        System.out.println("               | o |          ");
        System.out.println("             \\ ----- /        ");
        System.out.println("              \\|   |/          ");
        System.out.println("               |   |          ");
        System.out.println("               -----          ");
        System.out.println("               |   |      ");
        printFooter();
    }

    public static void error1(){
        printHeader("Error: Invalid Choice");
        System.out.println("Please enter your choice as 1, 2, or 3.");
        printFooter();
    }
    public static void error3(){
        printHeader("Error: Invalid Choice");
        System.out.println("Please enter your choice in the range 1-6.");
        printFooter();
    }
    public static void error2(){
        printHeader("Error: Invalid Choice");
        System.out.println("Please enter your choice in the range 1-7.");
        printFooter();
    }

    private static void printHeader(String message){
        String stars = "*".repeat(40);
        System.out.println(stars);
        System.out.println(message);
        System.out.println(stars);
    }

    private static void printFooter(){
        String stars = "*".repeat(40);
        System.out.println(stars);
    }
}
