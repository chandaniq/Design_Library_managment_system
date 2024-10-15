package design_quest_sept.library_management_system;

public class LibraryManagementDemo {
    public static void main(String[] args) {
        // Create a library
        Address libraryAddress = new Address("Spice Gardne", "Bengluru", "Karnataka", "India", "560037");
        Library library = Library.getInstance("Central Library", libraryAddress);

        // Create a librarian
        Person librarianPerson = new Person("Jane Doe", "jane.doe@example.com");
        Librarian librarian = new Librarian("admin", "password123", librarianPerson);

        // Create some books
    
        Book book1 = new Book("#1234", "System design vol1", "HLD", "26-04-2024", "Alex xu");
        Book book2 = new Book("#1235", "System design vol2", "HLD", "26-05-2024", "Alex xu");

        // Librarian adds books to the library
        librarian.addBookItem(library, book1, 3); // Add 3 copies of The Great Gatsby
        librarian.addBookItem(library, book2, 2); // Add 2 copies of 1984

        // Create members
        Person memberPerson = new Person("John Smith", "john.smith@example.com");
        Member member = new Member("johnsmith", "password456", memberPerson);
        librarian.addMember(library, member);

        // Member checks out a book
        if (library.getBookItem().size() > 0) {
            library.checkOutBook(member, library.getBookItem().get(0)); // Check out the first book
            System.out.println("Book checked out: " + library.getBookItem().get(0).getTitle());
        }

        // Simulate returning the book after some time
        library.returnBook(member, library.getBookItem().get(0));
        System.out.println("Book returned: " + library.getBookItem().get(0).getTitle());

        // Check for overdue books (for demonstration purposes)
        library.checkOverDueBook();

        // Display member's total fines
        //System.out.println("Total fines for " + member.getEmail() + ": $" + member.getTotalFines());
    }
}
