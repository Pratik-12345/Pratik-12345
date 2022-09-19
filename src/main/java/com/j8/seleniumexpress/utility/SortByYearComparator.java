package com.j8.seleniumexpress.utility;

import com.j8.seleniumexpress.entities.Song;

import java.util.Comparator;

public class SortByYearComparator implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {

        if (o1.getYear()>o2.getYear()){
            return 1;
        }

        if (o1.getYear()< o2.getYear()){
            return -1;
        }

        return 0;
    }
}
