package com.example.asus.minibook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Asus on 2016/4/11.
 */
public class FragmentOne extends Fragment {
   private ListView mListview;
    private List<Map<String,Object>> mList;
    private ImageView imageView;
    private TextView mTextView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.adapter_style,null);
        imageView= (ImageView) view.findViewById(R.id.image_style);
        mTextView= (TextView) view.findViewById(R.id.text_style);
        mList=new ArrayList<>();

       for(int i=0;i<10;i++){
           Map<String,Object> map=new HashMap<>();
           map.put("Image",R.mipmap.ic_launcher);
           map.put("text","hello");
           mList.add(map);
       }
        mListview=(ListView)view.findViewById(R.id.listView);
        SimpleAdapter adapter=new SimpleAdapter(getActivity(),mList,R.layout.fragment_style,
                new String[]{"Image","text"},
                new int[]{R.id.image_style,R.id.text_style});
        mListview.setAdapter(adapter);
        Log.d("one","出现");
        return view;
    }
}
