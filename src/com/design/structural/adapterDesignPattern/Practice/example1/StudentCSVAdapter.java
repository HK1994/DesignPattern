package com.design.structural.adapterDesignPattern.Practice.example1;

/**
 * Created by hemantkumar on 2/7/2018.
 */
public class StudentCSVAdapter implements Student {

    private StudentCSV instance;

    public StudentCSVAdapter(StudentCSV instance)
    {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId()+"" ;
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String toString() {
        return "ID:" + instance.getId() + " FirstName:" + instance.getFirstname() + " LastName:" + instance.getLastname() + " MailAddress:" + instance.getEmailAddress();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmailId() {
        return instance.getEmailAddress();
    }
}
