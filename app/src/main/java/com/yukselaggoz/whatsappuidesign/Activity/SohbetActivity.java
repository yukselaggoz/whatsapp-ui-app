package com.yukselaggoz.whatsappuidesign.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yukselaggoz.whatsappuidesign.R;

public class SohbetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sohbet);

        String adSoyad = getIntent().getStringExtra("adsoyad");
        int userId = getIntent().getIntExtra("userid", 0);
        this.setTitle(adSoyad);
    }
}
