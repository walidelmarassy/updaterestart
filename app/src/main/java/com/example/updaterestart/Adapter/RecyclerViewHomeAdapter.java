
package com.example.updaterestart.Adapter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.updaterestart.Model.Attraction;
import com.example.updaterestart.Model.Data;
import com.example.updaterestart.Model.HotSpot;
import com.example.updaterestart.R;
import com.example.updaterestart.View.HomeActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewHomeAdapter extends RecyclerView.Adapter<RecyclerViewHomeAdapter.RecyclerViewHolder> {

    private List<Attraction> attractions;
    private List<HotSpot>hotSpots;

    private Context context;
    private static ClickListener clickListener;

    public RecyclerViewHomeAdapter(List<Attraction> attractions, Context context) {
        this.attractions = attractions;

        this.context = context;
    }

    public RecyclerViewHomeAdapter(List<HotSpot> hotspots, HomeActivity context) {
        this.hotSpots=hotspots;
        this.context=context;
    }



    @NonNull
    @Override
    public RecyclerViewHomeAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.datalist,
                viewGroup, false);
        return new RecyclerViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHomeAdapter.RecyclerViewHolder viewHolder, int i) {

        //hotspot
        List<String> photos = hotSpots.get(i).getPhotos();
        if(photos.size()>0){
            Uri photoUri = Uri.parse(photos.get(0));
            Log.d("", "onBindViewHolder: Photo"+photoUri.toString());

            Picasso.get().load((Uri) photoUri).into(viewHolder.thumb);

        }


        String strhotspotyName = hotSpots.get(i).getName();
        viewHolder.Name.setText(strhotspotyName);
        String  strhotspotdesc=hotSpots.get(i).getDescription();
        viewHolder.desc.setText(strhotspotdesc);
        //attractions
        List<String> photoattraction = attractions.get(i).getPhotos();
        if(photoattraction.size()>0){
            Uri photoUri = Uri.parse(photoattraction.get(0));
            Log.d("", "onBindViewHolder: Photo"+photoUri.toString());

            Picasso.get().load((Uri) photoUri).into(viewHolder.thumb);

        }


        String strattractionyName = attractions.get(i).getName();
        viewHolder.Name.setText(strattractionyName);
        String  strattractionsdesc=attractions.get(i).getDescription();
        viewHolder.desc.setText(strattractionsdesc);

    }


    @Override
    public int getItemCount() {
        return attractions.size();

    }

    static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.cardimage)
        ImageView thumb;
        @BindView(R.id.dataname)
        TextView Name;
        @BindView(R.id.datatype)
        TextView desc;
        RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            clickListener.onClick(v, getAdapterPosition());
        }
    }


    public void setOnItemClickListener(ClickListener clickListener) {
        RecyclerViewHomeAdapter.clickListener = clickListener;
    }


    public interface ClickListener {
        void onClick(View view, int position);
    }
}
