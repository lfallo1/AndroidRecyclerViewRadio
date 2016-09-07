package com.training.lfallon.androidreyclerviewradio.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.training.lfallon.androidreyclerviewradio.R;
import com.training.lfallon.androidreyclerviewradio.model.Station;

public class StationViewHolder extends RecyclerView.ViewHolder{

    public ImageView mImageView;
    public TextView mTextView;

    public StationViewHolder(View itemView) {
        super(itemView);
        this.mImageView = (ImageView)itemView.findViewById(R.id.card_image_view);
        this.mTextView = (TextView)itemView.findViewById(R.id.card_title_text);
    }

    public void updateUi(Station station){
        String uri = station.getImageName();
        int resource = mImageView.getResources().getIdentifier(uri, null, mImageView.getContext().getPackageName());
        mImageView.setImageResource(resource);
        mTextView.setText(station.getTitle());
    }

}
