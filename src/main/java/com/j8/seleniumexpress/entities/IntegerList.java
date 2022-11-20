package com.j8.seleniumexpress.entities;

import com.j8.seleniumexpress.utility.MethodUtility;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerList {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1000);
        integerList.add(3000);
        integerList.add(200);
        integerList.add(100);
        integerList.add(2500);
        integerList.add(1500);

        MethodUtility.iterateList(integerList);

        Collections.sort(integerList);

        System.out.println("after sorting . . .");

        MethodUtility.iterateList(integerList);
    }


}
