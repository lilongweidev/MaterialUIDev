package com.llw.material;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.CornerFamily;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;

/**
 * ShapeableImageViewActivity
 *
 * @author llw
 */
public class ShapeableImageViewActivity extends AppCompatActivity {

    private ShapeableImageView logo;
    private ShapeAppearanceModel appearanceModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shapeable_image_view);

        logo = findViewById(R.id.logo);
    }


    public void networkImg(View view) {
        String imgUrl = "http://img5.adesk.com/5f59ab8de7bce77595e55145?imageMogr2/thumbnail/!720x1280r/gravity/Center/crop/720x1280";
        Glide.with(this).load(imgUrl).into(logo);
    }

}
