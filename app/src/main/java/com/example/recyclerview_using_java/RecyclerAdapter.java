package com.example.recyclerview_using_java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    List<String> abcd;
    List<Integer> abcdImage;
    LayoutInflater layoutInflater;

    public RecyclerAdapter(Context applicationContext, List<String> abcd, List<Integer> abcdImage){
        this.abcd = abcd;
        this.abcdImage = abcdImage;
        this.layoutInflater = LayoutInflater.from(applicationContext);
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_recycler,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.abcd.setText(abcd.get(position));
        holder.abcdImage.setImageResource(abcdImage.get(position));
    }


    @Override
    public int getItemCount() {
        return abcd.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView abcd;
        ImageView abcdImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            abcd = itemView.findViewById(R.id.recycler_text);
            abcdImage = itemView.findViewById(R.id.img_recycler);
        }
    }
}
