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

    /**
     * 点击事件
     * @param view
     */
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_shapeableImageView:
                //ShapeableImageView 使用
                goToActivity(ShapeableImageViewActivity.class);
                break;
            case R.id.btn_materialButton:
                //MaterialButton 使用
                goToActivity(MaterialButtonActivity.class);
                break;
            default:
                break;
        }

    }

    /**
     * 跳转Activity
     * @param clazz 目标Activity
     */
    private void goToActivity(Class<?> clazz) {
        startActivity(new Intent(MainActivity.this, clazz));
    }


}
