package com.example.phasmophobiajournal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Tools2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tools2);

        //Add all UI Elements
        ImageButton btNextPage = (ImageButton) findViewById(R.id.btNextPageTools2);
        ImageButton btPreviousPage = (ImageButton) findViewById(R.id.btPreviousPageTools2);

        //Next Page
        btNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tools2_Activity.this, Gathering_Evidence1_Activity.class));
            }
        });

        //Previous Page
        btPreviousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tools2_Activity.this, Tools1_Activity.class));
            }
        });




    }
}
