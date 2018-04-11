package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12;

    RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10;

    EditText indie, nagpra;

    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = findViewById(R.id.classicarch);
        cb2 = findViewById(R.id.crm);
        cb3 = findViewById(R.id.garbology);
        cb4 = findViewById(R.id.paleo);
        cb5 = findViewById(R.id.question5Trowel);
        cb6 = findViewById(R.id.screen);
        cb7 = findViewById(R.id.question5Gps);
        cb8 = findViewById(R.id.question5Dozer);
        cb9 = findViewById(R.id.question6crmFirm);
        cb10 = findViewById(R.id.question6Shpo);
        cb11 = findViewById(R.id.question6Hospital);
        cb12 = findViewById(R.id.question6Egypt);

        rb1 = findViewById(R.id.question1Dinos);
        rb2 = findViewById(R.id.question1spoods);
        rb3 = findViewById(R.id.question1MC);
        rb4 = findViewById(R.id.question1AT);
        rb5 = findViewById(R.id.question3Gold);
        rb6 = findViewById(R.id.question3Natives);
        rb7 = findViewById(R.id.question3DinoBones);
        rb8 = findViewById(R.id.question3Artifacts);
        rb9 = findViewById(R.id.question8TF1);
        rb10 = findViewById(R.id.question8TF2);

        indie = findViewById(R.id.question4Indiana);
        nagpra = findViewById(R.id.question7Nagpra);
    }


// Question 1
    public void question1 (View v) {
        if (rb3.isChecked()) {
            score++;
        }
    }

// Question 2
    public void question2 (View v) {
        if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()) {
            score++;
        }
    }

    // Question 3
    public void question3 (View v) {
        if (rb8.isChecked()) {
            score++;
        }
    }

    // Question 4
    public void question4 (View v) {
        if (String == "Indiana Jones" || "Lara Croft") {
            score++;
        }
    }

    // Question 5
    public void question5 (View v) {
        if (cb5.isChecked() && cb6.isChecked() && cb7.isChecked()) {
            score++;
        }
    }

    // Question 6
    public void question6 (View v) {
        if (cb9.isChecked() && cb10.isChecked() && cb12.isChecked()) {
            score++;
        }
    }

    // Question 7
    public void question7 (View v) {
        if (String == "Native American Graves Repatriation Act") {
            score++;
        }
    }

    // Question 8
    public void question8 (View v) {
        if (rb10.isChecked()) {
            score++;
        }
    }






}
