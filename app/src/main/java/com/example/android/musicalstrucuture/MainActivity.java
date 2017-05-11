package com.example.android.musicalstrucuture;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView playlistButton = (ImageView) findViewById(R.id.playlists);
        playlistButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistIntent);
                finish();
            }
        });

        ImageView libraryButton = (ImageView) findViewById(R.id.library);
        libraryButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
                finish();
            }
        });

        ImageView searchButton = (ImageView) findViewById(R.id.search);
        searchButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
                finish();
            }
        });
    }
}
