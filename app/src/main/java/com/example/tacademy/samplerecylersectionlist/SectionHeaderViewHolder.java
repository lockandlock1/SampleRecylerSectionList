package com.example.tacademy.samplerecylersectionlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-19.
 */
public class SectionHeaderViewHolder extends RecyclerView.ViewHolder{
    TextView titleView;
    public SectionHeaderViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView)itemView.findViewById(R.id.text_title);
    }

    public void setGroupItem(GroupItem item){
        titleView.setText(item.groupName);
    }
}
