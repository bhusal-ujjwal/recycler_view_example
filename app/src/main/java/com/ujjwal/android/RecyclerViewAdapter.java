package com.ujjwal.android;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    private Context mContent;
    private List<Presidents> mData;

    public RecyclerViewAdapter(Context mContent, List<Presidents> mData) {
        this.mContent = mContent;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContent);
        view = mInflater.inflate(R.layout.cardview_presidents, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tv_president_name.setText(mData.get(position).getName());
        holder.img_president_thumbnail.setImageResource(mData.get(position).getThumbnail());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(mContent, President_activity.class);

                intent.putExtra("Name", mData.get(position).getName());
                intent.putExtra("Description", mData.get(position).getDescription());
                intent.putExtra("Thumbnail", mData.get(position).getThumbnail());


                mContent.startActivity(intent);


            }
        });





    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_president_name;
        ImageView img_president_thumbnail;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_president_name= (TextView) itemView.findViewById(R.id.president_name_id);
            img_president_thumbnail= (ImageView) itemView.findViewById(R.id.president_img_id);
            cardView= (CardView) itemView.findViewById(R.id.cardview_id);

        }
    }
}
