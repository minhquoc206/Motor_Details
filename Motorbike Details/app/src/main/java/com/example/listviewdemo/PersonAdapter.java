package com.example.listviewdemo;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listviewdemo.schemes.User;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PersonAdapter extends BaseAdapter {

    private Context context;

    private List<User> data;

    public PersonAdapter(Context context, List<User> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.row_list_view, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        holder = (ViewHolder) convertView.getTag();
        User user = (User) getItem(position);
        holder.tvName.setText(user.getFirst_name());
        holder.tvGender.setText(user.getEmail());
//        holder.ivAvatar.setImageResource(user.getAvatar());
        Picasso.get().load(user.get_links().getAvatar().getHref()).into(holder.ivAvatar);
        return convertView;
    }

    private class ViewHolder {

        TextView tvName;

        TextView tvGender;

        ImageView ivAvatar;

        public ViewHolder(View view) {
            tvName = view.findViewById(R.id.tv_name);
            tvGender = view.findViewById(R.id.tv_gioi_tinh);
            ivAvatar = view.findViewById(R.id.iv_avatar);
        }
    }

    public void setData(List<User> data) {
        this.data = data;
        notifyDataSetChanged();
    }
}
