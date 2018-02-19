package com.example.monir.educationprojet.Activity;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import com.example.monir.educationprojet.Adapter.Adapter_University;
import com.example.monir.educationprojet.Model.Model_University;
import com.example.monir.educationprojet.R;

import java.util.ArrayList;

public class  University_Activity extends AppCompatActivity {

   private RecyclerView universityrecyclerView;
   private Model_University model_university;
   private ArrayList<Model_University>universities;
   private  Adapter_University adapter_university;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_);

        //listView=findViewById(R.id.listUniversity);
      //  varsityname=getResources().getStringArray(R.array.varsityname);
        //univerlogo=getResources().getIntArray(R.array.univerlogo);

      //  Adapter_University adapter_university=new Adapter_University(University_Activity.this,varsityname,ij);
       // listView.setAdapter(adapter_university);

        universityrecyclerView=findViewById(R.id.listUniversity);
        model_university= new Model_University();
        universities=model_university.getAllUniversity();

        adapter_university=new Adapter_University(this,universities);
        LinearLayoutManager llm= new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(this,llm.getOrientation());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        universityrecyclerView.setLayoutManager(llm);
        universityrecyclerView.addItemDecoration(dividerItemDecoration);
        universityrecyclerView.setAdapter(adapter_university);

        //ADING BACK BUTTON CLICK
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }
    //searchView for code  Start....................................................
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        MenuItem menuItem=menu.findItem(R.id.searchViewId);
        SearchView searchView= (SearchView) MenuItemCompat.getActionView(menuItem);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

              newText=newText.toLowerCase();
              ArrayList<Model_University>newList=new ArrayList<>();

              for (Model_University model_university : universities){

                  String  name=model_university.getUniversity_Name().toLowerCase();
                  if (name.contains(newText))
                      newList.add(model_university);
              }
                adapter_university.setFilter(newList);
                return true;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }
}
