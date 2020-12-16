package com.example.phasmophobiajournal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Mare_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mare);

        //Add all UI Elements
        ImageButton btNextPage = (ImageButton) findViewById(R.id.btNextPageMare);
        ImageButton btPreviousPage = (ImageButton) findViewById(R.id.btPreviousPageMare);

        //Next Page
        btNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mare_Activity.this, Revenant_Activity.class));
            }
        });

        //Previous Page
        btPreviousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mare_Activity.this, Jinn_Activity.class));
            }
        });




    }
}
