package com.gts.rnp.actionbar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.ActionBar;

import com.gts.rnp.R;

public class CustomActionBar {
    private Activity activity;
    private ActionBar actionBar;
    private  View mCustomView;
    public CustomActionBar(Activity activity, androidx.appcompat.app.ActionBar supportActionBar) {
        this.activity = activity;
        this.actionBar = supportActionBar;
        mCustomView = LayoutInflater.from(activity).inflate(R.layout.custom_actionbar, null);

    }

    public void setActionBar(){
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setElevation(0);

        actionBar.setCustomView(mCustomView);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Toolbar parent = (Toolbar)mCustomView.getParent();
            parent.setContentInsetsAbsolute(0,0);
            ActionBar.LayoutParams params = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);
            actionBar.setCustomView(mCustomView,params);
        }

    }

    public void setText(String text){
        TextView textView = (TextView)mCustomView.findViewById(R.id.actionbarText);
        textView.setText(text);
    }
    public void setTextSize(float textSize){
        TextView textView = (TextView)mCustomView.findViewById(R.id.actionbarText);
        textView.setTextSize(textSize);
    }
}
