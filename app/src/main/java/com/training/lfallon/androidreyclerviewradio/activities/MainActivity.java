package com.training.lfallon.androidreyclerviewradio.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.training.lfallon.androidreyclerviewradio.R;
import com.training.lfallon.androidreyclerviewradio.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment)fragmentManager.findFragmentById(R.id.mainFragmentContainer);
        if(mainFragment == null){
            mainFragment = MainFragment.newInstance("blah", "bleh");
            fragmentManager.beginTransaction()
                    .add(R.id.mainFragmentContainer, mainFragment)
                    .commit();
        }

    }
}
