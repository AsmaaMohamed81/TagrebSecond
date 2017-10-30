package com.example.ok.tagrebsecond.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ok.tagrebsecond.Fragmentes.Fragment_one;
import com.example.ok.tagrebsecond.Fragmentes.Fragment_two;
import com.example.ok.tagrebsecond.R;

public class MainActivity extends AppCompatActivity {
Button Fone,Ftwo;

  private   Fragment_one fragmentone;
  private  Fragment_two fragmenttwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fone=(Button)findViewById(R.id.fragmentone);
        Ftwo=(Button)findViewById(R.id.fragmenttwo);

        fragmentone = new Fragment_one();
        fragmenttwo=new Fragment_two();

        Bundle bun = new Bundle();

        bun.putString("F","farida");
        bun.putString("A","asmaa");

        fragmentone.setArguments(bun);
        fragmenttwo.setArguments(bun);


        Fone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment,fragmentone)
                        .commit();



            }
        });

        Ftwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment, fragmenttwo )
                        .commit();

            }
        });




    }
}
