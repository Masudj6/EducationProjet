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
import android.widget.SearchView;

import com.example.monir.educationprojet.Adapter.Adapder_School;
import com.example.monir.educationprojet.Model.Model_college;
import com.example.monir.educationprojet.Model.Model_school;
import com.example.monir.educationprojet.R;

import java.util.ArrayList;

public class School_Activity extends AppCompatActivity {

    private RecyclerView idschoollist;
    private ArrayList<Model_school>schools;
    private  Adapder_School adapder_school;
    private Model_school model_school;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_);

        idschoollist=findViewById(R.id.idListSchool);
        model_school=new Model_school();
        schools=model_school.getAllSchool();

        adapder_school=new Adapder_School(this,schools);
        LinearLayoutManager llmn=new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(this,llmn.getOrientation());
        llmn.setOrientation(LinearLayoutManager.VERTICAL);

        idschoollist.setLayoutManager(llmn);
        idschoollist.addItemDecoration(dividerItemDecoration);
        idschoollist.setAdapter(adapder_school);

        //ADING BACK BUTTON CLICK
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    //searchView for code  Start....................................................

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        MenuItem menuItem =menu.findItem(R.id.searchViewId);
        SearchView searchView= (SearchView) MenuItemCompat.getActionView(menuItem);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                newText=newText.toLowerCase();
                ArrayList<Model_school>newlistschool=new ArrayList<>();

                for (Model_school model_school:schools){

                    String  name=model_school.getSchoolname().toLowerCase();
                    if (name.contains(newText))
                       newlistschool.add(model_school);
                }
               adapder_school.setFilter(newlistschool);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}

