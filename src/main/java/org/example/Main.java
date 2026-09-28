package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book1=new Book(101,"Rich dad and poor dad","Robert Kiyosaki",500.00,false);
        Book book2=new Book( 102,"Java Programming","Herbert Schildt",650,true);
        Book book3=new Book(102,"Clean Code","Robert C. Martin",800, true);

        Library library= new Library("PEC Library","Near Bara Toll plaza Kanpur Dehat");

        Student student1= new Student(1,"Raja","raja@gmail.com","B tech");
        Student student2= new Student(2,"Rani","rani@gmail.com","Polytechnic");
        Student student3= new Student(3,"Raju","raju@gmail.com","B pharma");

        Librarian librarian= new Librarian(1001,"Sachin Kumar","sachin@gmail.com",1001);

// library details
        library.displayLibraryDetails();

        System.out.println("     Add book----");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
 // book details
        book1.displayBookDetail();
        System.out.println();
        book2.displayBookDetail();
        System.out.println();
        book2.displayBookDetail();

        System.out.println("     issue book---");
        library.issueBook(102);
        System.out.println("     Book 102 After Issue ------");

        book2.displayBookDetail();

        System.out.println("     Return Book ----");

        library.returnBook(102);

      // remove a book
        library.removeBook(101);
        System.out.println("     Student detail---");
        student1.displayUserDetails();
        student1.borrowBook();

        System.out.println();

        student2.displayUserDetails();
        student2.borrowBook();

        System.out.println("     Librarian Details----");
        librarian.displayUserDetails();
        librarian.addBook();


        System.out.println("     Polymorphism ---");

        User user1 = new Student(4,"Amit","amit@gmail.com", "Java Full Stack");

        User user2 = new Librarian(1002,"Neeraj","neeraj@library.com", 1002);

        user1.displayUserDetails();
        System.out.println();

        user2.displayUserDetails();






        }
    }
