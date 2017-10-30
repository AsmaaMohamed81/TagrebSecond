package com.example.ok.tagrebsecond.Fragmentes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ok.tagrebsecond.R;

public class Fragment_one extends Fragment {
Bundle bu;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bu = getArguments();


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View V=inflater.inflate(R.layout.fragment_one,container,false);

        String d=bu.getString("F");

        Toast.makeText(getActivity(),d+ "", Toast.LENGTH_SHORT).show();
        return V;
    }
}
