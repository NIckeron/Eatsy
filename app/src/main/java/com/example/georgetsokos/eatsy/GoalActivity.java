package com.example.georgetsokos.eatsy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class GoalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goal);

        LinearLayout nextButton = (LinearLayout) findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SIGN UP}
                Intent signUpIntent = new Intent(GoalActivity.this, SubmitCharacteristicsActivity.class);

                // Start the new activity
                startActivity(signUpIntent);
            }
        });

    }
}
