package com.example.fifthlessonandroidapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView counterTextView;
    ImageButton addButton;
    ImageButton subButton;

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Czas zycia", "wywolana metoda on create");


        counterTextView = findViewById(R.id.counter);

        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("counter", 0);

            counterTextView.setText(Integer.toString(counter));
        }

        addButton = findViewById(R.id.addButton);
        subButton = findViewById(R.id.subButton);

        addButton.setOnClickListener(view -> {
            counter++;

            counterTextView.setText(Integer.toString(counter));
        });

        subButton.setOnClickListener(view -> {
            counter--;

            counterTextView.setText(Integer.toString(counter));
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Czas zycia", "wywolana metoda on start");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("Czas zycia", "wywolana metoda on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Czas zycia", "wywolana metoda on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Czas zycia", "wywolana metoda on stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("Czas zycia", "wywolana metoda on restart");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.i("Czas zycia", "wywolana metoda on save instance state");

        outState.putInt("counter", counter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Czas zycia", "wywolana metoda on destroy");
    }
}