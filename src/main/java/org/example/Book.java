package org.example;

public class Book {
   private int bookId;
   private String title;
   private String author;
   private double price;
   private boolean available;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public  Book(int bookId, String title, String author, double price, boolean available){
       this.bookId=bookId;
       this.title=title;
       this.author=author;
       this.price=price;
       this.available=available;
   }


   public void displayBookDetail(){
       System.out.println("Book Id "+bookId);
       System.out.println("Book Title "+title);
       System.out.println("Book Author "+author);
       System.out.println("Book Price "+price);
       System.out.println("Availability "+available);
   }
  public  void issueBook(){
        if (available==true){
            this.available=false;
            System.out.println("Book was available. ");
        }
        else{
            System.out.println("Book has been issued ");
        }

   }
   public void returnBook(){
System.out.println("Book returned successfully.");
this.available=true;

   }
}

