package emailapp;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String position;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
