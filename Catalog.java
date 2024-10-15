package design_quest_sept.library_management_system;
import java.util.*;
public class Catalog implements Search{
    Map<String,List<BookItem>> bookTitles;
    Map<String,List<BookItem>> bookAuthors;
    Map<String,List<BookItem>> bookSubjects;
    Map<String,List<BookItem>> bookPublicationsDate;
    Catalog() {
        this.bookTitles = new HashMap<>();
        this.bookAuthors = new HashMap<>();
        this.bookSubjects = new HashMap<>();
        this. bookPublicationsDate = new HashMap<>();
    }
    public List<BookItem> searchByTitles(String title)
    {
        return bookTitles.get(title);
    }
    public List<BookItem> searchByAuthors(String author)
    {
        return bookAuthors.get(author);
    }
    public List<BookItem> searchBySubjects(String subject)
    {
        return bookSubjects.get(subject);
    }
    public List<BookItem> searchBypublicationDates(Date date)
    {
        return bookPublicationsDate.get(date);
    }
    public void addBook(BookItem book)
    {
        //System.out.println(book.getISBN()+" "+book.getTitle()+" "+book.getSubject()+" "+ book.getPublicationDate()+" "+book.getAuthor());
        bookTitles.putIfAbsent(book.getTitle(),new ArrayList());
        bookTitles.get(book.getTitle()).add(book);
        bookAuthors.putIfAbsent(book.getAuthor(),new ArrayList());
        bookAuthors.get(book.getAuthor()).add(book);
        bookSubjects.putIfAbsent(book.getSubject(),new ArrayList());
        bookSubjects.get(book.getSubject()).add(book);
        bookPublicationsDate.putIfAbsent(book.getPublicationDate(),new ArrayList());
        bookPublicationsDate.get(book.getPublicationDate()).add(book);
    }
}
