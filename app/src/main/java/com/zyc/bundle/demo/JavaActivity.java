package com.zyc.bundle.demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zyc.bundle.annotation.WriteBundle;
import com.zyc.bundle.inject.BundleInit;

/**
 * author Zyc on date 2023/5/12
 * <p>
 * description:
 */
public class JavaActivity extends AppCompatActivity {

    public static void go(Context context, String tag) {
        Intent intent = new Intent(context, JavaActivity.class);
        intent.putExtra("tag", tag);
        context.startActivity(intent);
    }

    @WriteBundle
    String tag = "默认值";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin);
        BundleInit.inject(this);
        initView();
    }

    private void initView() {
        TextView tv = findViewById(R.id.tv);
        tv.setText(tag);
    }
}
