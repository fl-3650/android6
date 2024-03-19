package com.example.android6;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemReselectedListener
            (item -> {
                if (item.getItemId() == R.id.home) {
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_LONG).show();
                } else if (item.getItemId() == R.id.settings) {
                    Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_LONG).show();
                }
            });
    }
}