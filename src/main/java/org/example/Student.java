package org.example;

public class Student extends User{
    private String course;
    public Student(int userId ,String name, String email, String course){
        super(userId, name, email);
        this.course=course;

    }

    @Override
    public void displayUserDetails() {

        System.out.println("User Id "+userId);
        System.out.println("User name "+name );
        System.out.println("User Email "+email);
        System.out.println("Course "+course);
    }
    public void borrowBook() {
        System.out.println("Student can borrow a book");
    }
}
