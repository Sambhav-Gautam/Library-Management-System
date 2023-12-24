>>>>>>>>>>>>>>There are two parts in this readme >>>>>>>>>>>>>>
>>>>>>>>>>>>>> 1. Code Functionalities
>>>>>>>>>>>>>> 2. Sample Run (Instructions on how program will be run)

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 1.Code Functionalities ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
>>>>>>>>>>>>>>>>>>>>>>>>>>>> 1.  In Librarian Mode <<<<<<<<<<<<
_________________1. Register a member:: 

>> Program will ask for (name, age ,phone_no) and register the user in library system 
>> if the phone_no is not Registered already otherwise will give an error message that phone_no already Registered with other memeber
>> Member Id is allocated to each member by the program starting from 1 and will go on no used number will be used again

_________________2. Remove a member

>> Program will ask for the phone_no and Remove the Person if the User is Registered with the given phone_number
>> Phone_number is used as unique identfier to delete the object
>> If you forget the phone number you can see by clciking 5 their you can see phone number

_________________3. Add a book

>> Program will ask for three inputs Title of the book and Author name and number of copies 
>> Print success message if book is added succesfully
>> Book Id will start from 333 by default and will be allocated to each book by the user

_________________4. Remove a book

>> Program will ask for the Book_Id to delete the and will delete a copy of the copy not all copies
>> If the Book_Id is not present it will give error

_________________5. View all members, their books, and fines

>> It will print all the member with their books and fines and phone_no if exists

________________6. View all books

>> It will print all the books that are present

_________________7. Back

>> To Go back to the Main interface


>>>>>>>>>>>>>>>>>>>>>>>>>>>> 1.  In Member Mode <<<<<<<<<<<<
________________1. List Available Books
>> It will simply List all the books that are present

________________2. List My Books

>> Books that a particular member owns will be displayed and if there no books
>> It will print No books issued

________________3. Issue Book

>> If the user dont have any pending fine he can issue the book
>> fine will be calculated when the user returns the book
>> Otherwise you can issue the book by using book id and if the book id is wrong it will give error 

_______________4. Return Book

>> Fine will be calculated when you return the book
>> Allow a member to return a borrowed book.
>> Display borrowed books and take input for book ID.



________________5. Pay Fine

>> Calculate and display the fine amount for a book if it's returned after the due date (10 days). 
>> Here for ease of testing, take 1 sec = 1 day. 



_________________6. Back
>> To go back to main inetrface

***** To Enter The Member Mode you have to enter name and phone number and if the credentials are wrong it will not allow to enter



~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 2.. SAMPLE RUN ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
>>>>>>>>>>>>>> There Three options when the user runs the program: >>>>>>>>>>>>>>
<<On Terminal>>
****************************************
Welcome to POSSIBLE_LIBRARY
****************************************
1. Enter as Librarian
2. Enter as Member
3. Exit
****************************************
Enter your Choice::

>>>>>>>>>>>>>> User Can Enter the Choice (1 or 2 or 3 ) in (Enter your Choice::) any other string or char or word will give an Error >>>>>>>>>>>>>>
<<On terminal>>

Enter your Choice::1
****************************************
Welcome Librarian
****************************************
****************************************
****************************************
Librarian Menu
****************************************
1. Register a member
2. Remove a member
3. Add a book
4. Remove a book
5. View all members, their books, and fines
6. View all books
7. Back
****************************************
Enter your Choice::

>>>>>>>>>>>>>> A display message will be printed(for example on pressing 1 -> Welcome Librarian etc printed) and all 7 options will be printed again for user conveince >>>>>>>>>>>>>>
>>>>>>>>>>>>>> Lets try other choices as well after pressing 7 that is back >>>>>>>>>>>>>>
<<On terminal>>

