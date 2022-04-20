package com.nscando.problema6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private Spinner spinner;
   private EditText primerValor, segundoValor;
   private TextView resultado;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      primerValor = (EditText) findViewById(R.id.primerValor);
      segundoValor = (EditText) findViewById(R.id.segundoValor);
      resultado = (TextView) findViewById(R.id.resultado);

      spinner = (Spinner) findViewById(R.id.spinner);
      String[] opciones = {"sumar", "restar", "multiplicar", "dividir"};
      ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
      spinner.setAdapter(adapter);
   }

   public void operar(View view) {

      hideTeclado();

      String valor1 = primerValor.getText().toString();
      String valor2 = segundoValor.getText().toString();

      int val1 = Integer.parseInt(valor1);
      int val2 = Integer.parseInt(valor2);

      String spinnerSelected = spinner.getSelectedItem().toString();

      if (spinnerSelected.equals("sumar")) {
         int suma = val1 + val2;
         String result = String.valueOf(suma);
         resultado.setText(result);
      }
      if (spinnerSelected.equals("restar")) {
         int resta = val1 - val2;
         String result = String.valueOf(resta);
         resultado.setText(result);
      }
      if (spinnerSelected.equals("multiplicar")) {
         int multiplica = val1 * val2;
         String result = String.valueOf(multiplica);
         resultado.setText(result);

      }
      if (spinnerSelected.equals("dividir")) {
         int divide = val1 / val2;
         String result = String.valueOf(divide);
         resultado.setText(result);
      }
   }

   private void hideTeclado() {
      View view = this.getCurrentFocus();

      if (view != null) {
         InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
         imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

      }
   }
}