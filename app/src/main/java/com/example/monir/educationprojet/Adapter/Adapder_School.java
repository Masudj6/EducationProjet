package com.example.monir.educationprojet.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.monir.educationprojet.Activity.Pdf_Activity;
import com.example.monir.educationprojet.Model.Model_school;
import com.example.monir.educationprojet.R;

import java.util.ArrayList;

/**
 * Created by Monir on 1/4/2018.
 */

public class Adapder_School extends RecyclerView.Adapter<Adapder_School.SchoolViewHolder> {

    private Context context;
    private ArrayList<Model_school> schools;

    public Adapder_School(Context context, ArrayList<Model_school> schools) {
        this.context = context;
        this.schools = schools;
    }

    @Override
    public SchoolViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.school_sampledesign, parent, false);

        return new Adapder_School.SchoolViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final SchoolViewHolder holder, final int position) {
        holder.schoolname.setText(schools.get(position).getSchoolname());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = schools.get(position).getSchoolpdfurl();
              //  Toast.makeText(context, ""+name, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(context,Pdf_Activity.class);
                intent.putExtra("pdfUrl",name);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return schools.size();
    }

    public class SchoolViewHolder extends RecyclerView.ViewHolder {
        TextView schoolname;

        public SchoolViewHolder(View itemView) {
            super(itemView);

            schoolname = itemView.findViewById(R.id.idnameSchool);
        }
    }

    public  void setFilter(ArrayList<Model_school>newschoollist){
        schools=new ArrayList<>();
        schools.addAll(newschoollist);
        notifyDataSetChanged();
    }

}
