package com.nscando.problema5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton dolar, euro;
    private TextView tvResulado;
    private EditText valorIngresado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dolar = (RadioButton) findViewById(R.id.radioButton1);
        euro = (RadioButton) findViewById(R.id.radioButton2);
        tvResulado = (TextView) findViewById(R.id.tvResultado);
        valorIngresado = (EditText) findViewById(R.id.valorIngresado);


    }

    public void calcular(View view) {

        int valorDolar = 203;
        int valorEuro = 255;
        int resultado = 0;

        String valIngresado = valorIngresado.getText().toString();
        int val1 = Integer.parseInt(valIngresado);

        if (dolar.isChecked()) {
            resultado = val1 * valorDolar;

            tvResulado.setText("el valor es " + resultado);
        }
        else if (euro.isChecked()) {
            resultado = val1 * valorEuro;

            tvResulado.setText("el valor es " + resultado);
        }



    }
}