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
            new Station(1, "Keychain rollin (Bloodhound Pang)","keymusic"),
            new Station(1, "Don't touch me there (Awkward Feels)","socialmusic"),
            new Station(1, "That's not a potato (Dinosaur Marathon)","vinylmusic"));

    private static Datastore instance = new Datastore();

    private Datastore(){}

    public static final Datastore getInstance(){
        return instance;
    }

    public ArrayList<Station> getStationsByType(int type){
        ArrayList<Station> ret = new ArrayList<>();
        for(Station station : stations){
            if(station.getType() == type){
                ret.add(station);
            }
        }
        return ret;
    }

}
