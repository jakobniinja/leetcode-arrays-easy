package CW;

import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public static int howMany( ArrayList<String> list){
        return (int)  list.stream().map(String::toLowerCase).filter(list::add).count();
    }
}
