# Library Management System

Welcome to the Library Management System! This application allows users to manage library operations in two distinct modes: Librarian and Member. Below you'll find details on the functionalities and instructions on how to run the program.

## Code Functionalities

### 1. Librarian Mode

#### 1.1 Register a Member
- **Description**: Register a new member with their name, age, and phone number.
- **Details**:
  - The phone number must be unique; otherwise, an error will be shown.
  - Each member is assigned a unique ID starting from 1.

#### 1.2 Remove a Member
- **Description**: Remove a member using their phone number.
- **Details**:
  - Phone number acts as a unique identifier.
  - You can view existing phone numbers by selecting option 5.

#### 1.3 Add a Book
- **Description**: Add a new book with a title, author, and number of copies.
- **Details**:
  - Book ID starts from 333.
  - Success message is shown upon successful addition.

#### 1.4 Remove a Book
- **Description**: Remove a copy of a book using its Book ID.
- **Details**:
  - Only one copy is removed at a time.
  - An error message is shown if the Book ID is not found.

#### 1.5 View All Members, Their Books, and Fines
- **Description**: Display all members, their books, and any outstanding fines.
- **Details**: Includes phone numbers if available.

#### 1.6 View All Books
- **Description**: Display all books currently in the library.

#### 1.7 Back
- **Description**: Return to the main interface.

### 2. Member Mode

#### 2.1 List Available Books
- **Description**: List all books available in the library.

#### 2.2 List My Books
- **Description**: Show books borrowed by the member.
- **Details**: Displays "No books issued" if none.

#### 2.3 Issue Book
- **Description**: Issue a book to the member.
- **Details**:
  - Fine is calculated upon book return.
  - Error if the Book ID is incorrect.

#### 2.4 Return Book
- **Description**: Return a borrowed book and calculate any fines.
- **Details**: Displays borrowed books and takes Book ID input.

#### 2.5 Pay Fine
- **Description**: Calculate and pay fines for overdue books.
- **Details**: For testing, 1 second equals 1 day.

#### 2.6 Back
- **Description**: Return to the main interface.

**Note**: To enter Member Mode, you must provide a valid name and phone number. Incorrect credentials will prevent access.

## Sample Run

### Terminal Interaction

1. **Welcome Screen**
    ```plaintext
    ****************************************
    Welcome to POSSIBLE_LIBRARY
    ****************************************
    1. Enter as Librarian
    2. Enter as Member
    3. Exit
    ****************************************
    Enter your Choice::
    ```

2. **Librarian Interaction**
    - **Enter Choice 1**:
        ```plaintext
        ****************************************
        Welcome Librarian
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
        ```

    - **Example Actions**:
        - Register a member:
            ```plaintext
            Enter Name: sambhav
            Enter Age: 20
            Enter Phone_Number: 9090
            Member < sambhav > Successfully Registered with ID < 1 >
            ```
        - Add a book:
            ```plaintext
            Enter Title of the book: funny boy
            Enter Author's Name: salman khan
            Enter number of copies: 5000
            ....Book Added Successfully.....
            ```

3. **Member Interaction**
    - **Enter Choice 2**:
        ```plaintext
        ****************************************
        Welcome Student
        ****************************************
        Name::: sambhav
        Phone_Number::: 9090
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
        Enter your Choice::
        ```

    - **Example Actions**:
        - List available books:
            ```plaintext
            Book Title              Book Author             Book ID         Book Copies
            funny boy               salman khan             334             4999
            fire or ice             robert frost            335             4000
            ```
        - Return a book:
            ```plaintext
            BOOK1 :: funny boy            334             salman khan
            BOOK2 :: fire or ice          335             robert frost
            Enter Book_ID:::
            334
            Book Has Been Returned.. Thank you.....
            ```

### Invalid Choices
- **Example**:
    ```plaintext
    Enter your Choice:: fire or ice
    Error: Invalid Choice
    Please enter your choice in the range 1-7.
    ```

For more information or issues, please contact the developer.

---

**Made by:** Sambhav Gautam
