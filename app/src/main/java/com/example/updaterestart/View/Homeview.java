package com.example.updaterestart.View;



import com.example.updaterestart.Model.Attraction;
import com.example.updaterestart.Model.Event;
import com.example.updaterestart.Model.HotSpot;

import java.util.List;

public interface Homeview {
    void showLoading();
    void hideLoading();
    void setEveents(List<Event> events);
    void setHotspots(List<HotSpot> hotspots);
    void setAttractions(List<Attraction> attractions);
    void onErrorLoading(String message);


}