Enter your Choice::7
****************************************
Welcome to POSSIBLE_LIBRARY
****************************************
1. Enter as Librarian
2. Enter as Member
3. Exit
****************************************
Enter your Choice::2
****************************************
Welcome Student
****************************************
****************************************
Name:::
sa
Phone_Number:::
1
.................................................
Member with Name:sa and  Phone NO. 1 doesnot exists....
.................................................
****************************************
Welcome to POSSIBLE_LIBRARY
****************************************
1. Enter as Librarian
2. Enter as Member
3. Exit
****************************************
Enter your Choice::

>>>>>>>>>>>>>> An Error Message is printed as no user has been Registered Yet >>>>>>>>>>>>>>
>>>>>>>>>>>>>> pressing 3 will exit the program and print exit Message >>>>>>>>>>>>>>
>>>>>>>>>>>>>> Lets Enter through Librarian and do some stuff >>>>>>>>>>>>>>
<<On Terminal>>

.................................................
****************************************
Welcome to POSSIBLE_LIBRARY
****************************************
1. Enter as Librarian
2. Enter as Member
3. Exit
****************************************
Enter your Choice::1
****************************************
Welcome Librarian
****************************************
****************************************
****************************************
Librarian Menu
****************************************
1. Register a member
2. Remove a member
3. Add a book
4. Remove a book
5. View all members, their books, and fines
6. View all books
7. Back
****************************************
Enter your Choice::1
Enter Name:sambhav
Enter Age:20
Enter Phone_Number:9090
.......................................
.......................................
Member < sambhav > Successfully Registered with ID < 1 >
.......................................
.......................................
****************************************
Librarian Menu
****************************************
1. Register a member
2. Remove a member
3. Add a book
4. Remove a book
5. View all members, their books, and fines
6. View all books
7. Back
****************************************
Enter your Choice::1
Enter Name:aditi
Enter Age:20
Enter Phone_Number:898
.......................................
.......................................
Member < aditi > Successfully Registered with ID < 2 >
.......................................
.......................................
****************************************
Librarian Menu
****************************************
1. Register a member
2. Remove a member
3. Add a book
4. Remove a book
5. View all members, their books, and fines
6. View all books
7. Back
****************************************
Enter your Choice::

>>>>>>>>>>>>>>We have Registered Two Members and a Message is Printed but you cannot register a member which have same number which is already Registered >>>>>>>>>>>>>>
>>>>>>>>>>>>>> To remove a member >>>>>>>>>>>>>>
>>>>>>>>>>>>>> On Terminal >>>>>>>>>>>>>>

Enter your Choice::2
Enter Phone_Number To Remove A Person :: 898
.......................................
.......................................
Person with Phone Number < 898 >Has been Removed
.......................................
.......................................
****************************************
Librarian Menu
****************************************
1. Register a member
2. Remove a member
3. Add a book
4. Remove a book
5. View all members, their books, and fines
6. View all books
7. Back
****************************************
Enter your Choice::

>>>>>>>>>>>>>> 3. Add a book and 6. Display all books and an invalid option >>>>>>>>>>>>>>
<<On Terminal>>

Enter your Choice::3
Enter Title of the book:::funny boy    
Enter  Author's Name:::salman khan
Enter number of copies:::5000
....Book Added Successfully.....
****************************************
Librarian Menu
****************************************
1. Register a member
2. Remove a member
3. Add a book
4. Remove a book
5. View all members, their books, and fines
6. View all books
7. Back
****************************************
Enter your Choice::fire or ice    
****************************************
Error: Invalid Choice
****************************************
Please enter your choice in the range 1-7.
****************************************
Enter your Choice::3
Enter Title of the book:::fire or ice 
Enter  Author's Name:::robert frost
Enter number of copies:::4000
....Book Added Successfully.....
****************************************
Librarian Menu
****************************************
1. Register a member
2. Remove a member
3. Add a book
4. Remove a book
5. View all members, their books, and fines
6. View all books
7. Back
****************************************
Enter your Choice::6
Book Title              Book Author             Book ID         Book Copies
funny boy                       salman khan                     334                     5000
fire or ice                     robert frost                    335                     4000
****************************************
Librarian Menu
****************************************
1. Register a member
2. Remove a member
3. Add a book
4. Remove a book
5. View all members, their books, and fines
6. View all books
7. Back
****************************************
Enter your Choice::

