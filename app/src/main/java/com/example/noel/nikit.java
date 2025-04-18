package com.example.noel;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class nikit extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nikit);
        
        // Sample code for nikit
        TextView screenTitle = findViewById(R.id.screen_title);
        if (screenTitle != null) {
            screenTitle.setText("nikit Screen");
        }
    }
}