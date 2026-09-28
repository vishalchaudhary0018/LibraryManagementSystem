package org.example;



public class User {
    protected int userId ;
   protected String name;
   protected String email;
    public User( int userId ,String name, String email){
        this.userId=userId;
        this.name =name ;
        this.email=email;

    }
    public void displayUserDetails(){
        System.out.println("User Id "+userId);
        System.out.println("User name "+name );
        System.out.println("User Email "+email);
    }
    public void login(){
        System.out.println("User login Succesfully ");

    }
}
