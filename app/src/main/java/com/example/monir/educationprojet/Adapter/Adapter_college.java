package com.example.monir.educationprojet.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.monir.educationprojet.Model.Model_University;
import com.example.monir.educationprojet.Model.Model_college;
import com.example.monir.educationprojet.R;

import java.util.ArrayList;

/**
 * Created by Monir on 1/4/2018.
 */

public class Adapter_college extends RecyclerView.Adapter<Adapter_college.CollegeViewHolder> {

    public Adapter_college(Context context, ArrayList<Model_college> colleges) {
        this.context = context;
        this.colleges = colleges;
    }

    private Context context;
    private ArrayList<Model_college> colleges;





    @Override
    public CollegeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.college_sample_design, parent, false);

        return new CollegeViewHolder(v);

    }

    @Override
    public void onBindViewHolder(CollegeViewHolder holder, int position) {
        holder.collegename.setText(colleges.get(position).getCollege_name());

        //  holder.universitytv.setText(universities.get(position).getUniversity_Name());

    }

    @Override
    public int getItemCount() {
        return colleges.size();
    }

    public class CollegeViewHolder extends RecyclerView.ViewHolder{
            TextView collegename;
        public CollegeViewHolder(View itemView) {
            super(itemView);

            collegename=itemView.findViewById(R.id.idnamecollege);
        }
    }


    //search er jonno ..............................................
    public void setFilter(ArrayList<Model_college> newlist){
        colleges=new ArrayList<>();
         colleges.addAll(newlist);
        notifyDataSetChanged();

    }
}
