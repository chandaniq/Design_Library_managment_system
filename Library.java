package design_quest_sept.library_management_system;
import java.util.*;
public class Library {
    private String name;
    private Address address;
    private Catalog catalog;
    private List<BookItem> bookItems;
    private List<Member> members;
    private Notification notification;


    public Library(String name, Address address) {
        this.name = name;
        this.address = address;
        this.catalog = new Catalog();
        this.bookItems = new ArrayList();
        this.members = new ArrayList<>();
        this.notification = new Notification();

    }
    public void addBookItem(Book book, int noOfCopies)
    {
        for (int i = 0; i < noOfCopies; i++) {
            BookItem bookitem = new BookItem(book.getISBN(), book.getTitle(), book.getSubject(), book.getPublicationDate(), book.getAuthor(), "1", 1);
            //System.out.println(book.getISBN()+" "+book.getTitle()+" "+book.getSubject()+" "+ book.getPublicationDate()+" "+book.getAuthor());
            bookItems.add(bookitem);
            catalog.addBook(bookitem);
        }
        
    }
    public List<BookItem> getBookItem() {
        return bookItems ;
    }
    public void addMember(Member member)
    {
        members.add(member);
    }
    public void removeMember(Member member)
    {
        members.remove(member);
    }
    public void checkOutBook(Member member, BookItem bookItem)
    {
        if(!bookItem.isCheckedOut() && member.getCheckOutBook().size() <Constants.MAX_BOOKS)
        {
            member.checkedOuBookItem(bookItem);;
        }
    }
    public void returnBook(Member member, BookItem bookitem) {
        double fine = bookitem.calculateFine();
        member.returnOuBookItem(bookitem);
    }
    public void checkOverDueBook() {
        Date today = new Date();
        for(Member member : members) {
            for(BookItem bookitem : member.getCheckOutBook()) {
                if (bookitem.isCheckedOut() && bookitem.getDueDate().before(today)) {
                    double fine = bookitem.calculateFine();
                    notification.sendDueDateRemainder(member, bookitem);
                }
            }
        }
    }
    
}
