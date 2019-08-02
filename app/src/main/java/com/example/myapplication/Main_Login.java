package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.ui.login.LoginActivity;

public class Main_Login extends AppCompatActivity {
    Button Login;
    TextView txt1,txt2,txt3;
    Animation animation1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__login);

        txt1 = findViewById(R.id.textView3);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main_Login.this, LoginActivity.class);
                startActivity(i);
            }
        });


      // Login = findViewById(R.id.login);
     //  txt1 = findViewById(R.id.textView4);

       // animation1 = AnimationUtils.loadAnimation(this,R.anim.animation1);
        //Login.setAnimation(animation1);
    }
}
