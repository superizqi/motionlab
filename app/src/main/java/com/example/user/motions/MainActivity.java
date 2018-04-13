package com.example.user.motions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText id,password;
    private Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = findViewById(R.id.id_edittext);
        password = findViewById(R.id.password_idtext);
        login = findViewById(R.id.login_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String i = id.getText().toString();
                String pw = password.getText().toString();

                if (i.equals("a") && pw.equals("b")){
                    Toast.makeText(MainActivity.this, "Berhasil Login", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "ID atau Password Salah", Toast.LENGTH_SHORT).show();
                }

            }


        });











    }

    @Override
    protected void onPause() {
        super.onPause();
    }





}
