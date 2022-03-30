package com.nscando.problema2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText usuario, password;
    private TextView tv_respuesta, tv_respuesta1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText) findViewById(R.id.usuario);
        password = (EditText) findViewById(R.id.password);
        tv_respuesta = (TextView) findViewById(R.id.tv_respuesta);
        tv_respuesta1 = (TextView) findViewById(R.id.tv_respuesta1);
    }

    public void verificar(View view) {

        String valorUsuario = usuario.getText().toString();
        String valorPassword = password.getText().toString();

        if (valorPassword.length() > 10 || valorPassword.length() == 0) {
            tv_respuesta.setText("Su contraseña debe tener al menos un caracter y no ser mayor a diez caracteres");
        } else {
            tv_respuesta1.setText("Inicio de sesion existoso.");
        }

    }
}