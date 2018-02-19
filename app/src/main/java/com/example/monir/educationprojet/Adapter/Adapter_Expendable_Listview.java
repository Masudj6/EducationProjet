package com.example.monir.educationprojet.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.monir.educationprojet.Model.Universitymodelnew;
import com.example.monir.educationprojet.R;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Monir on 1/10/2018.
 */

public class Adapter_Expendable_Listview extends BaseExpandableListAdapter {
    private Context context;
    List<String> listheaderData;
    HashMap<String,List<Universitymodelnew>> listDataChild;

    public Adapter_Expendable_Listview(Context context, List<String> listheaderData, HashMap<String, List<Universitymodelnew>> listDataChild) {
        this.context = context;
        this.listheaderData = listheaderData;
        this.listDataChild = listDataChild;
    }



    @Override
    public int getGroupCount() {
        return listheaderData.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return listDataChild.get(listheaderData.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return listheaderData.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return listDataChild.get(listheaderData.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {

        String headerText= (String) getGroup(i);
        if (view == null) {

            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.group_layout,null);
        }

      TextView ft=view.findViewById(R.id.headerTextViewId);
        ft.setText(headerText);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        Universitymodelnew child = (Universitymodelnew) getChild(i, i1);
        if (view == null) {

            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.child_layout,null);
        }

        TextView textView = view.findViewById(R.id.childTextViewId);
        textView.setText(""+child.getUniversityUnit());
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
