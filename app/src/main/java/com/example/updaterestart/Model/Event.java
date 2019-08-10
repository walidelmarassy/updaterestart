package com.example.updaterestart.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Event {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("short_description")
    @Expose
    private Object shortDescription;
    @SerializedName("arabic_name")
    @Expose
    private String arabicName;
    @SerializedName("arabic_short_description")
    @Expose
    private Object arabicShortDescription;
    @SerializedName("arabic_description")
    @Expose
    private String arabicDescription;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("lat")
    @Expose
    private Object lat;
    @SerializedName("lng")
    @Expose
    private Object lng;
    @SerializedName("facebook")
    @Expose
    private Object facebook;
    @SerializedName("twitter")
    @Expose
    private Object twitter;
    @SerializedName("instagram")
    @Expose
    private Object instagram;
    @SerializedName("website")
    @Expose
    private Object website;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("price_per_day")
    @Expose
    private Object pricePerDay;
    @SerializedName("whole_price")
    @Expose
    private Object wholePrice;
    @SerializedName("ticket_price")
    @Expose
    private Object ticketPrice;
    @SerializedName("photos")
    @Expose
    private List<String> photos = null;
    @SerializedName("city")
    @Expose
    private City city;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("features")
    @Expose
    private List<Feature> features = null;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = null;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(Object shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getArabicName() {
        return arabicName;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    public Object getArabicShortDescription() {
        return arabicShortDescription;
    }

    public void setArabicShortDescription(Object arabicShortDescription) {
        this.arabicShortDescription = arabicShortDescription;
    }

    public String getArabicDescription() {
        return arabicDescription;
    }

    public void setArabicDescription(String arabicDescription) {
        this.arabicDescription = arabicDescription;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getLat() {
        return lat;
    }

    public void setLat(Object lat) {
        this.lat = lat;
    }

    public Object getLng() {
        return lng;
    }

    public void setLng(Object lng) {
        this.lng = lng;
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

    public Object getWebsite() {
        return website;
    }

    public void setWebsite(Object website) {
        this.website = website;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Object getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Object pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Object getWholePrice() {
        return wholePrice;
    }

    public void setWholePrice(Object wholePrice) {
        this.wholePrice = wholePrice;
    }

    public Object getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Object ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<Object> getOffers() {
        return offers;
    }

    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

}