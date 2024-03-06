package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // initialize score and total to zero
    int scoreVal = 0;
    int totalVal = 0;

    // creating a new object from Random class
    Random rand_int = new Random();

    // getting references for the imageViews
    ImageView imgDice1, imgDice2;
    // get references to buttons
    Button btnRoll, btnReset;
    // get references to text views
    TextView txtScore, txtTotal;

    // arrays for black and red dice values
    int[] blackDiceValues = {1, 2, 3, 4, 5, 6};
    int[] redDiceValues = {1, 2, 3, 4, 5, 6};
    // array for dice images
    int[] diceImages = {R.drawable.black1, R.drawable.black2,
            R.drawable.black3, R.drawable.black4,
            R.drawable.black5, R.drawable.black6,
            R.drawable.red1, R.drawable.red2,
            R.drawable.red3, R.drawable.red4,
            R.drawable.red5, R.drawable.red6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // getting references to imageViews
        imgDice1 = findViewById(R.id.imgDice1);
        imgDice2 = findViewById(R.id.imgDice2);
        // getting references to buttons
        btnRoll = findViewById(R.id.btnRoll);
        btnReset = findViewById(R.id.btnReset);
        // getting references to text views
        txtScore = findViewById(R.id.txtScore);
        txtTotal = findViewById(R.id.txtTotal);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diceRoll();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetVal();
            }
        });

    }

    public void diceRoll(){
        // assigning values to dice images
        int dice1_val = rand_int.nextInt(blackDiceValues.length);
        int dice2_val = rand_int.nextInt(redDiceValues.length);

        // Set the images for the dice
        int dice1Drawable = diceImages[dice1_val];
        int dice2Drawable = diceImages[dice2_val + blackDiceValues.length];
        imgDice1.setImageResource(dice1Drawable);
        imgDice2.setImageResource(dice2Drawable);

        scoreVal = blackDiceValues[dice1_val] + redDiceValues[dice2_val];
        totalVal += scoreVal;

        txtScore.setText(String.valueOf(scoreVal));
        txtTotal.setText(String.valueOf(totalVal));
    }

    private void resetVal() {
        imgDice1.setImageResource(R.drawable.blank);
        imgDice2.setImageResource(R.drawable.blank);
        scoreVal = 0;
        totalVal = 0;
        txtScore.setText("0");
        txtTotal.setText("0");
    }

}
