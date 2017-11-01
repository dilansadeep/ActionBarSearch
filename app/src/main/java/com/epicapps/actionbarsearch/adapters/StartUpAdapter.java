package com.epicapps.actionbarsearch.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.epicapps.actionbarsearch.R;
import com.epicapps.actionbarsearch.model.StartUpData;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by fidenz on 10/20/17.
 */

public class StartUpAdapter extends RecyclerView.Adapter<StartUpAdapter.MyViewHolder> {

    private List<StartUpData> startUpDataList;
    private Context context;

    public StartUpAdapter(List<StartUpData> startUpDataList , Context context){
        this.startUpDataList = startUpDataList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_startup_list,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        StartUpData startUpData = startUpDataList.get(position);
        holder.catogery.setText(startUpData.getCatogery());
        holder.country.setText(startUpData.getCountry());
        holder.item_name.setText(startUpData.getItem_name());
        Picasso.with(context).load(startUpData.getItem_logo()).into(holder.imgView);
    }

    @Override
    public int getItemCount() {
        return startUpDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView catogery,country,item_name;
        public CircleImageView imgView;

        public MyViewHolder(View itemView) {
            super(itemView);
            catogery = itemView.findViewById(R.id.title);
            country = itemView.findViewById(R.id.genre);
            item_name = itemView.findViewById(R.id.year);
            imgView = itemView.findViewById(R.id.profile_image);
        }


    }

}
