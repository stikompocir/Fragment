package com.stikompocir.maman.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.stikompocir.maman.R;

/**
 * Created by Maman on 7/26/2016.
 */
public class FragmentB extends Fragment {

    TextView text;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState){
        return inflater.inflate(R.layout.fragment_b,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        text=(TextView) getActivity().findViewById(R.id.textView);
    }
    public void changeText(String data){
        text.setText(data);//menampilkan text yang dikirim dari MainActivity
    }
}
