package com.example.dz5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Model> arrayList;

    public void setArrayList(ArrayList<Model> arrayList) {
        this.arrayList = arrayList;
        notifyDataSetChanged();
    }

    onClick onClick;

    public void setOnClick(onClick onClick) {
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_photo);
            textView = itemView.findViewById(R.id.text);
        }

        public void onBind(Model model) {
            imageView.setImageResource(model.getPhoto());
            textView.setText(model.getCountry());

            itemView.setOnClickListener(v -> {
                onClick.onItemClick(model);
            });
        }
    }
}
