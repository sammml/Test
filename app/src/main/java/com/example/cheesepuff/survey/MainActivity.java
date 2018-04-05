package com.example.cheesepuff.survey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreCount = 0;

    EditText name;
    RadioButton question1a2;
    RadioButton question2a3;
    RadioButton question3a1;
    RadioButton question4a1;
    RadioButton question5a1;
    EditText question6answer;
    CheckBox question7a2;
    CheckBox question7a3;
    RadioButton question8a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        //user can only hit the submit button once
        view.setEnabled(false);

        name = (EditText) findViewById(R.id.name_field);
        String usersName = name.getText().toString();

        //question 1
        question1a2 = (RadioButton) findViewById(R.id.question1a2);
        boolean question1_rg = question1a2.isChecked();

        //question 2
        question2a3 = (RadioButton) findViewById(R.id.question2a3);
        boolean question2_rg = question2a3.isChecked();

        //question 3
        question3a1 = (RadioButton) findViewById(R.id.question3a1);
        boolean question3_rg = question3a1.isChecked();


        //question 4
        question4a1 = (RadioButton) findViewById(R.id.question4a1);
        boolean question4_rg = question4a1.isChecked();

        //question 5
        question5a1 = (RadioButton) findViewById(R.id.question5a1);
        boolean question5_rg = question5a1.isChecked();


        //question6
        question6answer = (EditText) findViewById(R.id.question6answer);
        String question6 = question6answer.getText().toString();

        //question7
        question7a2 = (CheckBox) findViewById(R.id.question7a2);
        boolean checkedQuestion7a2 = question7a2.isChecked();

        question7a3 = (CheckBox) findViewById(R.id.question7a3);
        boolean checkedQuestion7a3 = question7a2.isChecked();

        //question 8
        question8a1 = (RadioButton) findViewById(R.id.question8a1);
        boolean question8_rg = question8a1.isChecked();

        scoreCount = scoreCalculated(question1_rg, question2_rg, question3_rg, question4_rg, question5_rg, String question6, checkedQuestion7a2, checkedQuestion7a3, question8_rg);

        Toast toast = Toast.makeText(getApplicationContext(), "Good JOb, " + name + " ! Your score is " + scoreCount + " out of 10 points!", Toast.LENGTH_LONG);
        toast.show();

    }

    public int scoreCalculated(boolean question1_rg, boolean question2_rg, boolean question3_rg, boolean question4_rg, boolean question5_rg, boolean question6, boolean checkedQuestion7a2, boolean checkedQuestion7a3, boolean question8_rg) {

        int scoreCount = 0;

        //add 1 point if answer is correct question 1

        if (question1_rg == true)
            scoreCount = scoreCount + 1;

        //add 1 point if answer is correct question 2

        if (question2_rg == true)
            scoreCount = scoreCount + 1;

        //add 1 point if answer is correct question 3

        if (question3_rg == true)
            scoreCount = scoreCount + 1;

        //add 1 point if answer is correct question 4

        if (question4_rg == true)
            scoreCount = scoreCount + 1;

        //add 1 point if answer is correct question 5

        if (question5_rg == true)
            scoreCount = scoreCount + 1;

        //add 1 point if answer is correct question 6

        if (question6.("kerning")) {
            scoreCount = scoreCount + 1;

            // add 1 point if answer is correct question 7

            if (checkedQuestion7a2 == true && checkedQuestion7a3 == true)
                scoreCount = scoreCount + 1;

            // add 1 point if answer is correct question 8

            if (question8_rg == true)
                scoreCount = scoreCount + 1;

            // calculate the total score from radio button questions

        }
        return scoreCount;
    }

}

