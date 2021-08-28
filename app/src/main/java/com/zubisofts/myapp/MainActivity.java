package com.zubisofts.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText edituser = findViewById(R.id.edituser);
        EditText editpass = findViewById(R.id.editpass);
        Button btnlogin = findViewById(R.id.btnlogin);
        TextView Tv_Register = findViewById(R.id.Tv_Register);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edituser.getText().toString().equals("solomon")
                && editpass.getText().toString().equals("08183566334")){

                    Intent homeIntent = new Intent(MainActivity.this,SignUpActivity.class);
                    startActivity(homeIntent);

                }else{
                    Toast.makeText(MainActivity.this, "Incorrect login", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Tv_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(RegisterIntent);
            }
        });

    }
}