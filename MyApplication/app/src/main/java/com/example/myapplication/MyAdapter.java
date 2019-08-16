package com.example.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;



class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<ItemContact> contacts;

    public MyAdapter (List<ItemContact> contacts){
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.bind(position);
    }

    @Override
    public int getItemCount() {
         return contacts.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
        }

        public void bind(int position) {
            textView.setText(contacts.get(position).toString());
        }
    }
}
