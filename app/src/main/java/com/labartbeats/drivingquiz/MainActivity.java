package com.labartbeats.drivingquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //TODO: Create an answer sheet to store the user's answers and initialize all answers to incorrect
    AnswerSheet answerSheet = new AnswerSheet();

    //TODO: Update the answer sheet with the user's answers
    //Handles clicks on RadioButtons and stores the answers in the AnswerSheet
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Stores the user's answers in the answer sheet
        switch (view.getId()) {

            case R.id.question1answer1:
                if (checked)

                    break;

            case R.id.question1answer3:
                if (checked)
                    answerSheet.answer1 = "correct";
                break;
            case R.id.question2answer1:
                if (checked)
                    answerSheet.answer2 = "correct";
                break;
            case R.id.question3answer3:
                if (checked)
                    answerSheet.answer3 = "correct";
                break;
            case R.id.question4answer1:
                if (checked)
                    answerSheet.answer4 = "correct";
                break;
            case R.id.question5answer2:
                if (checked)
                    answerSheet.answer5 = "correct";
                break;
            case R.id.question6answer3:
                if (checked)
                    answerSheet.answer6 = "correct";
                break;
            case R.id.question8answer3:
                if (checked)
                    answerSheet.answer8 = "correct";
                break;
            case R.id.question9answer1:
                if (checked)
                    answerSheet.answer9 = "correct";
                break;
            case R.id.question10answer2:
                if (checked)
                    answerSheet.answer10 = "correct";
                break;
        }
    }

    //TODO: Check the user's answers to see if they are correct
    //TODO: Tabulate the user's score and display in a toast message when the user clicks "Submit"


    //  Called when the user clicks the Submit Answers button
    public int gradeAnswerSheet() {
        int grade = 0;

        if (answerSheet.answer1 == "correct") {
            grade = grade + 10;

        }

        if (answerSheet.answer2 == "correct") {
            grade = grade + 10;
        }

        if (answerSheet.answer3 == "correct") {
            grade = grade + 10;
        }

        if (answerSheet.answer4 == "correct") {
            grade = grade + 10;
        }

        if (answerSheet.answer5 == "correct") {
            grade = grade + 10;
        }

        if (answerSheet.answer6 == "correct") {
            grade = grade + 10;
        }

        if (answerSheet.answer7 == "correct") {
            grade = grade + 10;
        }

        if (answerSheet.answer8 == "correct") {
            grade = grade + 10;
        }

        if (answerSheet.answer9 == "correct") {
            grade = grade + 10;
        }

        if (answerSheet.answer10 == "correct") {
            grade = grade + 10;
        }

        return grade;
    }

    Context context = getApplicationContext();
    CharSequence text = "Your grade is " + gradeAnswerSheet() + "%";
    int duration = Toast.LENGTH_LONG;

    Toast toast = Toast.makeText(context, text, duration);
    toast.show();


}
