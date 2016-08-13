package com.labartbeats.drivingquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {

        int quizScore = 0;

        //Creates variables containing the objects that hold the correct answers
        RadioButton question1selected = (RadioButton) findViewById(R.id.question1answer3);
        RadioButton question2selected = (RadioButton) findViewById(R.id.question2answer1);
        RadioButton question3selected = (RadioButton) findViewById(R.id.question3answer3);
        RadioButton question4selected = (RadioButton) findViewById(R.id.question4answer3);
        RadioButton question5selected = (RadioButton) findViewById(R.id.question5answer2);
        RadioButton question6selected = (RadioButton) findViewById(R.id.question6answer2);
        TextView question7answered = (TextView) findViewById(R.id.question7answer);
        CheckBox question8answer1selected = (CheckBox) findViewById(R.id.question8answer1);
        CheckBox question8answer2selected = (CheckBox) findViewById(R.id.question8answer2);
        CheckBox question8answer3selected = (CheckBox) findViewById(R.id.question8answer3);
        CheckBox question8answer4selected = (CheckBox) findViewById(R.id.question8answer4);
        CheckBox question8answer5selected = (CheckBox) findViewById(R.id.question8answer5);
        RadioButton question9selected = (RadioButton) findViewById(R.id.question9answer2);
        RadioButton question10selected = (RadioButton) findViewById(R.id.question10answer3);

        //Checks to see if the correct objects have been selected in the case of RadioButtons and Checkboxes,
        //and matches text in the case of the TextView, and if so, increments the quizScore accordingly
        if (question1selected.isChecked()){
          quizScore = quizScore + 10;
        }

        if (question2selected.isChecked()){
            quizScore = quizScore + 10;
        }

        if (question3selected.isChecked()){
            quizScore = quizScore + 10;
        }

        if (question4selected.isChecked()){
            quizScore = quizScore + 10;
        }

        if (question5selected.isChecked()){
            quizScore = quizScore + 10;
        }

        if (question6selected.isChecked()){
            quizScore = quizScore + 10;
        }

        if (question7answered.getText().toString().toLowerCase().equals("turn signal")){
            quizScore = quizScore + 10;
        }

        if (question8answer1selected.isChecked() && question8answer2selected.isChecked() && question8answer5selected.isChecked() && !question8answer3selected.isChecked() && !question8answer4selected.isChecked()){
            quizScore = quizScore + 10;
        }

        if (question9selected.isChecked()){
            quizScore = quizScore + 10;
        }

        if (question10selected.isChecked()){
            quizScore = quizScore + 10;
        }

        //Creates the toast message with the user's quizScore
        Context context = getApplicationContext();
        CharSequence text = "You scored " + Integer.toString(quizScore) + "% correct";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);

        //if/else clause added to meet the requirement
        if (question7answered.getText().toString().equals("")){
            text = "Please answer Question 7";
            toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            toast.show();
        }

    }


}
