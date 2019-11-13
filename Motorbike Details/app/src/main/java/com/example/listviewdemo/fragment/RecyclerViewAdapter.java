package com.example.listviewdemo.fragment;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;

import com.example.listviewdemo.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
     Context context;
     List<Contact> data;
     public RecyclerViewAdapter(Context context, List<Contact> data){
         this.context = context;
         this.data = data;
     }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewtype) {
        View infor;
        infor = LayoutInflater.from(context).inflate(R.layout.item_context, viewGroup,false);
        MyViewHolder myViewHolder = new MyViewHolder(infor);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
         myViewHolder.tv_name.setText(data.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
         private TextView tv_name;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_name = (TextView) itemView.findViewById(R.id.text);
        }
    }
}

