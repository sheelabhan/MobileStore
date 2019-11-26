package com.sheela.mobilestore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private EditText etUserName, etPassword;
    private Button btnLogin;
    private TextView txtRegister;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUserName=findViewById(R.id.etUserName);
        etPassword=findViewById(R.id.etPassword);
        txtRegister=findViewById(R.id.txtRegister);
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etUserName.getText()))
                {
                    etUserName.setError("Please enter first no");
                    etUserName.requestFocus();
                    return;

                }
                else  if(TextUtils.isEmpty(etPassword.getText())) {
                    etPassword.setError("Please enter second no");
                    etPassword.requestFocus();
                    return;

                }
            }
        });
      txtRegister.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Intent SignUpintent= new Intent(Login.this, SignUp.class);
              startActivity(SignUpintent);

          }
      });
            }

    }


