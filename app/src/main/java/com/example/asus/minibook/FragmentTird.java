package com.example.asus.minibook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Asus on 2016/4/12.
 */
public class FragmentTird extends Fragment {
    private ListView mListview;
    private List<Map<String,Object>> mList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.adapter_style,null);
        mList=new ArrayList<>();
        for(int i=0;i<10;i++){
            Map<String,Object> map=new HashMap<>();
            map.put("Image",R.mipmap.duolameng);
            map.put("text","zda");
            mList.add(map);
        }
        SimpleAdapter adapter=new SimpleAdapter(getActivity(),mList,R.layout.fragment_style,
                new String[]{"Image","text"},
                new int[]{R.id.image_style,R.id.text_style});
        mListview=(ListView)view.findViewById(R.id.listView);
        mListview.setAdapter(adapter);
        Log.d("two",mList.size()+"");
        return view;
    }
}
