package design_quest_sept.library_management_system;
import java.util.*;
public class BookItem  extends Book{
    private String id;
    private boolean isCheckedOut;
    private Date borrowedDate;
    private Date dueDate;
    private Member member;
    private int rack;
    private static final double DAILY_FINE_RATE = 1.0;

    public BookItem(String isbn, String title, String subject, String publicateDate, String author, String id,int rackNo) {
        super(isbn, title, subject, publicateDate, author);
        this.id = id;
        this.rack = rackNo;
        this.isCheckedOut = false;
    }
    public void checkout(Member member) {
        this.isCheckedOut = true;
        this.member = member;
        this.borrowedDate = new Date();
        this.dueDate = new Date(borrowedDate.getTime() + 15*24*60*60*1000);
    }
    public void returnBookItem() {
        this.isCheckedOut = false;
        this.member = null;;
    }
    public boolean isCheckedOut() {
        return this.isCheckedOut;
    }
    public double calculateFine() {
        Date today = new Date();
        if (today.compareTo(dueDate) > 0) {
            long diffInmill = today.getTime() - dueDate.getTime();
            long dueDays = diffInmill / (1000 * 60 * 60 * 24);
            return dueDays * DAILY_FINE_RATE;
        }
        return 0;
    }
    public Date getDueDate() {
        return this.dueDate;
    }

}
