package design_quest_sept.library_management_system;

public class Person {
    private String name;
    private Address address;
    protected String email;
    private String phone;

    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
