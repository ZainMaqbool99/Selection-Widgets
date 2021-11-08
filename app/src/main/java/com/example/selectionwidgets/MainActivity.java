package com.example.selectionwidgets;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSimpleList = findViewById(R.id.btnSimpleList);
        Button btnSpinner = findViewById(R.id.btnSpinner);
        Button btnGrid = findViewById(R.id.btnGridView);
        Button btnAutoComplete = findViewById(R.id.btnAutoComplete);
        Button btnGallery = findViewById(R.id.btnGalley);

        btnSimpleList.setOnClickListener(x->{
            Intent intent = new Intent(MainActivity.this, SimpleList.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnSpinner.setOnClickListener(x->{
            Intent intent = new Intent(MainActivity.this, Spinner.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnGrid.setOnClickListener(x->{
            Intent intent = new Intent(MainActivity.this, GridExample.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnAutoComplete.setOnClickListener(x->{
            Intent intent = new Intent(MainActivity.this, AutoCompleteText.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnGallery.setOnClickListener(x->{
            Intent intent = new Intent(MainActivity.this, GalleryWidget.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

    }
}