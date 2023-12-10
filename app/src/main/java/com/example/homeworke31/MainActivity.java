package com.example.homeworke31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText editTextMail = findViewById(R.id.mail);
        TextInputEditText editTextTheme = findViewById(R.id.theme);
        TextInputEditText editTextMessage = findViewById(R.id.message);

        findViewById(R.id.button_send).setOnClickListener(v -> {

            String mail = editTextMail.getText().toString();
            String theme = editTextTheme.getText().toString();
            String message = editTextMessage.getText().toString();

            Uri uri = Uri.parse("mailto:" + mail + "?subject=" + Uri.encode(theme) +
                    "&body=" + Uri.encode(message));

            Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
            startActivity(intent);
        });
    }
}