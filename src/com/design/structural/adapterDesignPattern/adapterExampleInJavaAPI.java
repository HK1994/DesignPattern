package com.design.structural.adapterDesignPattern;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hemantkumar on 2/6/2018.
 */
public class adapterExampleInJavaAPI {
    public static void main(String[] args) {
        Integer[] arrayOfInt = new Integer[]{11,22,33,44,55};
        List<Integer> intList = Arrays.asList(arrayOfInt);
        System.out.println(arrayOfInt);
        System.out.println(intList);
    }

}
