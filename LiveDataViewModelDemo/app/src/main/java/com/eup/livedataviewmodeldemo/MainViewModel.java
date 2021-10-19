package com.eup.livedataviewmodeldemo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.eup.livedataviewmodeldemo.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {

    private MutableLiveData<List<User>> listMutableLiveData;

    private List<User> list;

    public MainViewModel() {
        listMutableLiveData  = new MutableLiveData<>();
        
        initData();
    }

    private void initData() {
        list = new ArrayList<>();
        list.add(new User(R.drawable.img_food_zero,"Hakuryuu","vu trong khiem"));
        listMutableLiveData.setValue(list);
    }

    public MutableLiveData<List<User>> getListMutableLiveData() {
        return listMutableLiveData;
    }

    public void addUser(User user){
        list.add(user);
        listMutableLiveData.setValue(list);
    }
}
