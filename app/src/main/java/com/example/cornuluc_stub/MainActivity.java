package com.example.cornuluc_stub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View stub = findViewById(R.id.myViewStub);
        Button button_show = (Button) findViewById(R.id.button_show);


        // Sur le clique du bouton "show"
        button_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stub.setVisibility(View.VISIBLE); // On affiche le bouton "hide"

                Toast.makeText(getApplicationContext(), "Le bouton est affiché", Toast.LENGTH_LONG).show();


                // Sur le clique du bouton "hide"
                findViewById(R.id.myViewStubVisible).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        stub.setVisibility(View.INVISIBLE); // On cache le bouton "hide"

                        Toast.makeText(getApplicationContext(), "Le bouton est caché", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });


    }
}