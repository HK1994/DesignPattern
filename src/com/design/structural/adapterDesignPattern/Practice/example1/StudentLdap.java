package com.design.structural.adapterDesignPattern.Practice.example1;

/**
 * Created by hemantkumar on 2/7/2018.
 */
public class StudentLdap {
    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    public StudentLdap(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }


    public String getCn() {
        return cn;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }
}
