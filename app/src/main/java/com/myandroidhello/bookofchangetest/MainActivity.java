package com.myandroidhello.bookofchangetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image1, image2, image3, image4, image5, image6;
    Button rollButton;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = (ImageView) (findViewById(R.id.imageView1));
        image2 = (ImageView) findViewById(R.id.imageView2);
        image3 = (ImageView) findViewById(R.id.imageView3);
        image4 = (ImageView) findViewById(R.id.imageView4);
        image5 = (ImageView) findViewById(R.id.imageView5);
        image6 = (ImageView) findViewById(R.id.imageView6);
        rollButton = (Button) (findViewById(R.id.rollButton));


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (i == 1) {
                    Random rand = new Random();
                    int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
                    String imgName = "img" + rndInt;
                    int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                    image1.setVisibility(View.VISIBLE);
                    image1.setImageResource(id);
                    i = i + 1;

                } else if (i == 2){
                    Random rand = new Random();
                    int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
                    String imgName = "img" + rndInt;
                    int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                    image2.setVisibility(View.VISIBLE);
                    image2.setImageResource(id);
                    i = i + 1;
                } else if (i == 3){
                    Random rand = new Random();
                    int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
                    String imgName = "img" + rndInt;
                    int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                    image3.setVisibility(View.VISIBLE);
                    image3.setImageResource(id);
                    i = i + 1;
                } else if (i == 4){
                    Random rand = new Random();
                    int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
                    String imgName = "img" + rndInt;
                    int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                    image4.setVisibility(View.VISIBLE);
                    image4.setImageResource(id);
                    i = i + 1;
                } else if (i == 5){
                    Random rand = new Random();
                    int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
                    String imgName = "img" + rndInt;
                    int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                    image5.setVisibility(View.VISIBLE);
                    image5.setImageResource(id);
                    i = i + 1;
                } else if (i == 6){
                    Random rand = new Random();
                    int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
                    String imgName = "img" + rndInt;
                    int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                    image6.setVisibility(View.VISIBLE);
                    image6.setImageResource(id);
                    i = i + 1;
                }
            }
        });

    }
}
