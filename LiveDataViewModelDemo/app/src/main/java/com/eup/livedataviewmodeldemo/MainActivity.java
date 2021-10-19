package com.eup.livedataviewmodeldemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.eup.livedataviewmodeldemo.adapter.UserAdapter;
import com.eup.livedataviewmodeldemo.databinding.ActivityMainBinding;
import com.eup.livedataviewmodeldemo.model.User;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private UserAdapter adapter;
    private MainViewModel viewModel;

    private int index=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        initView();
    }

    private void initView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.rvUser.setLayoutManager(linearLayoutManager);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.getListMutableLiveData().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> users) {
                adapter = new UserAdapter(users);
                binding.rvUser.setAdapter(adapter);
            }
        });
    }

    public void AddUser(View view){
        User user = new User(R.drawable.img_food_one,"Hakuryuu + "+index,"vu trong khiem + "+index);
        viewModel.addUser(user);
        index++;
    }
}