package com.j8.seleniumexpress.entities;

import com.j8.seleniumexpress.utility.ArtistNameComparator;
import com.j8.seleniumexpress.utility.MethodUtility;
import com.j8.seleniumexpress.utility.SortByYearComparator;

import java.util.ArrayList;
import java.util.Collections;

public class MP4 {
    public static void main(String[] args) {
        ArrayList<Song> musicList = new ArrayList<>();
        musicList.add(new Song("Kesariya","Arijit",2022));
        musicList.add(new Song("Ranjha","B Praak",2020));
        musicList.add(new Song("Chand Baaliyan","Aditya A",2021));
        musicList.add(new Song("Laapata","KK",2009));
        musicList.add(new Song("Teri ore","Pritam",2007));
        musicList.add(new Song("Rataan Lambiyaan","Jubin N",2021));

        MethodUtility.iterateList(musicList);

//        Collections.sort(musicList);
       // SortByYearComparator yearComparator = new SortByYearComparator();

       // Collections.sort(musicList,new SortByYearComparator());
        Collections.sort(musicList,new ArtistNameComparator().reversed());

        System.out.println("after sorting . . .");

        MethodUtility.iterateList(musicList);


    }
}
