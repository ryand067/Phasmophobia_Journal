package com.example.phasmophobiajournal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Wraith_Activity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wraith);

        //Add all UI Elements
        ImageButton btNextPage = (ImageButton) findViewById(R.id.btNextPageWraith);
        ImageButton btPreviousPage = (ImageButton) findViewById(R.id.btPreviousPageWraith);

        //Next Page
        btNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Wraith_Activity.this, Phantom_Activity.class));
            }
        });

        //Previous Page
        btPreviousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Wraith_Activity.this, Spirit_Activity.class));
            }
        });




    }
}
