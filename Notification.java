package design_quest_sept.library_management_system;
import java.util.*;
public class Notification {
    public void sendDueDateRemainder(Member member, BookItem bookItem) {
        sendEmail(member.getEmail(), bookItem.getDueDate());
    }
    public void sendEmail(String email, Date date) {

    }
}
