package com.softtech.clark.fraccionario;

import android.app.AlertDialog;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText num1, num2, numres, den1, den2, denres;
    Button suma, resta, multi, divi, sim, borrar;
    LinearLayout vista;
    String numeradorresultante, denominadorresultante;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        numres = (EditText) findViewById(R.id.txtNumRes);
        denres = (EditText) findViewById(R.id.txtDemRes);
        numeradorresultante = numres.getText().toString();
        denominadorresultante = denres.getText().toString();
        if (savedInstanceState != null){
           numeradorresultante = savedInstanceState.getString("numeradorresultante");
            denominadorresultante = savedInstanceState.getString("denominadorresultante;");
            numres.setText(numeradorresultante);
            denres.setText(denominadorresultante);
        }else{
            numeradorresultante = numres.getText().toString();
            denominadorresultante = denres.getText().toString();
            numres.setText(numeradorresultante);
            denres.setText(denominadorresultante);
        }



        setToolbar(); // Setear Toolbar como action bar

        num1 = (EditText) findViewById(R.id.txtNumerador1);
        num2 = (EditText) findViewById(R.id.txtNumerador2);
        den1 = (EditText) findViewById(R.id.txtDenominador1);
        den2 = (EditText) findViewById(R.id.txtDenominador2);

        suma = (Button) findViewById(R.id.btnSumar);
        resta = (Button) findViewById(R.id.btnRestar);
        multi = (Button) findViewById(R.id.btnMultiplicar);
        divi = (Button) findViewById(R.id.btnDividir);
        sim = (Button) findViewById(R.id.btnSimplificar);
        borrar = (Button) findViewById(R.id.btnBorrar);
        vista = (LinearLayout)findViewById(R.id.linearLayout4);

        sim.setEnabled(false);
        borrar.setEnabled(false);
        numres.setKeyListener(null);
        denres.setKeyListener(null);




        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().length() == 0 || num2.getText().length() == 0 || den1.getText().length() == 0
                        || den2.getText().length() == 0) {
                    Toast.makeText(Main2Activity.this, "Rellene los campos vacios", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(den1.getText().toString()) == 0 || Integer.parseInt(den2.getText().toString()) == 0) {
                    Toast.makeText(Main2Activity.this, "El denominadro debe ser diferente de 0", Toast.LENGTH_SHORT).show();
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

                    InputMethodManager imm = (InputMethodManager) getSystemService(
                            INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);


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
                    Toast.makeText(Main2Activity.this, "Rellene los campos vacios", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(den1.getText().toString()) == 0 || Integer.parseInt(den2.getText().toString()) == 0) {
                    Toast.makeText(Main2Activity.this, "El denominadro debe ser diferente de 0", Toast.LENGTH_SHORT).show();
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
                    InputMethodManager imm = (InputMethodManager) getSystemService(
                            INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

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
                    Toast.makeText(Main2Activity.this, "Rellene los campos vacios", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(den1.getText().toString()) == 0 || Integer.parseInt(den2.getText().toString()) == 0) {
                    Toast.makeText(Main2Activity.this, "El denominadro debe ser diferente de 0", Toast.LENGTH_SHORT).show();
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
                    InputMethodManager imm = (InputMethodManager) getSystemService(
                            INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

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
                    Toast.makeText(Main2Activity.this, "Rellene los campos vacios", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(den1.getText().toString()) == 0 || Integer.parseInt(den2.getText().toString()) == 0) {
                    Toast.makeText(Main2Activity.this, "El denominadro debe ser diferente de 0", Toast.LENGTH_SHORT).show();
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
                    InputMethodManager imm = (InputMethodManager) getSystemService(
                            INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);


                    sim.setEnabled(true);
                    borrar.setEnabled(true);
                }
            }
        });

        sim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numres.getText().length() == 0 || denres.getText().length() == 0) {
                    Toast.makeText(Main2Activity.this, "No ha hecho una operacion", Toast.LENGTH_SHORT).show();
                } else {
                    int num = Integer.parseInt(numres.getText().toString());
                    int den = Integer.parseInt(denres.getText().toString());
                    Fraccion a = new Fraccion(num, den);
                    a.simplificar();
                    numres.setText(String.valueOf(a.getNumerador()));
                    denres.setText(String.valueOf(a.getDenominador()));
                    double numsim = a.getNumerador()/a.getDenominador();
                    String simplificado = String.valueOf(numsim);

                    borrar.setEnabled(true);

                    Snackbar.make(v, simplificado, Snackbar.LENGTH_LONG)
                            .show();
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

        vista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(Main2Activity.this);
                alert.setTitle("Resultado");
                alert.setMessage("Numerador: "+numres.getText().toString()+"\nDenominador: "+denres.getText().toString());
                alert.create()
                        .show();
            }
        });

        vista.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(Main2Activity.this);
                alert.setTitle("Resultado");
                alert.setMessage("Numerador: " + numres.getText().toString() + "\nDenominador: " + denres.getText().toString());
                alert.create()
                        .show();

                return true;
            }
        });


    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("numeradorresultante", numeradorresultante);
        outState.putString("denominadorresultante", denominadorresultante);
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle presses on the action bar items
        if (item.getItemId() == R.id.action_settings) {
           finish();
        }

        return true;
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            // Poner ícono del drawer toggle
           // ab.setHomeAsUpIndicator(R.drawable.ic_action_math_function_mathematical_fraction_512);
            //ab.setDisplayHomeAsUpEnabled(true);
            ab.setIcon(R.drawable.ic_action_math_function_mathematical_fraction_512);
        }
    }
}



