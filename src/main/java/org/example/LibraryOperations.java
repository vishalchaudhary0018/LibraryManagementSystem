package org.example;

public interface LibraryOperations {
    public void addBook(Book book);
    public void removeBook(int bookId);
    public void issueBook(int bookId);
    public void returnBook(int bookId);


}
