package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_welcome;
    private ImageView pv1,pv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv_welcome = findViewById(R.id.welcome);
        pv1 = findViewById(R.id.img1);
        pv2 = findViewById(R.id.img2);


        Intent intent = getIntent();
        String name = intent.getStringExtra("username");
        if (name != null){
            tv_welcome.setText(name);
        }
        pv1.setOnClickListener(this);
        pv2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img1:
                Intent intent = new Intent(LoginActivity.this,ListActivity.class);
                startActivity(intent);

        }

    }
}