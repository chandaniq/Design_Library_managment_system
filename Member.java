package design_quest_sept.library_management_system;
import java.util.*;
public class Member extends Account{
    private List<BookItem> checkedOutBooks;
    public Member(String username, String password, Person person) {
        this.username = username;
        this.password = password;
        this.person = person;
        this.checkedOutBooks = new ArrayList();
    }
    public void checkedOuBookItem(BookItem bookitem) {
        checkedOutBooks.add(bookitem);
        bookitem.checkout(this);

    }
    public void returnOuBookItem(BookItem bookitem) {
        checkedOutBooks.remove(bookitem);
        bookitem.returnBookItem();
    }
    public  List<BookItem> getCheckOutBook() {
        return this.checkedOutBooks;
    }
    public String getEmail() {
        return this.person.email;
    }
}
