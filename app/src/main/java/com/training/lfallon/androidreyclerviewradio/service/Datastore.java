package com.training.lfallon.androidreyclerviewradio.service;

import com.training.lfallon.androidreyclerviewradio.model.Station;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Datastore {

    //bogus hard-coded data
    private static final List<Station> stations = Arrays.asList(new Station(0, "Flight Plan (Tunes for Travel)","flightplanmusic"),
            new Station(0, "Two-Wheelin' (Biking Playlist)","bicyclemusic"),
            new Station(0, "Kids Jams (Music for Children", "kidsmusic"),
            new Station(1, "Two-Wheelin' (Biking Playlist)","keymusic"),
            new Station(1, "Two-Wheelin' (Biking Playlist)","social"),
            new Station(1, "Two-Wheelin' (Biking Playlist)","vinylmusic"));

    private static Datastore instance;

    private Datastore(){}

    public static final Datastore getInstance(){
        if(instance == null){
            instance = new Datastore();
        }
        return instance;
    }

    public List<Station> getStationsByType(int type){
        List<Station> ret = new ArrayList<>();
        for(Station station : stations){
            if(station.getType() == type){
                ret.add(station);
            }
        }
        return ret;
    }

}
