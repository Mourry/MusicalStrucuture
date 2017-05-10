package com.example.android.musicalstrucuture;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ImageView homeButton = (ImageView) findViewById(R.id.home);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        ImageView playlistButton = (ImageView) findViewById(R.id.playlists);
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(SearchActivity.this, PlaylistsActivity.class);
                startActivity(playlistIntent);
            }
        });

        ImageView libraryButton = (ImageView) findViewById(R.id.library);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(SearchActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });
    }
}
