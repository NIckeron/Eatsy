package com.example.georgetsokos.eatsy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class WeeklyProgramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weekly_program);

        LinearLayout firstDayButton = (LinearLayout) findViewById(R.id.first_day);
        LinearLayout secondDayButton = (LinearLayout) findViewById(R.id.second_day);
        LinearLayout thirdDayButton = (LinearLayout) findViewById(R.id.third_day);
        LinearLayout fourthDayButton = (LinearLayout) findViewById(R.id.fourth_day);
        LinearLayout fifthDayButton = (LinearLayout) findViewById(R.id.fifth_day);

        ImageButton goToSettings = (ImageButton) findViewById(R.id.goToSettings);
        ImageButton goToProfile = (ImageButton) findViewById(R.id.goToProfile);
        ImageButton goToExercise = (ImageButton) findViewById(R.id.goToExercise);

        goToSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSettingsIntent = new Intent(WeeklyProgramActivity.this, SettingsActivity.class);
                startActivity(goToSettingsIntent);
            }
        });

        goToExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToExerciseIntent = new Intent(WeeklyProgramActivity.this, ExerciseActivity.class);
                startActivity(goToExerciseIntent);
            }
        });

        goToProfile.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent goToProfileIntent = new Intent(WeeklyProgramActivity.this, ProfileActivity.class);
                startActivity(goToProfileIntent);
            }
        });

        firstDayButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SIGN UP}
                Intent seeDayMenuIntent = new Intent(WeeklyProgramActivity.this, firstDayActivity.class);

                // Start the new activity
                startActivity(seeDayMenuIntent);
            }
        });

        secondDayButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SIGN UP}
                Intent seeDayMenuIntent = new Intent(WeeklyProgramActivity.this, firstDayActivity.class);

                // Start the new activity
                startActivity(seeDayMenuIntent);
            }
        });

        thirdDayButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SIGN UP}
                Intent seeDayMenuIntent = new Intent(WeeklyProgramActivity.this, firstDayActivity.class);

                // Start the new activity
                startActivity(seeDayMenuIntent);
            }
        });

        fourthDayButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SIGN UP}
                Intent seeDayMenuIntent = new Intent(WeeklyProgramActivity.this, firstDayActivity.class);

                // Start the new activity
                startActivity(seeDayMenuIntent);
            }
        });

        fifthDayButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SIGN UP}
                Intent seeDayMenuIntent = new Intent(WeeklyProgramActivity.this, firstDayActivity.class);

                // Start the new activity
                startActivity(seeDayMenuIntent);
            }
        });

    }
}
