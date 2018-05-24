package com.example.kandulap2510.mycontactapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editText_Name);
        myDb = new DatabaseHelper(this);
        Log.d("MyContactApp","MainActivity: instantiated MyDb");
    }

    public void addData(View view){
        Log.d("MyContactApp","MainActivity: Button Action Failed To Execute");

        boolean isInserted = myDb.insertData(editName.getText().toString());
        if (isInserted){
            Toast.makeText(MainActivity.this, "Success - contact inserted", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this, "Failed - contact not inserted", Toast.LENGTH_LONG).show();

        }

    }

}
