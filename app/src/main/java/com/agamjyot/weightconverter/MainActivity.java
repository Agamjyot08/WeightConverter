package com.agamjyot.weightconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertWeight(View view) {
        EditText weightValue = findViewById(R.id.weightValue);
        TextView convertedWeight = findViewById(R.id.convertedWeight);

        if((weightValue.getText() != null) && (!weightValue.getText().toString().isEmpty())) {
            String s = weightValue.getText().toString();

            int kg = Integer.parseInt(s);
            double pound = 2.205 * kg;

            convertedWeight.setText("Weight in Pounds is "+pound);

            Toast.makeText(this, "Converted!", Toast.LENGTH_SHORT).show();

        } else {
            convertedWeight.setText("No value provided");
            Toast.makeText(this, "Enter a value!", Toast.LENGTH_SHORT).show();
        }

    }
}