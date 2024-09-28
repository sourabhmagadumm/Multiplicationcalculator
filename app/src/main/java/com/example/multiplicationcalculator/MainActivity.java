package com.example.multiplicationcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText n1, n2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        text = findViewById(R.id.text);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        button = findViewById(R.id.button);  // Initialize button

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get text from EditText and check for empty input
                String num1 = n1.getText().toString();
                String num2 = n2.getText().toString();

                if (!num1.isEmpty() && !num2.isEmpty()) {
                    // Multiply the two numbers
                    int result = Integer.parseInt(num1) * Integer.parseInt(num2);

                    // Set the result to the TextView
                    text.setText(String.format(Locale.getDefault(), "Product is %d", result));
                } else {
                    text.setText("Please enter both numbers.");
                }
            }
        });
    }
}