package com.example.jin.coin_one.tab1;

import com.example.jin.coin_one.tab1.list.Items;
import com.google.gson.annotations.SerializedName;

import java.util.List;

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
        return "레트로핏 테스트"+currency;
    }


}
