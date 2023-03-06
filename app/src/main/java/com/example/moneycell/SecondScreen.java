package com.example.moneycell;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    TextView name;
    TextView account;
    public void goToPlanning(View view)
    {
        TextView totalTextView = findViewById(R.id.accountAmount);
        String total = totalTextView.getText().toString();


        Intent intent1 = new Intent(getApplicationContext(),PlanningActivity.class);
        intent1.putExtra("total",total);
        startActivity(intent1);
    }

    public void goToChat(View view)
    {
        Intent chat_intent = new Intent(getApplicationContext(),ChatActivity.class);
        startActivity(chat_intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        name = findViewById(R.id.userName);
        account = findViewById(R.id.accountAmount);

        Intent intent2 = getIntent();
        String userName = intent2.getStringExtra("userName");
        String userAccount = intent2.getStringExtra("userAccount");


        name.setText("Hi, "+ userName);
        account.setText(userAccount);

    }
}