package org.example;

import java.util.ArrayList;

public  class Library implements LibraryOperations{
    private String LibraryName;
    private String LibraryAddress;
    private ArrayList<Book> books=new ArrayList<>();
    public Library(String LibraryName,String LibraryAddress){
        this.LibraryName=LibraryName;
        this.LibraryAddress=LibraryAddress;

    }
    public void displayLibraryDetails(){
        System.out.println("Library Name "+LibraryName);
        System.out.println("Library Address "+LibraryAddress);

    }

    @Override
    public void addBook(Book book) {
         books.add(book);
        System.out.println("Book added successfully");
    }

    @Override
    public void removeBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                books.remove(book);
                System.out.println("Book removed successfully");
                return;
            }
    }}
        @Override
        public void issueBook(int bookId) {
            for (Book book : books) {
                if (book.getBookId() == bookId) {
                    book.issueBook();
                    return;
                }
            }

            System.out.println("Book not found");
        }

        @Override
        public void returnBook(int bookId) {
            for (Book book : books) {
                if (book.getBookId() == bookId) {
                    book.returnBook();
                    return;
                }
            }

            System.out.println("Book not found");
        }

}
