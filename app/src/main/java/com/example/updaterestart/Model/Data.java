package com.example.updaterestart.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("events")
    @Expose
    private List<Event> events = null;


    @SerializedName("attractions")
    @Expose
    private List<Attraction> attractions = null;


    @SerializedName("hot_spots")
    @Expose
    private List<HotSpot> hotSpots = null;


    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<Attraction> attractions) {
        this.attractions = attractions;
    }

    public List<HotSpot> getHotSpots() {
        return hotSpots;
    }

    public void setHotSpots(List<HotSpot> hotSpots) {
        this.hotSpots = hotSpots;
    }


}




