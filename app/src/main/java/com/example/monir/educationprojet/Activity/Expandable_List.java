package com.example.monir.educationprojet.Activity;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.monir.educationprojet.Adapter.Adapter_Expendable_Listview;
import com.example.monir.educationprojet.FileReadUlit;
import com.example.monir.educationprojet.Model.Universitymodelnew;
import com.example.monir.educationprojet.R;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Expandable_List extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private Adapter_Expendable_Listview customAdapter;

    List<String> listheaderData;
    HashMap<String, List<Universitymodelnew>> listDataChild;

    private int lastExpandablePosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable__list);

        preaparelistData();

        expandableListView = findViewById(R.id.expandablelistViewId);
        customAdapter = new Adapter_Expendable_Listview(this, listheaderData, listDataChild);
        expandableListView.setAdapter(customAdapter);

        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {
                String groupName = listheaderData.get(i);
                Toast.makeText(Expandable_List.this, "" + groupName, Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                Universitymodelnew universitymodelnew = listDataChild.get(listheaderData.get(i)).get(i1);
                Toast.makeText(Expandable_List.this, "" + universitymodelnew.getUniversityUnit(), Toast.LENGTH_SHORT).show();


                String pdfName = universitymodelnew.getPDFName();

                FileReadUlit.readFromAssets(Expandable_List.this, pdfName);

                return false;
            }
        });

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
                if (lastExpandablePosition != -1 && lastExpandablePosition != i) {
                    expandableListView.collapseGroup(lastExpandablePosition);
                }
                lastExpandablePosition = i;
            }
        });

        //ADING BACK BUTTON CLICK
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private void preaparelistData() {

      /* String []headerString= getResources().getStringArray(R.array.abbrevation_list_header);
        String []childString= getResources().getStringArray(R.array.abbreviations_list_child);*/


        listheaderData = new ArrayList<>();
        listDataChild = new HashMap<>();

        listheaderData.add("ঢাকা বিশ্ববিদ্যালয়");
        listheaderData.add("ইসলামী বিশ্ববিদ্যালয়");
        listheaderData.add("কুমিল্লা বিশ্ববিদ্যালয়");
        listheaderData.add("খুলনা প্রকৌশল ও প্রযুক্তি বিশ্ববিদ্যালয়");
        listheaderData.add("খুলনা বিশ্ববিদ্যালয়");
        listheaderData.add("চট্টগ্রাম প্রকৌশল ও প্রযুক্তি বিশ্ববিদ্যালয়");
        listheaderData.add("চট্টগ্রাম বিশ্ববিদ্যালয়");
        listheaderData.add("ঢাকা বিশ্ববিদ্যালয়");
        listheaderData.add("ঢাকা বিশ্ববিদ্যালয়");
        listheaderData.add("ঢাকা বিশ্ববিদ্যালয়");
        listheaderData.add("ঢাকা বিশ্ববিদ্যালয়");
        listheaderData.add("ঢাকা বিশ্ববিদ্যালয়");
        listheaderData.add("ঢাকা বিশ্ববিদ্যালয়");
        listheaderData.add("ঢাকা বিশ্ববিদ্যালয়");


        File file = new File("unit.pdf");

        List<Universitymodelnew> dhakauniversity = new ArrayList<>();
       //dhakauniversity.add(new Universitymodelnew("ক ইউনিট", "unit.pdf");


        List<String> c = new ArrayList<>();
        c.add("ক ইউনিট");
        c.add("খ ইউনিট");
        c.add("গ ইউনিট");
        c.add("ঘ ইউনিট");
        c.add("ঙ ইউনিট");


        List<String> d = new ArrayList<>();
        d.add("a uniy");
        d.add("a uniy");
        d.add("a uniy");
        d.add("a uniy");




        List<String> e = new ArrayList<>();
        e.add("a unit");
        e.add("a unit");
        e.add("a unit");
        e.add("a unit");

        List<String>f= new ArrayList<>();
        f.add("a unit");
        f.add("a unit");
        f.add("a unit");
        f.add("a unit");
        f.add("a unit");

        List<String> g = new ArrayList<>();
        g.add("a unit");
        g.add("a unit");
        g.add("a unit");
        g.add("a unit");



        /*for (int i = 0; i <headerString.length ; i++) {
          listheaderData.add(headerString[i])  ;
          List<String>child=new ArrayList<>();
          child.add(childString[i]);


        }*/

        listDataChild.put(listheaderData.get(0), dhakauniversity);
//       listDataChild.put(listheaderData.get(1),c);
//        listDataChild.put(listheaderData.get(2), d);
//        listDataChild.put(listheaderData.get(3), e);
//        listDataChild.put(listheaderData.get(4), f);
//        listDataChild.put(listheaderData.get(5),g);

    }

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
                ArrayList<String>newlistcollege=new ArrayList<>();

                for (String item:listheaderData){
                    int i = listheaderData.indexOf(item);

//
//                    String  name=model_college.getCollege_name().toLowerCase();
//                    if (name.contains(newText))
//                        newlistcollege.add(model_college);
                }
               // adapter_college.setFilter(newlistcollege);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
