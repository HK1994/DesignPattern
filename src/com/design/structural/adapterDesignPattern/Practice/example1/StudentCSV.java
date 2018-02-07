package com.design.structural.adapterDesignPattern.Practice.example1;

import java.util.StringTokenizer;

/**
 * Created by hemantkumar on 2/7/2018.
 */
public class StudentCSV {

    private int id;
    private String firstname;
    private String lastname;
    private String emailAddress;

    public StudentCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if (tokenizer.hasMoreTokens()) {
            firstname = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreTokens()) {
            lastname = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreTokens()) {
            emailAddress = tokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
