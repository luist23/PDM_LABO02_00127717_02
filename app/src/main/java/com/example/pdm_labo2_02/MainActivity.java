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

    private String[] images = {"img1","img2","img3"};
    private ImageView[] grids = {findViewById(R.id.grid1),findViewById(R.id.grid2),findViewById(R.id.grid3),findViewById(R.id.grid4),
            findViewById(R.id.grid5),findViewById(R.id.grid6),findViewById(R.id.grid7),findViewById(R.id.grid8),findViewById(R.id.grid9)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (ImageView grid : grids) {
            grid.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Random r = new Random();
                    int i1 = r.nextInt(2 - 0 + 1) + 0;
                    grid.
                }
            });
        }

    }
}
