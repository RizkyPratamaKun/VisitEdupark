package com.example.visitaedupark;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {
    EditText ed,ed3,ed4,ed5,ed6;
    Spinner sp;
    TextView beranda;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        beranda=findViewById(R.id.button2);
        ed=findViewById(R.id.editText);
        ed3=findViewById(R.id.editText3);
        ed4=findViewById(R.id.editText4);
        ed5=findViewById(R.id.editText5);
        ed6=findViewById(R.id.editText6);
        sp=findViewById(R.id.kdhp);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(register.this, R.array.nohp,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
    }

    public void onProcess(View view) {
            String edit = ed.getText().toString();
            String edit3 = ed3.getText().toString();
            String edit4 = ed4.getText().toString();
            String edit5 = ed5.getText().toString();
            String edit6 = ed6.getText().toString();

            if(edit.length() < 1){
                ed.setError("Nama harus diisi!");
            }else if(edit3.length() < 1){
                ed3.setError("Email harus diisi!");
            }else if(edit4.length() < 1){
                ed4.setError("Nomor HP harus diisi!");
            }else if(edit5.length() < 1){
                ed5.setError("Password harus diisi!");
            }else if(edit6.length() < 1){
                ed6.setError("Password tidak sama!");
            }else {
                beranda.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(register.this, Login.class);
                        startActivity(intent);
                    }
                });

        }
    }
}
