package com.badi.data.entity;

import android.graphics.drawable.Drawable;

import com.badi.presentation.search.SearchFragment;

/**
 * {@link SimpleCity} used for predefined data on {@link SearchFragment} screen.
 */
public class SimpleCity {

    private String address;
    private String placeID;
    private Drawable imageSmall;
    private Drawable imageLarge;

    public SimpleCity() {
        // Required empty public constructor
    }

    public SimpleCity(String address, String placeID, Drawable imageSmall, Drawable imageLarge) {
        this.address = address;
        this.placeID = placeID;
        this.imageSmall = imageSmall;
        this.imageLarge = imageLarge;
    }

    public SimpleCity(String address, String placeID, Drawable imageSmall) {
        this.address = address;
        this.placeID = placeID;
        this.imageSmall = imageSmall;
    }

    public String getAddress() {
        return address;
    }

    public String getPlaceID() {
        return placeID;
    }

    public Drawable getImageSmall() {
        return imageSmall;
    }

    public Drawable getImageLarge() {
        return imageLarge;
    }
}
