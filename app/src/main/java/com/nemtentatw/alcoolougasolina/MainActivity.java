package com.nemtentatw.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    private EditText editPrecoGasolina;
    private EditText editPrecoAlcool;
    private TextView textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoGasolina = findViewById(R.id.editGasolina);
        editPrecoAlcool = findViewById(R.id.editAlcool);
        textResultado = findViewById(R.id.textResultado);

    }

    public void calcularPreco(View view) {

        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());
        Double resultado = precoGasolina*precoAlcool;
        textResultado.setText("Seu automóvel faz: " + resultado + "km");


        }
    }







