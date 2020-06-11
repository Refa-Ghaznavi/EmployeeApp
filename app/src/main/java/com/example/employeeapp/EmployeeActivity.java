package com.example.employeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EmployeeActivity extends AppCompatActivity {

    EditText etEnterNumber;
    TextView tvSalary,tvTaxSalary,tvNetSalary;
    Button btnConvert;
    int inTax = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);


        etEnterNumber = findViewById(R.id.et_enter_number);
        tvSalary = findViewById(R.id.tv_salary);
        tvTaxSalary = findViewById(R.id.tv_tax_salary);
        tvNetSalary = findViewById(R.id.tv_net_salary);

        btnConvert = findViewById(R.id.btn_convert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickToShow();
            }
        });
    }

    public void clickToShow(){
        // converting the Value to String
        String valueEnterOne = etEnterNumber.getText().toString();
        // converting the string to number(integer)
        int salary = Integer.parseInt(valueEnterOne);
        tvSalary.setText(""+salary);
        if (salary > 30000)
        {
            inTax = salary*20/100;
        }
        else if (salary >= 20000 && salary <= 30000)
        {
            inTax = salary*15/100;
        }
        else if (salary < 20000)
        {
            inTax = salary*10/100;
        }
        else
        {
            inTax = 0;
        }
        tvTaxSalary.setText(""+inTax);
        int netSalary = salary-inTax;
        tvNetSalary.setText(""+netSalary);
    }
}