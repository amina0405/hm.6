package com.example.hm6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText gmail, password;
    private TextView exid, welcom, forget, clik, register;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.bottom);
        gmail = findViewById(R.id.gmail);
        password = findViewById(R.id.password);
        exid = findViewById(R.id.Exit);
        welcom = findViewById(R.id.Welcom);
        forget = findViewById(R.id.forgot_your_password);
        clik = findViewById(R.id.Clik);
        register = findViewById(R.id.Registration);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gmail.getText().toString().equals("admin@gmail.com")&&password.getText().toString().equals("admin")) {
                    button.setVisibility(view.GONE);
                    gmail.setVisibility(view.GONE);
                    password.setVisibility(view.GONE);
                    exid.setVisibility(view.GONE);
                    forget.setVisibility(view.GONE);
                    clik.setVisibility(view.GONE);
                    register.setVisibility(view.GONE);
                    Toast.makeText(MainActivity.this,"Вы зарегистриволись",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"У вас не правельный логин или пароль",Toast.LENGTH_SHORT).show();

                }

            }
        });
        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(gmail.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.purple_200));
                }
                else{
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }

            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(password.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.purple_200));
                }
                else{
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }

            }
        });
    }
}