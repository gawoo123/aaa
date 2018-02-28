package com.example.jin.coin_one.tab1.list;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jin.coin_one.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by jin on 2018-02-28.
 */

public class state_adpter extends BaseAdapter {
    ArrayList<state_item> listViewItemsList = new ArrayList<state_item>();
    ArrayList<Integer> checkList= new ArrayList<Integer>();
    class ViewHolder
    {
        ImageView coin_icon_holder;
        TextView name_holder;
        TextView holding_holder;
        TextView holding_price_holder;
        TextView price_holder;
        ImageView diffrence_icon_holder;
        ImageView difference_holder;


    }



    @Override
    public int getCount() {
        return listViewItemsList.size();
    }

    @Override
    public Object getItem(int position) {
        return listViewItemsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final int pos = position;
        ViewHolder holder;
        Context context = parent.getContext();


        System.out.println("여기가 아예 안도나");
        if(convertView==null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.state_item,parent,false);

            holder = new ViewHolder();

            holder.coin_icon_holder=(ImageView) convertView.findViewById(R.id.coin_img);
            holder.name_holder=(TextView) convertView.findViewById(R.id.coin_name);
            holder.holding_holder=(TextView) convertView.findViewById(R.id.yesterday_price);
            holder.holding_price_holder=(TextView) convertView.findViewById(R.id.yesterday_per);
            holder.price_holder= (TextView) convertView.findViewById(R.id.price);
            holder.diffrence_icon_holder=(ImageView) convertView.findViewById(R.id.difference_img);
            holder.difference_holder=(ImageView) convertView.findViewById(R.id.alert_img);
            convertView.setTag(holder);


        }else{
            holder= (ViewHolder) convertView.getTag();
        }

        state_item item = listViewItemsList.get(position);
//        item.setDifference(user.last-user.yesterday_last);
//        holder.coin_icon_holder.
        holder.name_holder.setText(item.name);
        holder.holding_holder.setText(item.getDifference().toString());
//        holder.holding_price_holder.setText(item.ge);
        holder.price_holder= (TextView) convertView.findViewById(R.id.price);
        holder.diffrence_icon_holder=(ImageView) convertView.findViewById(R.id.difference_img);
        holder.difference_holder=(ImageView) convertView.findViewById(R.id.alert_img);


        holder.price_holder.setText(item.getPrice().toString());
        if(item.difference>0){
            holder.holding_holder.setTextColor(Color.GREEN);
        }else if(item.difference<0) {
            holder.holding_holder.setTextColor(Color.RED);
            holder.diffrence_icon_holder.setImageResource(R.drawable.minus);

        }else
        {

        }


        System.out.println("item부분" +item.getName());



        return convertView;

    }

    public void addItem(state_item get_item)
    {

        System.out.println("add" +get_item.getName());
        listViewItemsList.add(get_item);
        notifyDataSetChanged();
    }

    public void removeItem(int pos)
    {
        listViewItemsList.remove(pos);
    }

    public void clearItem()
    {
        listViewItemsList.clear();
        notifyDataSetChanged();
    }
}
