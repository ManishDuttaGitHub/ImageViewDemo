package com.imageviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private Button btnChangeImage;
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControls();
    }

    private void initControls() {
        imageView = (ImageView) findViewById(R.id.imageView);
        btnChangeImage = (Button) findViewById(R.id.btnChangeImage);
        btnChangeImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btnChangeImage:

                if (flag) {
                    flag = false;
                    imageView.setImageResource(R.drawable.img_android_one);
                } else {
                    flag = true;
                    imageView.setImageResource(R.drawable.img_android_two);
                }
                Toast.makeText(this, getString(R.string.image_changed), Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
