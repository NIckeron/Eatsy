package com.example.georgetsokos.eatsy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signUpButton = (Button) findViewById(R.id.sign);
        Button logInButton = (Button) findViewById(R.id.log);
        Button tryNowButton = (Button) findViewById(R.id.trynow);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SIGN UP}
                Intent signUpIntent = new Intent(MainActivity.this, SignUp.class);

                // Start the new activity
                startActivity(signUpIntent);
            }
        });

        logInButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LOG IN}
                Intent logInIntent = new Intent(MainActivity.this, LogInActivity.class);

                // Start the new activity
                startActivity(logInIntent);
            }
        });

        tryNowButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the signup button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LOG IN}
                Intent tryNowIntent = new Intent(MainActivity.this, GoalActivity.class);

                // Start the new activity
                startActivity(tryNowIntent);
            }
        });
    }
}




/**
 * This app displays an order form to order coffee.
 */

    /**
     * This method is called when the plus button is clicked.
     */

