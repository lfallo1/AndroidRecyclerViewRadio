package com.training.lfallon.androidreyclerviewradio.model;

public class Station {
    final static String DRAWABLE = "drawable/";
    private int type;
    private String title;
    private String imageName;

    public Station(int type, String title, String imageName) {
        this.type = type;
        this.title = title;
        this.imageName = imageName;
    }

    public int getType(){
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getImageName() {
        return imageName;
    }
}
