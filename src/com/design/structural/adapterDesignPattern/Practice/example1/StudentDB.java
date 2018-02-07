package com.design.structural.adapterDesignPattern.Practice.example1;

/**
 * Created by hemantkumar on 2/7/2018.
 */
public class StudentDB implements Student {

    public String id;
    public String firstName;
    public String lastName;
    public String emailId;

    public StudentDB(String id, String fName, String lName, String mailId) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.emailId = mailId;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmailId() {
        return emailId;
    }

    public String toString() {
        return "ID: " + id + ", First name: " + firstName + ", Last name: " + lastName + ", Email: " + emailId;
    }
}
