package com.sheela.mobilestore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    private EditText etFullName, etUserName, etEmail, etPassword, etConfirmPassword;
    private TextView etGender;
    private RadioButton rdoMale, rdoFemale;
    private Button btnRegister;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etFullName = findViewById(R.id.etFullName);
        etUserName = findViewById(R.id.etUserName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        etGender = findViewById(R.id.etGender);
        rdoMale=findViewById(R.id.rdoMale);
        rdoFemale=findViewById(R.id.rdoFemale);
        btnRegister=findViewById(R.id.btnRegister);

        myDb= new DatabaseHelper(this);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             boolean insertData=   myDb.insertData(etFullName.getText().toString(),etUserName.getText().toString(),
                     etEmail.getText().toString(),etPassword.getText().toString(),etConfirmPassword.getText().toString(),
                     etGender.getText().toString());
             if(insertData=true)
                 Toast.makeText(SignUp.this,"Data Inserted",Toast.LENGTH_LONG).show();
              else
                 Toast.makeText(SignUp.this,"Data is not Inserted",Toast.LENGTH_LONG).show();
                Intent Loginintent= new Intent(SignUp.this, Login.class);
                startActivity(Loginintent);
            }
        });



    }
}
