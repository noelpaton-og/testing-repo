package com.example.noel;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Sample code to display a welcome message
        TextView welcomeText = findViewById(R.id.welcome_text);
        welcomeText.setText("Welcome to Noel");
        
        // Set up a simple click listener
        View rootView = findViewById(R.id.root_layout);
        rootView.setOnClickListener(v -> {
            Toast.makeText(this, "Hello from Noel!", Toast.LENGTH_SHORT).show();
        });
    }
}