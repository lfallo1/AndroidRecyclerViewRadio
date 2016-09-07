package com.training.lfallon.androidreyclerviewradio.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.training.lfallon.androidreyclerviewradio.R;
import com.training.lfallon.androidreyclerviewradio.adapters.StationsAdapter;

public class StationsFragment extends Fragment {

    private static final String ARG_STATION_TYPE = "station_type";

    private static final int STATION_TYPE_FEATURED = 0;
    private static final int STATION_TYPE_RECENT = 1;
    private static final int STATION_TYPE_PARTY = 2;

    private int mStationType = -1;


    public StationsFragment() {
    }

    public static StationsFragment newInstance(int stationType) {
        StationsFragment fragment = new StationsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_STATION_TYPE, stationType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mStationType = getArguments().getInt(ARG_STATION_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_stations, container, false);

        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.recyclerViewStations);
        recyclerView.setHasFixedSize(true);

        StationsAdapter stationsAdapter = new StationsAdapter(mStationType);
        recyclerView.setAdapter(stationsAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        return v;
    }

}
