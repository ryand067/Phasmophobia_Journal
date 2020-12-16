package com.example.phasmophobiajournal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Phantom_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phantom);

        //Add all UI Elements
        ImageButton btNextPage = (ImageButton) findViewById(R.id.btNextPagePhantom);
        ImageButton btPreviousPage = (ImageButton) findViewById(R.id.btPreviousPagePhantom);

        //Next Page
        btNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Phantom_Activity.this, Poltergeist_Activity.class));
            }
        });

        //Previous Page
        btPreviousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Phantom_Activity.this, Wraith_Activity.class));
            }
        });




    }
}
