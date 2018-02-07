package com.design.structural.adapterDesignPattern.Practice.example1;

/**
 * Created by hemantkumar on 2/7/2018.
 */
public class StudentLdapAdapter implements Student {
    private StudentLdap studentLdap;

    public StudentLdapAdapter(StudentLdap studentLdap)
    {
        this.studentLdap = studentLdap;
    }

    @Override
    public String toString() {
        return "ID:" + studentLdap.getCn() + " FirstName:" + studentLdap.getGivenName() + " LastName:" + studentLdap.getSurname() + " MailAddress:" + studentLdap.getMail();
    }

    @Override
    public String getId() {
        return studentLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return studentLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return studentLdap.getSurname();
    }

    @Override
    public String getEmailId() {
        return studentLdap.getMail();
    }
}
