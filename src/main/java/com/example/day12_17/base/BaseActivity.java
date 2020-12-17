package com.example.day12_17.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView{
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        if (presenter==null){
            presenter = getPresenter();
            presenter.addachView(this);
        }
        initView();
        initData();
    }
    protected abstract void initData();
    protected abstract void initView();
    protected abstract T getPresenter();
    protected abstract int getLayoutID();
}
