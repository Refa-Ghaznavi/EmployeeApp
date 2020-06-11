package com.example.employeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etEnterNumber;
    TextView tvValue;
    Button bntConverter;
    double inTax = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEnterNumber = findViewById(R.id.et_enter_number);
        bntConverter = findViewById(R.id.btn_convert);
        tvValue = findViewById(R.id.tv_value);

        bntConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertFromKiloToPound();
            }
        });
    }
    // this method is converted the Value to String
    private void ConvertFromKiloToPound() {
        // converting the Value to String
        String valueEnteredInKilo = etEnterNumber.getText().toString();
        // converting the string to number(double)
        double kilo = Double.parseDouble(valueEnteredInKilo);
        double pounds = kilo * 2.205;
        // displaying the number to the TextView(tvValue)
        tvValue.setText(""+pounds);
    }
}