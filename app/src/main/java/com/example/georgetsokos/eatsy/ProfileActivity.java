package com.example.georgetsokos.eatsy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        ImageButton goToSettings = (ImageButton) findViewById(R.id.goToSettings);
        ImageButton goToWeeklyProgram = (ImageButton) findViewById(R.id.goToWeeklyProgram);
        ImageButton goToExercise = (ImageButton) findViewById(R.id.goToExercise);

        goToSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSettingsIntent = new Intent(ProfileActivity.this, SettingsActivity.class);
                startActivity(goToSettingsIntent);
            }
        });

        goToExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToExerciseIntent = new Intent(ProfileActivity.this, ExerciseActivity.class);
                startActivity(goToExerciseIntent);
            }
        });

        goToWeeklyProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToWeeklyProgramIntent = new Intent(ProfileActivity.this, WeeklyProgramActivity.class);
                startActivity(goToWeeklyProgramIntent);
            }
        });

    }
}
