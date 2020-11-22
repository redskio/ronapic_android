package com.gts.rnp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.gts.rnp.actionbar.CustomActionBar;
import com.gts.rnp.adpater.RecyclerViewDecoration;
import com.gts.rnp.adpater.RvAdapter;
import com.gts.rnp.adpater.TravelSet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private LinearLayoutManager llm;
    private int i = 0;
    private ArrayList<TravelSet> travelSetArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBar();
        rv = (RecyclerView)findViewById(R.id.main_rv);
        llm = new LinearLayoutManager(this);
        travelSetArrayList = new ArrayList<TravelSet>();
        setTravelSet();
        RvAdapter adapter = new RvAdapter(this,travelSetArrayList);
        RecyclerViewDecoration spaceDecoration = new RecyclerViewDecoration(20);

        rv.addItemDecoration(spaceDecoration);
        rv.setAdapter(adapter);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(llm);
    }

    private void setActionBar() {
        CustomActionBar ca = new CustomActionBar(this, getSupportActionBar());
        ca.setActionBar();
    }

    private void setTravelSet(){
        travelSetArrayList.add(new TravelSet(getResources().getString(R.string.travel_title0),0,R.drawable.card0));
        travelSetArrayList.add(new TravelSet(getResources().getString(R.string.travel_title1),0,R.drawable.card1));
        travelSetArrayList.add(new TravelSet(getResources().getString(R.string.travel_title2),0,R.drawable.card2));
        travelSetArrayList.add(new TravelSet(getResources().getString(R.string.travel_title3),0,R.drawable.card3));
        travelSetArrayList.add(new TravelSet(getResources().getString(R.string.travel_title4),0,R.drawable.card4));

    }
}
