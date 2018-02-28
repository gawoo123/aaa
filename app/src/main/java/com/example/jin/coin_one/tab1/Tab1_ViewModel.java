package com.example.jin.coin_one.tab1;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.jin.coin_one.App;
import com.example.jin.coin_one.repository.retrofit.GithubService;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;

import static com.example.jin.coin_one.repository.retrofit.GithubService.retroInterface;

/**
 * Created by jin on 2018-02-28.
 */

public class Tab1_ViewModel extends ViewModel {
    Call<List<StateContributor>> call;

    LiveData<List<StateContributor>> res;


    public static GithubService githubService = retroInterface.create(GithubService.class);



    public LiveData<StateContributor> getCurrency(String currency)
    {
        MutableLiveData<StateContributor> data = new MutableLiveData<>();
//        githubService.repoContributors("all")
        githubService.repoContributors(currency).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(e-> {System.out.println("확인1"+e);
                data.setValue(e);
                }, e->System.out.println("확인2"+e));



//        githubService.repoContributors(currency)
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io())
//                .subscribe(items-> Observable.fromIterable(items)
//                        .subscribe(item-> {
//                            System.out.println("화페이름" + item.currency);
//                            data.setValue(items);
//                        })
//                );
        return data;
    }
}