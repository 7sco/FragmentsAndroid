package com.example.franciscoandrade.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bleFragmnt();
    }

    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn1:

                RedFragment redFragment=new RedFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.idframe, redFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();

                break;
            case R.id.btn2:
                bleFragmnt();
                break;
            case R.id.btn3:
                YellowFragment yellowFragment=new YellowFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.idframe, yellowFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;

        }

    }

    private void bleFragmnt() {
        BlueFragment blueFragment=new BlueFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.idframe, blueFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null)
                .commit();
    }
}
