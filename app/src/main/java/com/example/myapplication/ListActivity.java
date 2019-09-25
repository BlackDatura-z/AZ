package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView =findViewById(R.id.list);

        String[] data={"Android应用程序开发","移动应用程序测试","高等数学","高职英语","Java程序设计语言","Android游戏开发","心理健康","体育"};


        listView = findViewById(R.id.list);
        //2设置Adapter
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,//上下文
                android.R.layout.simple_list_item_1,//布局
                data//数据
        );
        //3给ListView设置Adapter
        listView.setAdapter(adapter);
        //4给Item设置监听事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListActivity.this, TextActivity.class);
                startActivity(intent);
            }
        });

    }
}
