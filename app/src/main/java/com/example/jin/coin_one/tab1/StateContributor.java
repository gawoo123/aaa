package com.example.jin.coin_one.tab1;

/**
 * Created by jin on 2018-02-27.
 */

public class StateContributor {

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

    @Override
    public String toString() {
        return currency+ " has a last"+last;
    }


}
