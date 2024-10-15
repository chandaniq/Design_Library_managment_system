package design_quest_sept.library_management_system;

public class Book {
    private String isbn;
    private String title;
    private String subject;
    private String publicateDate;
    private String author;
    public Book(String isbn, String title, String subject, String publicateDate, String author) {
        this.isbn = isbn;
        this.title = title;
        this.subject = subject;
        this.publicateDate = publicateDate;
        this.author = author;
        
    }
    String getISBN() {
        return isbn;
    }
    String getTitle() {
        return title;
    }
    String getSubject() {
        return subject;
    }
    String getPublicationDate() {
        return publicateDate;
    }
    String getAuthor() {
        return author;
    }

}
