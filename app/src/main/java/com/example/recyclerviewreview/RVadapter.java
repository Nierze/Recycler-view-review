package com.example.recyclerviewreview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RVadapter extends RecyclerView.Adapter<RVadapter.HolderShit> {
    Context context;
    ArrayList<ModelShit> arr;

    public RVadapter(Context context, ArrayList<ModelShit> arr) {
        this.context = context;
        this.arr = arr;
    }

    @NonNull
    @Override
    public HolderShit onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_layout, parent, false);
        return new RVadapter.HolderShit(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderShit holder, int position) {
        holder.name.setText(arr.get(position).getName());
        holder.sex.setText(arr.get(position).getSex());
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public static class HolderShit extends RecyclerView.ViewHolder {
        TextView name;
        TextView sex;


        public HolderShit(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.txtname);
            sex = itemView.findViewById(R.id.txtsex);


        }
    }
}