>>>>>>>>>>>>>> 2. Remove a book and 5. view all member and their info <<<<<<<<<<<<<<<<
<<On Terminal>>

Enter your Choice::4
Enter Book_Id to delete the book::334
.......................................
.......................................
Book with ID334Has been removed succesfully
.......................................
.......................................
****************************************
Librarian Menu
****************************************
1. Register a member
2. Remove a member
3. Add a book
4. Remove a book
5. View all members, their books, and fines
6. View all books
7. Back
****************************************
Enter your Choice::5
Name::: sambhav
Member Id::: 1
Phone_Number:::9090
No Book Has Been Borrowed By:::sambhav
....User Has No Dues....
****************************************
Librarian Menu
****************************************
1. Register a member
2. Remove a member
3. Add a book
4. Remove a book
5. View all members, their books, and fines
6. View all books
7. Back
****************************************
Enter your Choice::

>>>>>>>>>>>>>> Now lets access through student >>>>>>>>>>>>>>

****************************************
Welcome to POSSIBLE_LIBRARY
****************************************
1. Enter as Librarian
2. Enter as Member
3. Exit
****************************************
Enter your Choice::2
****************************************
Welcome Student
****************************************
****************************************
Name:::
sambhav
Phone_Number:::
9090
Welcome sambhav Member ID::: < 1 >
****************************************
Student Menu
****************************************
1. List Available Books
2. List My Books
3. Issue Book
4. Return Book
5. Pay Fine
6. Back
****************************************
Enter your Choice::1
Book Title              Book Author             Book ID         Book Copies
funny boy                       salman khan                     334                     4999
fire or ice                     robert frost                    335                     4000
****************************************
Student Menu
****************************************
1. List Available Books
2. List My Books
3. Issue Book
4. Return Book
5. Pay Fine
6. Back
****************************************
Enter your Choice::2
..............................................
No Book Has Been Borrowed::
..............................................
****************************************
Student Menu
****************************************
1. List Available Books
2. List My Books
3. Issue Book
4. Return Book
5. Pay Fine
6. Back
****************************************
Enter your Choice::3
Enter Book_ID to issue the book:::
334
****************************************
Student Menu
****************************************
1. List Available Books
2. List My Books
3. Issue Book
4. Return Book
5. Pay Fine
6. Back
****************************************
Enter your Choice::2
Book Title              Book Id         Author
funny boy               334             salman khan
****************************************
Student Menu
****************************************
1. List Available Books
2. List My Books
3. Issue Book
4. Return Book
5. Pay Fine
6. Back
****************************************
Enter your Choice::3
Enter Book_ID to issue the book:::
335
****************************************
Student Menu
****************************************
1. List Available Books
2. List My Books
3. Issue Book
4. Return Book
5. Pay Fine
6. Back
****************************************
Enter your Choice::4
BOOK1 :: funny boy              334             salman khan
BOOK2 :: fire or ice            335             robert frost
Enter Book_ID:::
334
..............................................
Book Has Been Returned.. Thank you.....
..............................................
****************************************
Student Menu
****************************************
1. List Available Books
2. List My Books
3. Issue Book
4. Return Book
5. Pay Fine
6. Back
****************************************
Enter your Choice::5
..............................................
Total Fine to be payed is::: 2856
..............................................
..............................................
Do you want to pay the fine:press (y/n) to continue
y -> Yes and n -> No :::
..............................................
y
..............................................
Fine Payed Successfully::
..............................................
****************************************
Student Menu
****************************************
1. List Available Books
2. List My Books
3. Issue Book
4. Return Book
5. Pay Fine
6. Back
****************************************
Enter your Choice::