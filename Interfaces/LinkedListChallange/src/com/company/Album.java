package com.company;

import java.util.ArrayList;

public class Album {

    private String nazwaAlbumu;
    private ArrayList<Song> albumArraylist;

    public Album(String nazwaAlbumu) {
        this.nazwaAlbumu = nazwaAlbumu;
        this.albumArraylist = new ArrayList<Song>();
    }

    public void dodajDoAlbumu(String nazwa, int duration){
        this.albumArraylist.add(new Song(nazwa, duration));
    }

    public Song getSong(int index){
        return albumArraylist.get(index);
    }
}



//    public void pokazAlbum(){
//
//        System.out.println("Piosenki z albumu " + this.nazwaAlbumu);
//        for(Song song : this.albumArraylist){
//            System.out.println(song.getTitle()+ " - "+song.getDuration());
//        }
//    }
