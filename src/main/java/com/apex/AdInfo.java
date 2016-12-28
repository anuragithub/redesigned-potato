package com.apex;

/**
 * Created by Akshay on 12/21/2016.
 */

public class AdInfo {
    public String publisher;
    public String advertiser;
    public String location;

    public double cost;
    public int impressions;
    public boolean clicks;

    public AdInfo(String publisher, String advertiser, String location, double cost, int impressions, boolean clicks) {
        this.publisher = publisher;
        this.advertiser = advertiser;
        this.location = location;
        this.cost = cost;
        this.impressions = impressions;
        this.clicks = clicks;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(String advertiser) {
        this.advertiser = advertiser;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getImpressions() {
        return impressions;
    }

    public void setImpressions(int impressions) {
        this.impressions = impressions;
    }

    public boolean isClicks() {
        return clicks;
    }

    public void setClicks(boolean clicks) {
        this.clicks = clicks;
    }

    @Override
    public String toString() {
        return "AdInfo{" +
                "publisher=" + publisher +
                ", advertiser=" + advertiser +
                ", location=" + location +
                ", cost=" + cost +
                ", impressions=" + impressions +
                ", clicks=" + clicks +
                '}';
    }
}

