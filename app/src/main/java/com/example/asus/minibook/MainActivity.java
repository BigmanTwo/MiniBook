package com.example.asus.minibook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    private ArrayList<Fragment> mList;
    private ViewPager mViewPager;
    private Button mButton1,mButton2,mButton3;
    private FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        manager=getSupportFragmentManager();
        setContentView(R.layout.activity_main);
        mViewPager=(ViewPager)findViewById(R.id.viewpager);
        mList=new ArrayList<Fragment>();
        mList.add(new FragmentOne());
        mList.add(new FragmentSce());
        mList.add(new FragmentTird());
       FragmentAdapterActivity adapter=new FragmentAdapterActivity(manager,mList);
        mViewPager.setAdapter(adapter);
        mButton1= (Button) findViewById(R.id.but1);
        mButton1.setOnClickListener(this);
        mButton2= (Button) findViewById(R.id.but2);
        mButton2.setOnClickListener(this);
        mButton3= (Button) findViewById(R.id.but3);
        mButton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.but1:
                mViewPager.setCurrentItem(0,false);
                break;
            case R.id.but2:
                mViewPager.setCurrentItem(1,false);
                break;
            case R.id.but3:
                mViewPager.setCurrentItem(2,false);
                break;
        }
    }


}
