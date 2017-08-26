package com.example.alejoaj.practica1_p3;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private String operando = "";
    private TextView tinfo;
    private Button N0, N1, N2, N3, N4, N5, N6, N7, N8, N9, Nmas, Nmenos, Nmulti, Ndivi, Npunto, Nigual;
    private float num1 = 0, num2 = 0, num3 = 1, num48;
    private int flag = 44,flag2 = 22;
    private int flagpunto = 0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
            en vez de obtener la variable con operando, obtenerla
            desde el set tex directamente
        */

        tinfo = (TextView) findViewById(R.id.tinfo);
        N0 = (Button) findViewById(R.id.N0);
        N1 = (Button) findViewById(R.id.N1);
        N2 = (Button) findViewById(R.id.N2);
        N3 = (Button) findViewById(R.id.N3);
        N4 = (Button) findViewById(R.id.N4);
        N5 = (Button) findViewById(R.id.N5);
        N6 = (Button) findViewById(R.id.N6);
        N7 = (Button) findViewById(R.id.N7);
        N8 = (Button) findViewById(R.id.N8);
        N9 = (Button) findViewById(R.id.N9);
        Npunto = (Button) findViewById(R.id.Npunto);
        Nmas = (Button) findViewById(R.id.Nmas);
        Nmenos = (Button) findViewById(R.id.Nmenos);
        Nmulti = (Button) findViewById(R.id.Nmulti);
        Ndivi = (Button) findViewById(R.id.Ndivi);
        Nigual = (Button) findViewById(R.id.Nigual);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void CN0(View view) {
        operando = operando + "0";
        tinfo.setText(operando);
        flag2 = 44;
    }

    public void CN1(View view) {
        operando = operando + "1";
        tinfo.setText(operando);
        flag2 = 44;
    }

    public void CN2(View view) {
        operando = operando + "2";
        tinfo.setText(operando);
        flag2 = 44;
    }

    public void CN3(View view) {
        operando = operando + "3";
        tinfo.setText(operando);
        flag2 = 44;
    }

    public void CN4(View view) {
        operando = operando + "4";
        tinfo.setText(operando);
        flag2 = 44;
    }

    public void CN5(View view) {
        operando = operando + "5";
        tinfo.setText(operando);
        flag2 = 44;
    }

    public void CN6(View view) {
        operando = operando + "6";
        tinfo.setText(operando);
        flag2 = 44;
    }

    public void CN7(View view) {
        operando = operando + "7";
        tinfo.setText(operando);
        flag2 = 44;
    }

    public void CN8(View view) {
        operando = operando + "8";
        tinfo.setText(operando);
        flag2 = 44;
    }

    public void CN9(View view) {
        operando = operando + "9";
        tinfo.setText(operando);
        flag2 = 44;
    }

    public void CNpunto(View view) {
        flag2 = 44;
        if (flagpunto == 0) {
            operando = operando + ".";
            tinfo.setText(operando);
            flagpunto = 1;
        } else {

        }
    }


    public void CNdivi(View view) {
        if(flag2 == 3){

        }else {
            flagpunto = 0;
            flag = 3;
            flag2 = 3;
            operando = tinfo.getText().toString();
            num2 = Float.parseFloat(operando);
            if (num3 == 0) {
                tinfo.setText("Eror de operación");
            } else {
                num3 = num2 / num3;
                num1 = num3;
                if (num1 == (int) num1)
                    operando = String.valueOf((int) num1);
                else
                    operando = String.valueOf(num1);
                tinfo.setText(operando);
                operando = "";
            }
        }
    }

    public void CNmulti(View view) {

        if (flag2 == 2){

        }else{
            flagpunto = 0;
            flag = 2;
            flag2 = 2;
            operando = tinfo.getText().toString();
            num2 = Float.parseFloat(operando);
            num3 = num2 * num3;
            num1 = num3;
            if (num1 == (int) num1)
                operando = String.valueOf((int) num1);
            else
                operando = String.valueOf(num1);
            tinfo.setText(operando);
            operando = "";
        }

    }

    public void CNmenos(View view) {

        if (flag2 == 1){

        }else {
            flagpunto = 0;
            flag = 1;
            flag2 = 1;
            operando = tinfo.getText().toString();
            num2 = Float.parseFloat(operando);
            num1 = num2 - num1;
            if (num1 == (int) num1)
                operando = String.valueOf((int) num1);
            else
                operando = String.valueOf(num1);
            tinfo.setText(operando);
            operando = "";
        }
    }

    public void CNmas(View view) {

        if (flag2 == 0){

        }else{
            flagpunto = 0;
            flag = 0;
            flag2 = 0;
            operando = tinfo.getText().toString();
            num2 = Float.parseFloat(operando);
            num1 = num1 + num2;
            if (num1 == (int) num1)
                operando = String.valueOf((int) num1);
            else
                operando = String.valueOf(num1);
            tinfo.setText(operando);
            operando = "";
        }
    }

    public void CNigual(View view) {
        operando = tinfo.getText().toString();
        num2 = Float.parseFloat(operando);

        if (flag == 0) {
            num1 = num1 + num2;
        } else if (flag == 1) {
            num1 = num1 - num2;
        } else if (flag == 2) {
            num1 = num1 * num2;
        } else if (flag == 3) {
            if (num2 == 0.0) {
                operando = "Operación inválida";

            } else {
                num1 = num1 / num2;
            }
        } else if (flag == 9) {
            num1 = num48;
        }

        if (operando == "Operación inválida") {
            tinfo.setText(operando);
        }else{
            if (num1 == (int) num1)
                operando = String.valueOf((int) num1);
            else
                operando = String.valueOf(num1);
            tinfo.setText(operando);
        }
        num48 = num1;
        flag = 9;
        flagpunto = 0;
        num1 = 0;
        num2 = 0;
        num3 = 1;
        operando = "";
    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}

