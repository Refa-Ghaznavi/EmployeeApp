package com.example.employeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.NumberFormat;

public class MortgageActivity extends AppCompatActivity {

    EditText etMoney, etInterest, etYears, etResult;
    Button btnConverter;

    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;
    double mortgage = 0;
    // this comment needs the ClickToShowTwo Method
    /*int principal = 0;
    double monthlyInterest = 0;
    int numberOfPayments = 0;
    double annualInterest = 0;
    int years = 0;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mortgage);

        etMoney = findViewById(R.id.et_money);
        etInterest = findViewById(R.id.et_interest);
        etYears = findViewById(R.id.et_years);
        etResult = findViewById(R.id.et_result);

        btnConverter = findViewById(R.id.btn_con);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //the clickToShow is coded without validation
                clickToShow();
                // the clickToShowTwo is coded with validation which is not working
                // clickToShowTwo();
            }
        });
    }

    // the clickToShowTwo is coded with validation which is not working
    /*private void clickToShowTwo() {
        while (true){
            String valueOfMoney = etMoney.getText().toString();
            principal = Integer.parseInt(valueOfMoney);
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            Toast.makeText(this, "The value b/w 1k & 1M", Toast.LENGTH_SHORT).show();
        }

        while (true) {
            String valueOfInterest = etInterest.getText().toString();
            annualInterest = Double.parseDouble(valueOfInterest);
            if (annualInterest >= 1 && annualInterest <= 30){
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            Toast.makeText(this, "Enter a value b/w 1 & 30", Toast.LENGTH_SHORT).show();
        }

        while (true) {
            String valueOfYears = etYears.getText().toString();
            years = Integer.parseInt(valueOfYears);
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            Toast.makeText(this, "Enter a value b/w 1 & 30", Toast.LENGTH_SHORT).show();
        }

        mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        etResult.setText(mortgageFormatted);
    }*/

    public void clickToShow() {
        // converting the Value to String
        String valueOfMoney = etMoney.getText().toString();
        int principal = Integer.parseInt(valueOfMoney);

        String valueOfInterest = etInterest.getText().toString();
        double annualInterest = Double.parseDouble(valueOfInterest);
        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        String valueOfYears = etYears.getText().toString();
        int years = Integer.parseInt(valueOfYears);
        int numberOfPayments = years * MONTHS_IN_YEAR;

        mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        etResult.setText(mortgageFormatted);
    }
}