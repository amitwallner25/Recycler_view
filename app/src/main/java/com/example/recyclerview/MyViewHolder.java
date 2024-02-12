package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameWiew;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        itemView = itemView.findViewById(R.id.imageView);
        nameWiew = itemView.findViewById(R.id.name);
    }
}
