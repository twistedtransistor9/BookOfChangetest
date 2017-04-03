package com.myandroidhello.bookofchangetest;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image1, image2, image3, image4, image5, image6, coinImg1, coinImg2, coinImg3;
    Button rollButton;
    TextView resultsTextView;
    int i = 1; // is used for step-by-step image change
    int flipDuration; // amount of seconds that coin was flipped
    String a, b, c, d, e, f;
//    String a = "";
//    String b = "";
//    String c = "";
//    String d = "";
//    String e = "";
//    String f = "";


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
        coinImg1 = (ImageView) findViewById(R.id.coinImg1);
        coinImg2 = (ImageView) findViewById(R.id.coinImg2);
        coinImg3 = (ImageView) findViewById(R.id.coinImg3);
        rollButton = (Button) findViewById(R.id.rollButton);
        resultsTextView = (TextView) findViewById(R.id.textResult);


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipAll();
//
            }
        });

    }

    private void flipAll() {
        flipIt(coinImg1);
        flipIt(coinImg2);
        flipIt(coinImg3);
    }

    private void flipIt(ImageView resource) {

        ObjectAnimator flip = ObjectAnimator.ofFloat(resource, "rotationY", 0f, 3600f);
        Random rand = new Random();
        flipDuration = rand.nextInt(3000 - 2000 + 1) + 2000;
        flip.setDuration(flipDuration);
        flip.start();
        flip.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {

                if (i == 3) {
                    showImg(image1);
                } else if (i == 6) {
                    showImg(image2);
                } else if (i == 9) {
                    showImg(image3);
                } else if (i == 12) {
                    showImg(image4);
                } else if (i == 15) {
                    showImg(image5);
                } else if (i == 18) {
                    showImg(image6);
                }
                i = i + 1;
            }
        });
    }

    private void showImg(ImageView img) {


        Random rand = new Random();
        int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
        if (rndInt == 1){
            if (i == 3) {
                a ="0";
            } else if (i == 6) {
                b ="0";
            } else if (i == 9) {
                c ="0";
            } else if (i == 12) {
                d ="0";
            } else if (i == 15) {
                e ="0";
            } else if (i == 18) {
                f ="0";
            }
        } else {
            if (i == 3) {
                a ="1";
            } else if (i == 6) {
                b ="1";
            } else if (i == 9) {
                c ="1";
            } else if (i == 12) {
                d ="1";
            } else if (i == 15) {
                e ="1";
            } else if (i == 18) {
                f ="1";
            }

        }

        String imgName = "img" + rndInt;
        int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
        img.setVisibility(View.VISIBLE);
        img.setImageResource(id);
        if (i == 18){
            Resources res = getResources();
            String[] resultsArray = res.getStringArray(R.array.results);
            String results = a + b + c + d + e + f;
            resultsTextView.setText(results);
        }
    }


}
