package com.example.livedataex;

import androidx.lifecycle.ViewModel;

public class myViewModel extends ViewModel {

    int counter=0 ;

    public  void increaseCounter(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}
