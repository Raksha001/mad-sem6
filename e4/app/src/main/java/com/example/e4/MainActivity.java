package com.example.e4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edName,edLoc,ed;
    TextView tv;
    String s1,s2;
    DbExample dbExample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edName=findViewById(R.id.editTextTextPersonName2);
        edLoc=findViewById(R.id.editTextTextPersonName3);
        ed=findViewById(R.id.editTextTextPersonName4);
        tv=findViewById(R.id.textView);
        dbExample = new DbExample(MainActivity.this);
    }

    public void savew(View view) {
        s1=edName.getText().toString();
        s2=edLoc.getText().toString();
        dbExample.sav(s1,s2);
        Toast.makeText(MainActivity.this, s1+"\t"+s2+" is saved to database", Toast.LENGTH_SHORT).show();
    }

    public void retr(View view) {
        String rtv=ed.getText().toString();
        String b = dbExample.retrv(rtv);
        tv.setText(b);
    }
}
