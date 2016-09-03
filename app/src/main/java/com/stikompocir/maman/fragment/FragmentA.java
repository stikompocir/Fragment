package com.stikompocir.maman.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.stikompocir.maman.Comunicator;
import com.stikompocir.maman.R;

/**
 * Created by Maman on 7/26/2016.
 */
public class FragmentA extends Fragment implements View.OnClickListener {

    Button button;
    int counter = 0;
    Comunicator comm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState){
        return inflater.inflate(R.layout.fragment_a,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        comm = (Comunicator) getActivity();
        button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){ /* untuk menghendle method onclick kita perlu implements View.OnClickListener */
        counter ++; // setiap diclick akan bertambah nilai dari variabel counter.
        comm.respond("Tombol telah di sentuh "+counter+" kali"); //dikirim ke MainActivity melalui method pada interface yang implementasikan.
    }
}
