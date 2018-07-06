package com.android.ssmyat.datacommunication.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.android.ssmyat.datacommunication.R;
import com.android.ssmyat.datacommunication.data.parcel.Student;

public class SecondActivity extends AppCompatActivity {
    Bundle bundle;
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        bundle = getIntent().getExtras();

        student = bundle.getParcelable("student");

        //Log.i("DC_SECOND",bundle.getString("string_key"));
        Log.i("DC_Name",student.getName());
        student.setAddress("Mayangone");
        //bundle.putParcelable("student",student);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("DC_Back_Name",student.getName());
        Log.i("DC_Back_Address",student.getAddress());
       // Log.i("DC_Back_Education",student.getEducation());
    }
}
