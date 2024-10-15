package design_quest_sept.library_management_system;
import java.util.*;
public interface Search {
    public List<BookItem> searchByTitles(String title);
    public List<BookItem> searchByAuthors(String title);
    public List<BookItem> searchBySubjects(String title);
    public List<BookItem> searchBypublicationDates(Date date);
}
