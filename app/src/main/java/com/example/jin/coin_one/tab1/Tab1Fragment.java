package com.example.jin.coin_one.tab1;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.jin.coin_one.R;
import com.example.jin.coin_one.tab1.list.state_adpter;
import com.example.jin.coin_one.tab1.list.state_item;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

import static io.reactivex.internal.operators.observable.ObservableBlockingSubscribe.subscribe;

/**
 * Created by jin on 2018-02-27.
 */

public class Tab1Fragment extends Fragment {

    Tab1_ViewModel viewModel;
    View v;
    RecyclerView recyclerView;
    state_adpter adpter;

    LinearLayoutManager mLayoutManager;
    ListView listview;
    ArrayList coin_list;
    ArrayList ignore_list;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.tab1_frag, container, false);


        adpter = new state_adpter();
        listview = (ListView) v.findViewById(R.id.listView);
        listview.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listview.setAdapter(adpter);
        listview.setTextFilterEnabled(true);
        adpter.notifyDataSetChanged();

        coin_list =new ArrayList();

        coin_list.add("btc");
        coin_list.add("bch");
        coin_list.add("eth");
        coin_list.add("etc");
        coin_list.add("xrp");
        coin_list.add("qtum");
        coin_list.add("iota");
        coin_list.add("ltc");
        coin_list.add("btg");




        viewModel = ViewModelProviders.of(this).get(Tab1_ViewModel.class);

        Observable.fromIterable(coin_list).subscribe(e->{
            viewModel.getCurrency(e.toString()).observe(this, user -> {
                System.out.println("가자"+user);

                state_item item =new state_item();
                item.setName(user.currency);
                item.setPrice(user.last);

                item.setName(user.currency);
                item.setDifference(user.last-user.yesterday_last);
                adpter.addItem(item);

            });
        });





        return v;
    }
}