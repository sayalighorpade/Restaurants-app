package com.sayali.learning.afinal;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btnSignUp,btnSignIn;
    TextView txtSlogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSignIn=(Button)findViewById(R.id.btnSignin);
        btnSignUp=(Button)findViewById(R.id.btnSignUp);
        txtSlogan=(TextView)findViewById(R.id.txtSlogan);

        txtSlogan.getText().toString();
        //Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/" + font);
       // Typeface typeface=Typeface.createFromAsset(getAssets(),"assets/fonts/font.TTF");
       // txtSlogan.setTypeface(typeface);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Signup.class);
                startActivity(i);
            }
        });
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Signin.class);
                startActivity(i);
            }
        });
    }
}
