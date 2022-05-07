package com.yunbo.surface;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yunbo.surface.anim.SurfaceViewActivity;
import com.yunbo.surface.anim.TextureViewActivity;

public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_video_demo);

        findViewById(R.id.anim_surfaceview).setOnClickListener(this);
        findViewById(R.id.anim_textureview).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.anim_textureview) {
            Intent i = new Intent(this, TextureViewActivity.class);
            startActivity(i);

        } else if (id == R.id.anim_surfaceview) {
            Intent i = new Intent(this, SurfaceViewActivity.class);
            startActivity(i);
        }
    }
}
