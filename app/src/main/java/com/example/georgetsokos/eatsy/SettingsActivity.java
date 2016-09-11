package com.example.georgetsokos.eatsy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        ImageButton goToWeeklyProgram = (ImageButton) findViewById(R.id.goToWeeklyProgram);
        ImageButton goToProfile = (ImageButton) findViewById(R.id.goToProfile);
        ImageButton goToExercise = (ImageButton) findViewById(R.id.goToExercise);

        LinearLayout goToFavorites = (LinearLayout) findViewById(R.id.favorite);

        goToWeeklyProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToWeeklyProgramIntent = new Intent(SettingsActivity.this, WeeklyProgramActivity.class);
                startActivity(goToWeeklyProgramIntent);
            }
        });

        goToExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToExerciseIntent = new Intent(SettingsActivity.this, ExerciseActivity.class);
                startActivity(goToExerciseIntent);
            }
        });

        goToProfile.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent goToProfileIntent = new Intent(SettingsActivity.this, ProfileActivity.class);
                startActivity(goToProfileIntent);
            }
        });

        goToFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToFavoritesIntent = new Intent(SettingsActivity.this, FavoritesActivity.class);
                startActivity(goToFavoritesIntent);
            }
        });
    }
}
