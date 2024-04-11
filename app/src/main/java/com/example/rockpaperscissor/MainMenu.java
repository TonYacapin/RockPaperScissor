package com.example.rockpaperscissor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button btnPlay = findViewById(R.id.btn_play);

        Button btnExit = findViewById(R.id.btn_exit);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open MainActivity when "Play" button is clicked
                Intent intent = new Intent(MainMenu.this, Rules.class);
                startActivity(intent);
            }
        });



        btnExit.setOnClickListener(view -> {
            System.exit(0);

        });
    }
}
