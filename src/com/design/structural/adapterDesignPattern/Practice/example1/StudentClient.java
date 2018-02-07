package com.design.structural.adapterDesignPattern.Practice.example1;

import java.util.*;

/**
 * Created by hemantkumar on 2/7/2018.
 */
public class StudentClient {

    public List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        StudentDB studentDB = new StudentDB("1", "Hemant", "Kumar", "hemant@axway.com");
        studentList.add(studentDB);
        StudentLdap studentLdap = new StudentLdap("2","Bishop","Walter","bishop@walter.com");
        studentList.add(new StudentLdapAdapter(studentLdap));
        StudentCSV studentCSV = new StudentCSV("3,Olivia,Dunhum,olivia@fbi.com");
        studentList.add(new StudentCSVAdapter(studentCSV));
        return studentList;
    }
}
