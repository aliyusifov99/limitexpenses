package com.aliyusifov.limitexpenses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView currentAmountTextView;
    EditText editTextAmountExtract;
    Button buttonSubtract;
    Button buttonReset;
    Button buttonEditGoal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        currentAmountTextView = findViewById(R.id.amountTextView);
        editTextAmountExtract  = findViewById(R.id.editAmountExtract);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonReset = findViewById(R.id.buttonReset);
        buttonEditGoal = findViewById(R.id.buttonEditTarget);
    }

    public void editGoal(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}