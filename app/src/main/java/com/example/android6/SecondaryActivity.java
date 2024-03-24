package com.example.android6;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Home");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        NavController navController = Navigation.findNavController
                (SecondaryActivity.this, R.id.nav_host_fragment_secondary);

        if (id == R.id.home) {
            Toast.makeText(SecondaryActivity.this, "Home", Toast.LENGTH_SHORT).show();
            navController.navigate(R.id.action_secondaryFragment1_to_secondaryFragment2);

        } else if (id == R.id.notification) {
            Toast.makeText(SecondaryActivity.this, "Set", Toast.LENGTH_SHORT).show();
            navController.navigate(R.id.action_secondaryFragment2_to_secondaryFragment1);
        } else if (id == R.id.settings) {
            Intent myIntent = new Intent(SecondaryActivity.this, MainActivity.class);
            SecondaryActivity.this.startActivity(myIntent);
        }
        return true;
    }
}