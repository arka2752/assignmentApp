package com.example.assignmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.enterbtn);

        btn.setOnClickListener(v->{
            Intent intent =new Intent(MainActivity.this,FirstActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        });

    }
}