package Week6.Ex101;

import java.util.ArrayList;

public class Library {
  private ArrayList<Book> books;

  public Library() {
    this.books = new ArrayList<Book>();
  }

  public void addBook(Book newBook) {
    this.books.add(newBook);
  }

  public ArrayList<Book> searchByTitle(String title) {
    ArrayList<Book> foundBooks = new ArrayList<Book>();
    
    for (Book book : books) {
      if (book.title().contains(title))
        foundBooks.add(book);
    }
    
    return foundBooks;
  }

  public ArrayList<Book> searchByPublisher(String publisher) {
    ArrayList<Book> foundBooks = new ArrayList<Book>();
    
    for (Book book : books) {
      if (book.publisher().contains(publisher))
        foundBooks.add(book);
    }
    
    return foundBooks;
  }

  public ArrayList<Book> searchByYear(int year) {
    ArrayList<Book> foundBooks = new ArrayList<Book>();
    
    for (Book book : books) {
      if (book.year() == year)
        foundBooks.add(book);
    }
    
    return foundBooks;
  }

  public void printBooks() {
    for (Book book : books)
      System.out.println(book.bookDetails());
  }
}
