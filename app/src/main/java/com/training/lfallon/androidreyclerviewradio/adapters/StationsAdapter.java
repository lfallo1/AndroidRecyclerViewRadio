package com.training.lfallon.androidreyclerviewradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.training.lfallon.androidreyclerviewradio.holders.StationViewHolder;
import com.training.lfallon.androidreyclerviewradio.model.Station;
import com.training.lfallon.androidreyclerviewradio.service.Datastore;

import java.util.ArrayList;
import java.util.List;

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private final List<Station> stations;

    public StationsAdapter(int stationType){
        this.stations = Datastore.getInstance().getStationsByType(stationType);
    }
    
    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return stations.size();
    }
}
