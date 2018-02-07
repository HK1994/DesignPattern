package com.design.structural.adapterDesignPattern.Practice.example1;

import java.util.List;

/**
 * Created by hemantkumar on 2/7/2018.
 */
public class AdapterDemo {
    public static void main(String[] args) {

        StudentClient client = new StudentClient();
        List<Student> students = client.getStudentList();
        System.out.println(students);

    }
}
