package com.zyc.bundle.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        //java用法
        findViewById(R.id.tvJava)
                .setOnClickListener(v -> {
                    JavaActivity.go(MainActivity.this, "java");
                });

        //kotlin用法
        findViewById(R.id.tvKotlin)
                .setOnClickListener(v -> {
                    KotlinActivity.Companion.go(MainActivity.this, "kotlin");
                });
    }
}