package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Here we create the variable ballDisplay and set it to be linked to the image view
        final ImageView ballDispay;
        ballDispay = findViewById (R.id.image_eightBall);

        //Here we create an array containing references to the 5 images in the drawable folder
        final int [] ballArray = {R.drawable.ball1,
                        R.drawable.ball2,
                        R.drawable.ball3,
                        R.drawable.ball4,
                        R.drawable.ball5};

        //Now we define a new variable to link to the button
        Button myButton;
        myButton = findViewById (R.id.askButton);

        //Then we tell the button to listen to clicks
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Here we say that when the button listens to a click,
                //a random number between 0 and 4 is generated
                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                ballDispay.setImageResource(ballArray[number]);

            }
        });




    }
}
