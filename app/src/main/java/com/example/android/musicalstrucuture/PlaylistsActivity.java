package com.example.android.musicalstrucuture;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        ImageView homeButton = (ImageView) findViewById(R.id.home);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(PlaylistsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        ImageView libraryButton = (ImageView) findViewById(R.id.library);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(PlaylistsActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        ImageView searchButton = (ImageView) findViewById(R.id.search);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(PlaylistsActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
    }
}
