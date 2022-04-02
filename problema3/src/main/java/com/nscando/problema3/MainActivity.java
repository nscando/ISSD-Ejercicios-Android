package com.nscando.problema3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private int numRandom = (int) (Math.random() * 100000 + 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast al iniciar la app
        Toast toast = Toast.makeText(this, "El Numero Random es " + numRandom, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();

        //Obtencion de los datos provenientes del campo del Edit Text
        editText1 = (EditText) findViewById(R.id.editText1);
    }

    public void verificacion(View view) {
        String val1 = editText1.getText().toString();

        int nro1 = Integer.parseInt(val1);

        if (nro1 != numRandom) {
            Toast toast = Toast.makeText(this, "El Numero Ingresado es incorrecto, ingresa otro.", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.show();
        } else {
            Toast toast1 = Toast.makeText(this, "El Numero Ingresado es el correcto", Toast.LENGTH_SHORT);
            toast1.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast1.show();
        }

    }
}