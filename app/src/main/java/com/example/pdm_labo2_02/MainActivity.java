package com.example.pdm_labo2_02;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //private ArrayList<String> images = new ArrayList<>();
    //private ArrayList<Integer> images = new ArrayList<>();
    private Integer[] images;
    private ImageView[] grids;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images=new Integer[]{R.drawable.img1, R.drawable.img2, R.drawable.img3};
        grids = new ImageView[]{findViewById(R.id.grid1),findViewById(R.id.grid2),findViewById(R.id.grid3),findViewById(R.id.grid4),
                findViewById(R.id.grid5),findViewById(R.id.grid6),findViewById(R.id.grid7),findViewById(R.id.grid8),findViewById(R.id.grid9)};
        //images.add("img1");images.add("img2");images.add("img3");

        for (ImageView grid : grids) {
            int inicial = (int)(Math.random()*2);
            grid.setImageResource(images[inicial]);
            grid.setOnClickListener( v->{
                int aleatorio = (int)(Math.random()*2);
                grid.setImageResource(images[aleatorio]);
            });
        }

    }
}
