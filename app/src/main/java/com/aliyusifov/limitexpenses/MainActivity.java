package com.aliyusifov.limitexpenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView currentAmountTextView;
    EditText editTextAmountExtract;
    Button buttonSubtract;
    Button buttonReset;
    Button buttonEditGoal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentAmountTextView = findViewById(R.id.amountTextView);
        editTextAmountExtract  = findViewById(R.id.editAmountExtract);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonReset = findViewById(R.id.buttonReset);
        buttonEditGoal = findViewById(R.id.buttonEditTarget);
    }


}