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

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Bundle bundle = getIntent().getExtras();
        Student student = bundle.getParcelable("student");
        Log.i("DC_Address",student.getAddress());
        Log.i("DC_Name",student.getName());
        student.setEducation("Five");
        student.setOccupation("soefe");
        //bundle.putParcelable("student",student);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent intent = new Intent(ThirdActivity.this,FourthActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}
