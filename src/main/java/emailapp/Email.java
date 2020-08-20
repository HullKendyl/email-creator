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
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companyName = "abccompany";
    private String dotCom = ".com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName + dotCom;
        System.out.println("Email Address: " + email);
    }

    private String setDepartment() {
        System.out.println("Enter the number for the correlating department.\n1 for Administrative\n2 for Dietary\n3 for Nursing\n0 for none");
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
}
