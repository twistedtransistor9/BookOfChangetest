package com.myandroidhello.bookofchangetest;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image1, image2, image3, image4, image5, image6, coinImg;
    Button rollButton;
    TextView resultsTextView;
    int i = 1; // is used for step-by-step image change


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
        coinImg = (ImageView) findViewById(R.id.coinImg);
        rollButton = (Button) (findViewById(R.id.rollButton));
        resultsTextView = (TextView)findViewById(R.id.textResult);

        Resources res = getResources();
        final String[] results = res.getStringArray(R.array.results);



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
                    flipIt(); //initialize coin flip

                } else if (i == 2) {
                    Random rand = new Random();
                    int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
                    String imgName = "img" + rndInt;
                    int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                    image2.setVisibility(View.VISIBLE);
                    image2.setImageResource(id);
                    i = i + 1;

                } else if (i == 3) {
                    Random rand = new Random();
                    int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
                    String imgName = "img" + rndInt;
                    int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                    image3.setVisibility(View.VISIBLE);
                    image3.setImageResource(id);
                    i = i + 1;

                } else if (i == 4) {
                    Random rand = new Random();
                    int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
                    String imgName = "img" + rndInt;
                    int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                    image4.setVisibility(View.VISIBLE);
                    image4.setImageResource(id);
                    i = i + 1;

                } else if (i == 5) {
                    Random rand = new Random();
                    int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
                    String imgName = "img" + rndInt;
                    int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                    image5.setVisibility(View.VISIBLE);
                    image5.setImageResource(id);
                    i = i + 1;

                } else if (i == 6) {
                    Random rand = new Random();
                    int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
                    String imgName = "img" + rndInt;
                    int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                    image6.setVisibility(View.VISIBLE);
                    image6.setImageResource(id);
                    i = i + 1;
                    resultsTextView.setText(results[0]);
                }
            }
        });

    }

    private void flipIt() {
        ObjectAnimator flip = ObjectAnimator.ofFloat(coinImg, "rotationY", 0f, 3600f);
        flip.setDuration(3000);
        flip.start();
    }
}
