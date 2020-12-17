package com.example.day12_17.base;

public class BasePresenter<V extends BaseView> {

    public V iView;
    public void  addachView(V v){
        iView = v;
    }
}
