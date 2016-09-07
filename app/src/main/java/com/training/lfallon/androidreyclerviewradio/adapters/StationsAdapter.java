package com.training.lfallon.androidreyclerviewradio.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.training.lfallon.androidreyclerviewradio.R;
import com.training.lfallon.androidreyclerviewradio.holders.StationViewHolder;
import com.training.lfallon.androidreyclerviewradio.model.Station;
import com.training.lfallon.androidreyclerviewradio.service.Datastore;

import java.util.ArrayList;

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private final ArrayList<Station> stations;
    private Context mContext;

    public StationsAdapter(int stationType, Context context){
        this.stations = Datastore.getInstance().getStationsByType(stationType);
        this.mContext = context;
    }

    @Override
    public int getItemCount() {
        return stations.size();
    }
    
    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);
        return new StationViewHolder(stationCard);
    }

    @Override
    public void onBindViewHolder(final StationViewHolder holder, final int position) {
        holder.updateUi(this.stations.get(position));

        holder.mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "You clicked on station " + stations.get(position).getTitle(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
