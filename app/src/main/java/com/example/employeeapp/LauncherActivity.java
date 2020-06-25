package com.example.employeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LauncherActivity extends AppCompatActivity {

    Button btnUnitConverter, btnTaxConverter, btnMortgageConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        btnUnitConverter = findViewById(R.id.btn_un_con);
        btnTaxConverter = findViewById(R.id.btn_tax_con);
        btnMortgageConverter = findViewById(R.id.btn_mort_con);

        btnUnitConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),UnitConverterActivity.class);
                startActivity(intent);
            }
        });
        btnTaxConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),EmployeeActivity.class);
                startActivity(intent);
            }
        });
        btnMortgageConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MortgageActivity.class);
                startActivity(intent);
            }
        });
    }
}