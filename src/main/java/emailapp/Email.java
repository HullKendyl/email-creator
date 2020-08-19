package emailapp;

import java.util.Scanner;

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
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);
    }

    private String setDepartment() {
        System.out.println("Enter the department\n1 for Administrative\n2 for Dietary\n3 for Nursing\n0 for none");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if (departmentChoice == 1) {
            return "Administrative";}
        else if (departmentChoice == 2) {
            return "Dietary";}
        else if (departmentChoice == 3) {
            return "Nursing"; }
        else return " ";
    }
}
