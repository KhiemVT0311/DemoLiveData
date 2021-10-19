package com.eup.livedataviewmodeldemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eup.livedataviewmodeldemo.R;
import com.eup.livedataviewmodeldemo.model.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHodel> {
    private List<User> list;

    public UserAdapter(List<User> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public UserViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new UserViewHodel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHodel holder, int position) {
        User user= list.get(position);
        if (user == null){
            return;
        }

        holder.imageAvata.setImageResource(user.getImgAvata());
        holder.tvName.setText(user.getName());
        holder.tvTitle.setText(user.getTitle());
    }

    @Override
    public int getItemCount() {
        if (list !=  null){
            return list.size();
        }
        return 0;
    }

    public class UserViewHodel extends RecyclerView.ViewHolder{
        private ImageView imageAvata;
        private TextView tvName;
        private TextView tvTitle;

        public UserViewHodel(@NonNull View itemView) {
            super(itemView);
            imageAvata = itemView.findViewById(R.id.img_avata);
            tvName = itemView.findViewById(R.id.tv_name);
            tvTitle = itemView.findViewById(R.id.tv_title);
        }
    }

}
