package com.example.convertersuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText celcius, kelvin, farenheit, reamur;
    Button btnConvert, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celcius = (EditText) findViewById(R.id.editTextCelcius);
        kelvin = (EditText) findViewById(R.id.editTextKelvin);
        farenheit = (EditText) findViewById(R.id.editTextFarenheit);
        reamur = (EditText) findViewById(R.id.editTextReamur);

        btnConvert = (Button) findViewById(R.id.btnConvert);
        btnExit = (Button) findViewById(R.id.btnExit);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Convert();
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void Convert() {
        try {
            int celciusDegree = Integer.parseInt(celcius.getText().toString());
            double kelvinDegree = (double) celciusDegree + 273;
            double farenheitDegree = (double) (celciusDegree * 9/5) + 32;
            double reamurDegree = (double) celciusDegree * 4/5;
            kelvin.setText(String.valueOf(kelvinDegree));
            farenheit.setText(String.valueOf(farenheitDegree));
            reamur.setText(String.valueOf(reamurDegree));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}