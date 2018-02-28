package com.example.jin.coin_one.repository.retrofit;

import com.example.jin.coin_one.tab1.StateContributor;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jin on 2018-02-28.
 */

public interface MyServerService {


    @GET("user/")
    Observable<StateContributor> repoContributors(
            @Query("currency") String currency
    );

    @GET("ticker/")
    Call<StateContributor> repoContributors2(
            @Query("currency") String currency
    );

    public static Retrofit retroInterface = new Retrofit.Builder()
            .baseUrl("https://api.coinone.co.kr/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
