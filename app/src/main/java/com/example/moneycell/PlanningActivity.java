package com.example.moneycell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PlanningActivity extends AppCompatActivity {


    TextView totalText;


    public void calculateFunction(View view)
    {
        TextView totalTextView = findViewById(R.id.thirdUserAccount);
        String totalAmount = totalTextView.getText().toString();
        int total = Integer.parseInt(totalAmount);

        int total_caution = total;

        EditText homeExpense = findViewById(R.id.homeExpense);
        EditText familyExpense = findViewById(R.id.familyExpense);

        EditText salaryIncome = findViewById(R.id.salaryIncome);
        EditText savingsIncome = findViewById(R.id.savings);


        TextView incomes = findViewById(R.id.incomes);
        TextView outcomes = findViewById(R.id.outcomes);

        int home_expense = 0;
        home_expense += Integer.parseInt(homeExpense.getText().toString());

        int family_expense = 0;
        family_expense += Integer.parseInt(familyExpense.getText().toString());


        int sum_outcomes = home_expense + family_expense;

        int salary_income = 0;
        salary_income = Integer.parseInt(salaryIncome.getText().toString());


        int savings_income = 0;
        savings_income = Integer.parseInt(savingsIncome.getText().toString());

        int sum_incomes = salary_income + savings_income;

        String in = "+" + Integer.toString(sum_incomes);
        incomes.setText(in + " $");
        String out ="-" + Integer.toString(sum_outcomes);
        outcomes.setText(out+ " $");

        String tot = Integer.toString(sum_incomes-sum_outcomes);
        totalTextView.setText(tot + " $");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planning);
        String total = "00000";
        totalText = findViewById(R.id.thirdUserAccount);
        totalText.setText(total);
    }
}