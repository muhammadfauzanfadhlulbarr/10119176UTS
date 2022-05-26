package com.example.a10119176uts;

//Muhammad Fauzan Fadhlulbarr | IF10K | 10119176 | 23 Mei 2022
public class MusicModel {


    int image;
    String title;
    String penyanyi;

    public MusicModel(int image, String title, String penyanyi) {
        this.image = image;
        this.title = title;
        this.penyanyi = penyanyi;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }
}



