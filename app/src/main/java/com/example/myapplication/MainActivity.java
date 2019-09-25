package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    //获取用户名、密码和按钮这几个控件
    private EditText etUsername;
    private EditText etPassword;
    private Button btLogin;
    //获取用户名、密码的值
    //当登录按钮点击时，处理登录的逻辑
    //根据登录成功与否给出提示信息
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1获取用户名、密码和按钮这几个控件
        etUsername = findViewById(R.id.UserName);
        etPassword = findViewById(R.id.Password);
        btLogin = findViewById(R.id.Login);

        //2监听按钮的点击事件
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //3处理按钮的点击事件
                //3.1获取用户名和密码的值
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString();
                //3.2比较用户名和密码是否正确，然后给出提示
                if (username.equals("wzj")&&password.equals("1129")){
                    Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this,"用户名或者密码不正确",Toast.LENGTH_LONG).show();;
                }

            }
        } );


        }
}