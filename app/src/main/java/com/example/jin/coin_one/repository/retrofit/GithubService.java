package com.example.jin.coin_one.repository.retrofit;

import com.example.jin.coin_one.tab1.StateContributor;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jin on 2018-02-27.
 */

public interface GithubService {
    @GET("ticker/{currency}")
    Call<List<StateContributor>> repoContributors(
            @Path("currency") String owner
    );

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.coinone.co.kr/")
            .build();



}
