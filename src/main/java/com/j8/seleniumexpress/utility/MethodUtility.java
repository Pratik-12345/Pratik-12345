package com.j8.seleniumexpress.utility;


import java.util.List;

public class MethodUtility {

//Generic Method
    public static<T> void iterateList(List<T> anyList) {
        for (T temp : anyList){

            System.out.println(temp);
        }
    }
}
