package com.example.georgetsokos.eatsy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class firstDayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daily_program);
        LinearLayout breakfastButton = (LinearLayout) findViewById(R.id.breakfast);
        LinearLayout msnackButton = (LinearLayout) findViewById(R.id.snack1);
        LinearLayout lunchButton = (LinearLayout) findViewById(R.id.lunch);
        LinearLayout asnackButton = (LinearLayout) findViewById(R.id.snack2);
        LinearLayout dinnerButton = (LinearLayout) findViewById(R.id.dinner);

        ImageButton goToSettings = (ImageButton) findViewById(R.id.goToSettings);
        ImageButton goToProfile = (ImageButton) findViewById(R.id.goToProfile);
        ImageButton goToExercise = (ImageButton) findViewById(R.id.goToExercise);

        goToSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSettingsIntent = new Intent(firstDayActivity.this, SettingsActivity.class);
                startActivity(goToSettingsIntent);
            }
        });

        goToExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToExerciseIntent = new Intent(firstDayActivity.this, ExerciseActivity.class);
                startActivity(goToExerciseIntent);
            }
        });

        goToProfile.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent goToProfileIntent = new Intent(firstDayActivity.this, ProfileActivity.class);
                startActivity(goToProfileIntent);
            }
        });

        breakfastButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SIGN UP}
                Intent seeMealRecipeIntent = new Intent(firstDayActivity.this, MealRecipeActivity.class);

                // Start the new activity
                startActivity(seeMealRecipeIntent);
            }
        });

        msnackButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SIGN UP}
                Intent seeMealRecipeIntent = new Intent(firstDayActivity.this, MealRecipeActivity.class);

                // Start the new activity
                startActivity(seeMealRecipeIntent);
            }
        });

        lunchButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SIGN UP}
                Intent seeMealRecipeIntent = new Intent(firstDayActivity.this, MealRecipeActivity.class);

                // Start the new activity
                startActivity(seeMealRecipeIntent);
            }
        });

        asnackButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SIGN UP}
                Intent seeMealRecipeIntent = new Intent(firstDayActivity.this, MealRecipeActivity.class);

                // Start the new activity
                startActivity(seeMealRecipeIntent);
            }
        });

        dinnerButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SIGN UP}
                Intent seeMealRecipeIntent = new Intent(firstDayActivity.this, MealRecipeActivity.class);

                // Start the new activity
                startActivity(seeMealRecipeIntent);
            }
        });
    }
}
