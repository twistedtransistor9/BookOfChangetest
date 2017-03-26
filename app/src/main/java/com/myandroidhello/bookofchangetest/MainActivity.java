package com.myandroidhello.bookofchangetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image1, image2;
    Button rollButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = (ImageView) (findViewById(R.id.imageView1));
        image2 = (ImageView)  findViewById(R.id.imageView2);
        rollButton = (Button) (findViewById(R.id.rollButton));


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i < 6; i++){
                    i = i +1;
                    if (i == 1){
                        Random rand = new Random();
                        int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
                        String imgName = "img" + rndInt;
                        int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                        image1.setVisibility(View.VISIBLE);
                        image1.setImageResource(id);
                        break;
                    }
                    if (i == 2){
                        Random rand = new Random();
                        int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
                        String imgName = "img" + rndInt;
                        int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                        image2.setVisibility(View.VISIBLE);
                        image2.setImageResource(id);
                        break;
                    }
                }

            }
        });

    }
}
