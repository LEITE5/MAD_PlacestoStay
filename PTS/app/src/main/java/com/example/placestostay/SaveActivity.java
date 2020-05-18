package com.example.placestostay;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SaveActivity extends AppCompatActivity implements View.OnClickListener {

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
        Button saveBtn = (Button)findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        EditText etName = (EditText)findViewById(R.id.etName);
        EditText etType = (EditText)findViewById(R.id.etType);
        EditText etPPN = (EditText)findViewById(R.id.etPPN);
        String name = etName.getText().toString();
        String type = etType.getText().toString();
        String ppn = etPPN.getText().toString();

        Toast.makeText(this, "name - " + name + " type - " + type + " pnn - " + ppn, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent();
        Bundle bundle=new Bundle();
        bundle.putString("ptsName", name);
        bundle.putString("ptsType", type);
        bundle.putString("ptsPPN", ppn);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();
    }


}