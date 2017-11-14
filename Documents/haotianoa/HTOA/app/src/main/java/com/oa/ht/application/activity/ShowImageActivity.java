package com.oa.ht.application.activity;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bm.library.Info;
import com.bm.library.PhotoView;
import com.oa.ht.application.R;

import java.io.File;

public class ShowImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);
        PhotoView photoView = (PhotoView) findViewById(R.id.img);
        photoView.setImageURI(Uri.fromFile(new File(getIntent().getStringExtra("imageLoad"))));
        // 启用图片缩放功能
        photoView.enable();
        // 禁用图片缩放功能 (默认为禁用，会跟普通的ImageView一样，缩放功能需手动调用enable()启用)
        //photoView.disenable();
        // 获取图片信息
        Info info = photoView.getInfo();
        // 从一张图片信息变化到现在的图片，用于图片点击后放大浏览，具体使用可以参照demo的使用
        photoView.animaFrom(info);
        // 从现在的图片变化到所给定的图片信息，用于图片放大后点击缩小到原来的位置，具体使用可以参照demo的使用
        photoView.animaTo(info,new Runnable() {
            @Override
            public void run() {
                //动画完成监听
            }
        });
    }
}
