package com.example.monir.educationprojet.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.monir.educationprojet.Model.Model_University;
import com.example.monir.educationprojet.R;

import java.util.ArrayList;

import static com.example.monir.educationprojet.R.layout.university_design;

/**
 * Created by Monir on 1/3/2018.
 */

public class Adapter_University extends RecyclerView.Adapter<Adapter_University.UniversityViewHolder> {

    private Context context;
    private ArrayList<Model_University>universities;
    public Adapter_University(Context context, ArrayList<Model_University> universities) {
        this.context = context;
        this.universities = universities;
    }



    @Override
    public UniversityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.university_design, parent, false);
        return new UniversityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UniversityViewHolder holder, int position) {
        holder.universitytv.setText(universities.get(position).getUniversity_Name());
        holder.universityIV.setImageResource(universities.get(position).getUniversity_Image());


    }

    @Override
    public int getItemCount() {
        return  universities.size();
    }

    public class UniversityViewHolder extends RecyclerView.ViewHolder{

        ImageView universityIV;
        TextView  universitytv;

        public UniversityViewHolder(View itemView) {
            super(itemView);

            universitytv=itemView.findViewById(R.id.idnameUniver);

            universityIV=itemView.findViewById(R.id.idLogoUniver);


        }
    }

    public void setFilter(ArrayList<Model_University> newlist){

        universities=new ArrayList<>();
        universities.addAll(newlist);
        notifyDataSetChanged();
    }

}
