package com.example.onsuccessfulloginopenbrowser;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.net.*;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.content.Intent;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    EditText editt1,editt2;
    String email= "preetideswal@gmail.com";
    String password="preeti2008";
    final Context context = this;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button);
        button1.setEnabled(false);
        editt1 = (EditText)findViewById(R.id.editText);
        editt2 = (EditText)findViewById(R.id.editText2);
        editt1.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(editt1.getText().toString().equals(email) &&
                        editt2.getText().toString().equals(password)) {
                    button1.setEnabled(true);
                }else{
                    button1.setEnabled(false);
                }


            }

            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }


        });
        editt2.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(editt1.getText().toString().equals(email) &&
                        editt2.getText().toString().equals(password)) {
                    button1.setEnabled(true);
                }else{
                    button1.setEnabled(false);
                }


            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editt1.getText().toString().equals(email) &&
                        editt2.getText().toString().equals(password)) {
                    Toast.makeText(getApplicationContext(),
                            "successfully login",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.kuk.ac.in/"));
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "invalid username or password",Toast.LENGTH_LONG).show();



                }
            }
        });


        }

    }
