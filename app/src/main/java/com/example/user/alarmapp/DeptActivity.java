package com.example.user.alarmapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DeptActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dept);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String[] values = new String[] { "CEG CAMPUS","MIT CAMPUS","ACT CAMPUS","SAP CAMPUS","AFFLIATED COLLEGES"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0) {
                    Intent newActivity = new Intent(DeptActivity.this, CEGActivity.class);
                    startActivity(newActivity);

                } else if (position == 1) {
                    Intent newActivity1 = new Intent(DeptActivity.this, MITActivity.class);
                    startActivity(newActivity1);
                } else if (position == 2) {
                    Intent newActivity2 = new Intent(DeptActivity.this, ACTActivity.class);
                    startActivity(newActivity2);

                } else if (position == 3) {
                    Intent newActivity3 = new Intent(DeptActivity.this, SAPActivity.class);
                    startActivity(newActivity3);
                }

            }
    });
}
}
