package com.example.jin.coin_one.tab1.list;

import android.graphics.drawable.Drawable;

/**
 * Created by jin on 2018-02-27.
 */

public class state_item {

    public Drawable getCoin_icon() {
        return coin_icon;
    }

    public void setCoin_icon(Drawable coin_icon) {
        this.coin_icon = coin_icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getYesterday_price() {
        return yesterday_price;
    }

    public void setYesterday_price(Long yesterday_price) {
        this.yesterday_price = yesterday_price;
    }

    public Long getYesterday_price_per() {
        return yesterday_price_per;
    }

    public void setYesterday_price_per(Long yesterday_price_per) {
        this.yesterday_price_per = yesterday_price_per;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Drawable getAlert_icon() {
        return alert_icon;
    }

    public void setAlert_icon(Drawable alert_icon) {
        this.alert_icon = alert_icon;
    }

    public boolean isAlert_check() {
        return alert_check;
    }

    public void setAlert_check(boolean alert_check) {
        this.alert_check = alert_check;
    }

    public Drawable getDifference_icon() {
        return difference_icon;
    }

    public void setDifference_icon(Drawable difference_icon) {
        this.difference_icon = difference_icon;
    }

    public Long getDifference() {
        return difference;
    }

    public void setDifference(Long difference) {
        this.difference = difference;
    }

    Drawable coin_icon;
    String name;
    Long yesterday_price;
    Long yesterday_price_per;
    Long price;
    Drawable alert_icon;
    boolean alert_check;
    Drawable difference_icon;
    Long difference;

}
