package com.programmer.sqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //create references for all controls on the xml file
    EditText studentname,regno,department;
    CheckBox is_active;
    Button show,add;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //locate the controls using their ID's from the XML file
        studentname=findViewById(R.id.name);
        regno=findViewById(R.id.regno);
        department=findViewById(R.id.department);
        is_active=findViewById(R.id.checkBox);
        add=findViewById(R.id.button);
        show=findViewById(R.id.button2);
        listview=findViewById(R.id.ls_view);

        //set onclick listeners fwhich describes click actions on each button
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Content added", Toast.LENGTH_SHORT).show();
            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Content Dispalyed",Toast.LENGTH_SHORT).show();

            }
        });
    }
}