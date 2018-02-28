package com.example.jin.coin_one.tab1.list;

/**
 * Created by jin on 2018-02-28.
 */

public class Items {

    public Long getHigh() {
        return high;
    }

    public void setHigh(Long high) {
        this.high = high;
    }

    public Long getLow() {
        return low;
    }

    public void setLow(Long low) {
        this.low = low;
    }

    public Long getLast() {
        return last;
    }

    public void setLast(Long last) {
        this.last = last;
    }

    public Long getFirst() {
        return first;
    }

    public void setFirst(Long first) {
        this.first = first;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Long getYesterday_high() {
        return yesterday_high;
    }

    public void setYesterday_high(Long yesterday_high) {
        this.yesterday_high = yesterday_high;
    }

    public Long getYesterday_low() {
        return yesterday_low;
    }

    public void setYesterday_low(Long yesterday_low) {
        this.yesterday_low = yesterday_low;
    }

    public Long getYesterday_last() {
        return yesterday_last;
    }

    public void setYesterday_last(Long yesterday_last) {
        this.yesterday_last = yesterday_last;
    }

    public Long getYesterday_first() {
        return yesterday_first;
    }

    public void setYesterday_first(Long yesterday_first) {
        this.yesterday_first = yesterday_first;
    }

    public Double getYesterday_volume() {
        return yesterday_volume;
    }

    public void setYesterday_volume(Double yesterday_volume) {
        this.yesterday_volume = yesterday_volume;
    }

    public Long getTimestmap() {
        return timestmap;
    }

    public void setTimestmap(Long timestmap) {
        this.timestmap = timestmap;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    Long high;
    Long low;
    Long last;
    Long first;
    Double volume;
    Long yesterday_high;
    Long yesterday_low;
    Long yesterday_last;
    Long yesterday_first;
    Double yesterday_volume;
    Long timestmap;
    String currency;
}
