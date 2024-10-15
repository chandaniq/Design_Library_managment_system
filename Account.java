package design_quest_sept.library_management_system;

public abstract class Account {
    protected Person person;
    protected  String username;
    protected  String password;

    public void resetPassword(String password){
        this.password = password;
    }
}
