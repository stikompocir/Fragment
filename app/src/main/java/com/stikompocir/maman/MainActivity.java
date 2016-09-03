package com.stikompocir.maman;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

import com.stikompocir.maman.fragment.FragmentB;

public class MainActivity extends AppCompatActivity implements Comunicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    private void setSupportActionBar(Toolbar toolbar) {

    }

    @Override
    public void respond (String data){
        FragmentManager manager = getFragmentManager();
        FragmentB f2= (FragmentB) manager.findFragmentById(R.id.fragment2);//untuk mendapatkan referensi FragmentB
        f2.changeText(data);//dikirim ke method changeText(data) pada FragmentB
    }
}
