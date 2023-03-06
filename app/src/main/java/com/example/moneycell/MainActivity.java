package com.example.moneycell;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void goToSecondScreen(View view){
        Intent intent = new Intent(getApplicationContext(),SecondScreen.class);
        EditText name = findViewById(R.id.personName);
        EditText account = findViewById(R.id.personAccount);

        String userName = name.getText().toString();
        intent.putExtra("userName",userName);

        String userAccount = account.getText().toString();
        intent.putExtra("userAccount",userAccount);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}