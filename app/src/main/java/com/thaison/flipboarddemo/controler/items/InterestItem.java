package com.thaison.flipboarddemo.controler.items;

/**
 * Created by H81 on 3/6/2017.
 */

public class InterestItem {
    private String title;
    private String reading;

    public InterestItem(String title, String reading) {
        this.title = title;
        this.reading = reading;
    }

    public String getTitle() {
        return title;
    }

    public String getReading() {
        return reading;
    }
}
