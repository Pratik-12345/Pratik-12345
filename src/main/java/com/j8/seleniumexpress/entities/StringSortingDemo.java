package com.j8.seleniumexpress.entities;

import com.j8.seleniumexpress.utility.MethodUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSortingDemo {
    public static void main(String[] args) {
        List<String> instituteList = new ArrayList<>();
        instituteList.add("Ashok IT");
        instituteList.add("Zetasoft");
        instituteList.add("Naresh IT");
        instituteList.add("Durgasoft");

        MethodUtility.iterateList(instituteList);

        Collections.sort(instituteList);

        System.out.println("after sorting done . . .");
        MethodUtility.iterateList(instituteList);
    }


}
