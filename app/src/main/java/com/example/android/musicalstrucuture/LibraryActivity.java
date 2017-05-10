package com.example.android.musicalstrucuture;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // Find the View that shows each Activity
        TextView genreButton = (TextView) findViewById(R.id.genre);
        TextView artistButton = (TextView) findViewById(R.id.artist);
        TextView albumButton = (TextView) findViewById(R.id.album);


        // Set a click listener on the home activity
        ImageView homeButton = (ImageView) findViewById(R.id.home);
        homeButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(LibraryActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        ImageView playlistButton = (ImageView) findViewById(R.id.playlists);
        playlistButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(LibraryActivity.this, PlaylistsActivity.class);
                startActivity(playlistIntent);
            }
        });

        ImageView searchButton = (ImageView) findViewById(R.id.search);
        searchButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(LibraryActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
    }
}
