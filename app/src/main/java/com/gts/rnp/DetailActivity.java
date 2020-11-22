package com.gts.rnp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gts.rnp.actionbar.CustomActionBar;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setActionBar();
    }
    private void setActionBar() {
        CustomActionBar ca = new CustomActionBar(this, getSupportActionBar());
        ca.setActionBar();
        ca.setText("로나픽 상품 선택");
    }
}
