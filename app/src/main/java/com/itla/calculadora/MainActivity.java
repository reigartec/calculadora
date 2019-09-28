package com.itla.calculadora;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public String operacion;
    public TextView tvres1,tvres2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        operacion = "";
        Button b0 = (Button) findViewById(R.id.b0);
        b0.setOnClickListener(this);
        Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(this);
        Button b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(this);
        Button b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(this);
        Button b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(this);
        Button b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(this);
        Button b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(this);
        Button b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(this);
        Button b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(this);
        Button bpunto = (Button) findViewById(R.id.bpunto);
        bpunto.setOnClickListener(this);
        Button bmas = (Button) findViewById(R.id.bmas);
        bmas.setOnClickListener(this);
        Button bmenos = (Button) findViewById(R.id.bmenos);
        bmenos.setOnClickListener(this);
        Button bmultiplicar = (Button) findViewById(R.id.bmultiplicar);
        bmultiplicar.setOnClickListener(this);
        Button bdividir = (Button) findViewById(R.id.bdividir);
        bdividir.setOnClickListener(this);
        Button bporcentaje = (Button) findViewById(R.id.bporcentaje);
        bporcentaje.setOnClickListener(this);
        Button bborrar = (Button) findViewById(R.id.bborrar);
        bborrar.setOnClickListener(this);
        Button bigual = (Button) findViewById(R.id.bigual);
        bigual.setOnClickListener(this);
        tvres1 = (TextView) findViewById(R.id.TVres1);
        tvres2 = (TextView) findViewById(R.id.TVres2);




    }

    @Override
    public void onClick(View v) {

        String[] separaciones=null;
        Float res=0.00f;//inicializada con una f indicando que es float.
        Float numero;
        switch (v.getId()){

            case R.id.bigual:
                if(!operacion.isEmpty())
                {
                    tvres2.setText(operacion);
                    separaciones = operacion.split("\\+");
                    for (String item : separaciones)
                    {
                        //System.out.println("item = " + item);
                        numero = Float.parseFloat(item);
                        res = res + numero;
                    }
                    //res = Float.parseFloat(separaciones[0]) + Float.parseFloat(separaciones[1]);
                    tvres1.setText(res.toString());



                }
                break;

            case R.id.bborrar:
                    operacion="";
                    tvres2.setText("");
                    tvres1.setText("0");
                break;

            case R.id.b0:
                operacion=operacion+"0";
                Toast.makeText(this, "tecleaste el 0", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b1:
                operacion=operacion+"1";
                break;
            case R.id.b2:
                operacion=operacion+"2";
                break;
            case R.id.b3:
                operacion=operacion+"3";
                break;
            case R.id.b4:
                operacion=operacion+"4";
                break;
            case R.id.b5:
                operacion=operacion+"5";
                break;

            case R.id.b6:
                operacion=operacion+"6";
                break;

            case R.id.b7:
                operacion=operacion+"7";
                break;

            case R.id.b8:
                operacion=operacion+"8";
                break;

            case R.id.b9:
                operacion=operacion+"9";
                break;

            case R.id.bmas:
                operacion=operacion+"+";
                break;

            case R.id.bmenos:
                operacion=operacion+"-";
                break;

            case R.id.bmultiplicar:
                operacion=operacion+"*";
                break;

            case R.id.bdividir:
                operacion=operacion+"/";
                break;

            case R.id.bpunto:
                operacion=operacion+".";
                break;

            case R.id.bporcentaje:
                operacion=operacion+"%";
                break;

        }

            tvres2.setText(operacion);

    }

    /*
    public class Botones implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {

        }
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this, "tecleaste el 0", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.b0) {
            Toast.makeText(this, "tecleaste el 0", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
