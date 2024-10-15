package design_quest_sept.library_management_system;

public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String pincode;

    public Address(String street, String city, String state, String country, String pincode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}
