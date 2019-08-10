package com.example.updaterestart.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.updaterestart.Adapter.RecyclerViewHomeAdapter;
import com.example.updaterestart.Model.Attraction;
import com.example.updaterestart.Model.Event;
import com.example.updaterestart.Model.HotSpot;
import com.example.updaterestart.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements Homeview {
    @BindView(R.id.firstrecyler)
    RecyclerView reccylerviewhotspot;
    @BindView(R.id.secondrecyler)
    RecyclerView recyclerViewattractions;
    HomePresenter presenter;






    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        presenter=new HomePresenter(this);
        presenter.getAttractions();
        presenter.getHotspots();





    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void setEveents(List<Event> events) {

    }

    @Override
    public void setHotspots(List<HotSpot> hotspots) {
        RecyclerViewHomeAdapter hotspotadapter=new RecyclerViewHomeAdapter(hotspots,this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        reccylerviewhotspot.setLayoutManager(layoutManager);
        reccylerviewhotspot.setAdapter(hotspotadapter);
        reccylerviewhotspot.setNestedScrollingEnabled(true);
        hotspotadapter.notifyDataSetChanged();






    }

    @Override
    public void setAttractions(List<Attraction> attractions) {
        RecyclerViewHomeAdapter attractionsadapter=new RecyclerViewHomeAdapter(attractions,this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewattractions.setLayoutManager(layoutManager);
        recyclerViewattractions.setAdapter(attractionsadapter);
        recyclerViewattractions.setNestedScrollingEnabled(true);
       attractionsadapter.notifyDataSetChanged();



    }


    @Override
    public void onErrorLoading(String message) {

    }
}

