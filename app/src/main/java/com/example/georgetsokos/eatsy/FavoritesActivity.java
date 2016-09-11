package com.example.georgetsokos.eatsy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite);

        LinearLayout goToSettings = (LinearLayout) findViewById(R.id.settings1);

        goToSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSettingsIntent = new Intent(FavoritesActivity.this, SettingsActivity.class);
                startActivity(goToSettingsIntent);
            }
        });
    }
}
