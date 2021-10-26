package Week6.Ex101;

public class Book {
  private String title;
  private String publisher;
  private Integer year;

  public Book(String title, String publisher, Integer year){
    this.title = title;
    this.publisher = publisher;
    this.year = year;
  }
  
  public String bookDetails() {
    return (this.title + " by " + this.publisher + ", " + this.year);
  }

  public String title() {
    return this.title;
  }

  public String publisher() {
    return this.publisher;
  }

  public int year() {
    return this.year;
  }
}
