package com.example.android.su_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;
import java.util.jar.Attributes;

public class LoginActivity extends AppCompatActivity {
    EditText Username;
    EditText Password;
    Button LOGIN;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().show();
        Username = (EditText) findViewById(R.id.editusernaame);
        Password = (EditText) findViewById(R.id.editpassword);
        LOGIN = (Button) findViewById(R.id.btsignin);

        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = Username.getText().toString();
                String p = Password.getText().toString();
                if (u.equals("admin") && p.equals("1234")) {
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    LoginActivity.this.finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Incorrect Password or Username", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

