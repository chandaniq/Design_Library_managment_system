package design_quest_sept.library_management_system;

public class Librarian extends Account {
    public Librarian(String username, String password, Person person) {
        this.username = username;
        this.password = password;
        this.person = person;
    }
    public void addBookItem(Library library, Book book, int noOfCopies)
    {
        library.addBookItem(book,noOfCopies);
    }
    public void addMember(Library library, Member member) {
        library.addMember(member);
    }
    public void removeMember(Library library, Member member) {
        library.removeMember(member);
    }
}
