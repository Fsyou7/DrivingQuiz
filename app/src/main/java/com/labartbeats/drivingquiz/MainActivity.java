package com.labartbeats.drivingquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitAnswer(View view) {
        //A list of variables needed for the program

        int quizScore = 0;
        Log.i("MainActivity.java", Integer.toString(quizScore));

        //Things that happen when the submit button is pressed
        //TODO: Get an answer for question 1 and check for correctness
        RadioButton question1selected = (RadioButton) findViewById(R.id.question1answer3);

        if (question1selected.isChecked()){
          quizScore = quizScore + 10;
            Log.i("MainActivity.java",Integer.toString(quizScore));

         }



        //TODO: Increment the quiz score for oorrect answers
        //TODO: Display the quiz score in a toast

    }


}
