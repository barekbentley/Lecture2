package com.example.lecture2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void LoginCheck(View view) {
        //hardcode username and password for checking with user inputs when login
        String savedUsername = "hellowt";
        String savedPassword = "hellowt";
        // find the textfild by their id and save them to EditText variables
        EditText TextFieldUsername = (EditText) findViewById(R.id.editTextUsername);
        EditText TextFieldPassword = (EditText) findViewById(R.id.editTextPassword);
        // extract the contents of username and password from EditText variables
        String username = TextFieldUsername.getText().toString();
        String password = TextFieldPassword.getText().toString();
        // check username and password

        if (username.equals(savedUsername) && password.equals(savedPassword)) {
            Toast.makeText(MainActivity.this, "Login Successfully!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this, "Wrong Username or Password!", Toast.LENGTH_LONG).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}