package com.llw.material;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Material UI 控件使用
 *
 * @author llw
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        //ShapeableImageViewActivity 使用
        startActivity(new Intent(MainActivity.this, ShapeableImageViewActivity.class));
    }
}
