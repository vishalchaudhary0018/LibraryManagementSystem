package org.example;

public class Librarian extends User{
    private int empId;
   public Librarian(int userId ,String name, String email,int empId){
        super(userId, name, email);
        this.empId=empId;

    }

    @Override
    public void displayUserDetails() {
        System.out.println("User Id " + userId);
        System.out.println("User name " + name);
        System.out.println("User Email " + email);
        System.out.println("employee Id " + empId);
    }
    public void addBook(){
        System.out.println("Libratian can add book");
    }
}
