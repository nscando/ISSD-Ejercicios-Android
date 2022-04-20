package com.nscando.problema1;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.example_menu, menu);
        return true;
    }

    public void mensaje1(View view){
        Toast toast1 = Toast.makeText(this,"Toast basic", Toast.LENGTH_SHORT);
        toast1.show();
    }

    public void mensaje2(View view){
        Toast toast1 = Toast.makeText(this,"Toast en una determinada ubicacion", Toast.LENGTH_LONG);
        toast1.setGravity(Gravity.CENTER, 25, 50);
        toast1.show();
    }


}