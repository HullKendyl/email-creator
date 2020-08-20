package emailapp;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String position;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companyName = "abccompany";
    private String dotCom = ".com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName + dotCom;
    }

    private String setDepartment() {
        System.out.println("New Employee: " + firstName + " " + lastName +
                "\nPlease select the number for the correlating department.\n1 for Administrative\n2 for Dietary\n3 for Nursing\n0 for none");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if (departmentChoice == 1) {
            return "administrative";}
        else if (departmentChoice == 2) {
            return "dietary";}
        else if (departmentChoice == 3) {
            return "nursing"; }
        else return " ";
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLNOPQRSTUVWXYZ0123456789!@#$%^&*";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt((rand));
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() { return mailboxCapacity;}

    public String getAlternateEmail() { return alternateEmail;}

    public String getPassword() { return password;}

    public String showEmailInformation() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
