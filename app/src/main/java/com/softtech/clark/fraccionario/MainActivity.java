package com.softtech.clark.fraccionario;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.softtech.clark.fraccionario.Fraccion;


public class MainActivity extends AppCompatActivity {

    EditText num1, num2, numres, den1, den2, denres;
    Button suma, resta, multi, divi, sim, borrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.txtNumerador1);
        num2 = (EditText) findViewById(R.id.txtNumerador2);
        den1 = (EditText) findViewById(R.id.txtDenominador1);
        den2 = (EditText) findViewById(R.id.txtDenominador2);
        numres = (EditText) findViewById(R.id.txtNumRes);
        denres = (EditText) findViewById(R.id.txtDemRes);
        suma = (Button) findViewById(R.id.btnSumar);
        resta = (Button) findViewById(R.id.btnRestar);
        multi = (Button) findViewById(R.id.btnMultiplicar);
        divi = (Button) findViewById(R.id.btnDividir);
        sim = (Button) findViewById(R.id.btnSimplificar);
        borrar = (Button) findViewById(R.id.btnBorrar);

        sim.setEnabled(false);
        borrar.setEnabled(false);


        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().length() == 0 || num2.getText().length() == 0 || den1.getText().length() == 0
                        || den2.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "Rellene los campos vacios", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(den1.getText().toString()) == 0 || Integer.parseInt(den2.getText().toString()) == 0) {
                    Toast.makeText(MainActivity.this, "El denominadro debe ser diferente de 0", Toast.LENGTH_SHORT).show();
                } else {
                    int Nume1 = Integer.parseInt(num1.getText().toString());
                    int Deno1 = Integer.parseInt(den1.getText().toString());
                    int Nume2 = Integer.parseInt(num2.getText().toString());
                    int Deno2 = Integer.parseInt(den2.getText().toString());

                    Fraccion f1 = new Fraccion(Nume1, Deno1);
                    Fraccion f2 = new Fraccion(Nume2, Deno2);
                    Fraccion resultado = f1.suma(f2);
                    numres.setText(String.valueOf(resultado.getNumerador()));
                    denres.setText(String.valueOf(resultado.getDenominador()));

                    sim.setEnabled(true);
                    borrar.setEnabled(true);
                }
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().length() == 0 || num2.getText().length() == 0 || den1.getText().length() == 0
                        || den2.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "Rellene los campos vacios", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(den1.getText().toString()) == 0 || Integer.parseInt(den2.getText().toString()) == 0) {
                    Toast.makeText(MainActivity.this, "El denominadro debe ser diferente de 0", Toast.LENGTH_SHORT).show();
                } else {
                    int Nume1 = Integer.parseInt(num1.getText().toString());
                    int Deno1 = Integer.parseInt(den1.getText().toString());
                    int Nume2 = Integer.parseInt(num2.getText().toString());
                    int Deno2 = Integer.parseInt(den2.getText().toString());

                    Fraccion f1 = new Fraccion(Nume1, Deno1);
                    Fraccion f2 = new Fraccion(Nume2, Deno2);
                    Fraccion resultado = f1.resta(f2);
                    numres.setText(String.valueOf(resultado.getNumerador()));
                    denres.setText(String.valueOf(resultado.getDenominador()));
                    sim.setEnabled(true);
                    borrar.setEnabled(true);
                }
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().length() == 0 || num2.getText().length() == 0 || den1.getText().length() == 0
                        || den2.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "Rellene los campos vacios", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(den1.getText().toString()) == 0 || Integer.parseInt(den2.getText().toString()) == 0) {
                    Toast.makeText(MainActivity.this, "El denominadro debe ser diferente de 0", Toast.LENGTH_SHORT).show();
                } else {
                    int Nume1 = Integer.parseInt(num1.getText().toString());
                    int Deno1 = Integer.parseInt(den1.getText().toString());
                    int Nume2 = Integer.parseInt(num2.getText().toString());
                    int Deno2 = Integer.parseInt(den2.getText().toString());

                    Fraccion f1 = new Fraccion(Nume1, Deno1);
                    Fraccion f2 = new Fraccion(Nume2, Deno2);
                    Fraccion resultado = f1.multiplicacion(f2);
                    numres.setText(String.valueOf(resultado.getNumerador()));
                    denres.setText(String.valueOf(resultado.getDenominador()));
                    sim.setEnabled(true);
                    borrar.setEnabled(true);
                }
            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().length() == 0 || num2.getText().length() == 0 || den1.getText().length() == 0
                        || den2.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "Rellene los campos vacios", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(den1.getText().toString()) == 0 || Integer.parseInt(den2.getText().toString()) == 0) {
                    Toast.makeText(MainActivity.this, "El denominadro debe ser diferente de 0", Toast.LENGTH_SHORT).show();
                } else {
                    String numerador1 = num1.getText().toString();
                    String numerador2 = num2.getText().toString();
                    String denominador1 = den1.getText().toString();
                    String denominador2 = den2.getText().toString();
                    int Nume1 = Integer.parseInt(numerador1);
                    int Deno1 = Integer.parseInt(denominador1);
                    int Nume2 = Integer.parseInt(numerador2);
                    int Deno2 = Integer.parseInt(denominador2);

                    Fraccion f1 = new Fraccion(Nume1, Deno1);
                    Fraccion f2 = new Fraccion(Nume2, Deno2);
                    Fraccion resultado = f1.dividir(f2);
                    String numresu = String.valueOf(resultado.getNumerador());
                    String denresu = String.valueOf(resultado.getDenominador());
                    numres.setText(numresu);
                    denres.setText(denresu);

                    sim.setEnabled(true);
                    borrar.setEnabled(true);
                }
            }
        });

        sim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numres.getText().length() == 0 || denres.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "No ha hecho una operacion", Toast.LENGTH_SHORT).show();
                } else {
                    int num = Integer.parseInt(numres.getText().toString());
                    int den = Integer.parseInt(denres.getText().toString());
                    Fraccion a = new Fraccion(num, den);
                    a.simplificar();
                    numres.setText("" + a.getNumerador());
                    denres.setText("" + a.getDenominador());
                    borrar.setEnabled(true);
                }
            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                numres.setText("");
                den1.setText("");
                den2.setText("");
                denres.setText("");
                num1.requestFocus();
                sim.setEnabled(false);
                borrar.setEnabled(false);
            }
        });


    }

}


