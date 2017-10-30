package com.example.ok.tagrebsecond.Fragmentes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ok.tagrebsecond.R;

/**
 * Created by ok on 25/10/2017.
 */



public class Fragment_two extends Fragment {
Bundle b;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b=getArguments();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_two,container,false);
        String g= b.getString("A");
        Toast.makeText(getActivity(),g+ "", Toast.LENGTH_SHORT).show();
        return v;
    }


}
