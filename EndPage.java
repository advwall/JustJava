package com.example.android.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndPage extends AppCompatActivity {

    int score = 0;


}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myscore);

    }

    /**
     * This displays the user's final score.
     * @param finalScore
     */

    public void displayScore (int finalScore) {
        TextView scoreTextView = findViewById(R.id.finalScore);
        scoreTextView.setText(score);
    }

    public void startOver (View v) {
        Button startOver = findViewById(R.id.startOver);

        Intent startOver = new Intent(this, startpage.class);
        startActivity(startpage);

    }