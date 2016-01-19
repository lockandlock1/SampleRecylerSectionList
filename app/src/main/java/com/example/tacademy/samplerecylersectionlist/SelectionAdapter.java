package com.example.tacademy.samplerecylersectionlist;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2016-01-19.
 */
public class SelectionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<GroupItem> items = new ArrayList<GroupItem>();

    public void put(String groupName,String childName){
        GroupItem group = null;
        for (GroupItem g : items){
            if (g.equals(groupName)){
                group = g;
                break;
            }
        }

        if(group == null){
            group = new GroupItem();
            group.groupName = groupName;
            items.add(group);
        }
        //     group.children == null 안되는 이유는 이미 객체에서 리스트를 만들었기 때문에
        // 널일이 없다 그렇기 때문에 바로 객체 생성해서 넣어주면 된다.

        if(!TextUtils.isEmpty(childName)){
            ChildItem child = new ChildItem();
            child.childName = childName;
            group.children.add(child);
        }

        notifyDataSetChanged();
    }
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_ITEM = 1;

    @Override
    public int getItemViewType(int position) {
       for(int i = 0 ; i < items.size() ; i++){
           if(position < 0) return VIEW_TYPE_HEADER;
           position--;

           




       }
        return 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
