package com.j8.seleniumexpress.utility;

import com.j8.seleniumexpress.entities.Song;

import java.util.Comparator;

public class ArtistNameComparator implements Comparator<Song> {

    @Override
    public int compare(Song song1, Song song2) {


        return song1.getArtist().compareTo(song2.getArtist());
    }
}
