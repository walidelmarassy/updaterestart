package com.example.updaterestart.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Attraction {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("is_active")
    @Expose
    private String isActive;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;
    @SerializedName("arabic_name")
    @Expose
    private String arabicName;
    @SerializedName("arabic_description")
    @Expose
    private String arabicDescription;
    @SerializedName("facebook")
    @Expose
    private Object facebook;
    @SerializedName("twitter")
    @Expose
    private Object twitter;
    @SerializedName("instagram")
    @Expose
    private Object instagram;
    @SerializedName("working_hours")
    @Expose
    private List<Object> workingHours = null;
    @SerializedName("photos")
    @Expose
    private List<String> photos = null;
    @SerializedName("categories")
    @Expose
    private List<Category_> categories = null;
    @SerializedName("features")
    @Expose
    private List<Feature_> features = null;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = null;
    @SerializedName("tryps_id")
    @Expose
    private Object trypsId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getArabicName() {
        return arabicName;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    public String getArabicDescription() {
        return arabicDescription;
    }

    public void setArabicDescription(String arabicDescription) {
        this.arabicDescription = arabicDescription;
    }

    public Object getFacebook() {
        return facebook;
    }

    public void setFacebook(Object facebook) {
        this.facebook = facebook;
    }

    public Object getTwitter() {
        return twitter;
    }

    public void setTwitter(Object twitter) {
        this.twitter = twitter;
    }

    public Object getInstagram() {
        return instagram;
    }

    public void setInstagram(Object instagram) {
        this.instagram = instagram;
    }

    public List<Object> getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(List<Object> workingHours) {
        this.workingHours = workingHours;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public List<Category_> getCategories() {
        return categories;
    }

    public void setCategories(List<Category_> categories) {
        this.categories = categories;
    }

    public List<Feature_> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature_> features) {
        this.features = features;
    }

    public List<Object> getOffers() {
        return offers;
    }

    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    public Object getTrypsId() {
        return trypsId;
    }

    public void setTrypsId(Object trypsId) {
        this.trypsId = trypsId;
    }

}