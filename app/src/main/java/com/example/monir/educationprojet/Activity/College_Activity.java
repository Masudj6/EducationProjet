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

import com.example.monir.educationprojet.Adapter.Adapter_University;
import com.example.monir.educationprojet.Adapter.Adapter_college;
import com.example.monir.educationprojet.Model.Model_University;
import com.example.monir.educationprojet.Model.Model_college;
import com.example.monir.educationprojet.R;

import java.util.ArrayList;

public class College_Activity extends AppCompatActivity {


    private RecyclerView idlistcollege;
    private Model_college model_college;
    private ArrayList<Model_college>colleges;
    private Adapter_college adapter_college;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_);

        idlistcollege=findViewById(R.id.idlistcollege);
        model_college=new Model_college();
        colleges=model_college.getAllCollege();

        adapter_college=new Adapter_college(this,colleges);
        LinearLayoutManager llmn=new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(this,llmn.getOrientation());
        llmn.setOrientation(LinearLayoutManager.VERTICAL);

        idlistcollege.setLayoutManager(llmn);
        idlistcollege.addItemDecoration(dividerItemDecoration);
        idlistcollege.setAdapter(adapter_college);


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
                ArrayList<Model_college>newlistcollege=new ArrayList<>();

                for (Model_college model_college:colleges){

                    String  name=model_college.getCollege_name().toLowerCase();
                    if (name.contains(newText))
                       newlistcollege.add(model_college);
                }
                adapter_college.setFilter(newlistcollege);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
