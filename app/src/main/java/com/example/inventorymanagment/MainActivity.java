package com.example.inventorymanagment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText firstNumEditText, secondNumEditText;

    float resultNum;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addKnapp = (Button) findViewById(R.id.plussKnapp); //Her lager du en referanse til addKnapp. Leter etter en ID som heter addKnapp. Den blir castet som en button for å store den som en reference
        Button minusKnapp = (Button) findViewById(R.id.minusKnapp);
        Button dividerKnapp = (Button) findViewById(R.id.dividerKnapp);

        addKnapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //Denne lager en onClick event. Når du trykker noe skjer noe

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTxtView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString()); // Parse from String to int
                int result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });
        minusKnapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //Denne lager en onClick event. Når du trykker noe skjer noe

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTxtView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString()); // Parse from String to int
                int result = num1 - num2;
                resultTextView.setText(result + "");

            }
        });
        dividerKnapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //Denne lager en onClick event. Når du trykker noe skjer noe

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTxtView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString()); // Parse from String to int
                float result = num1 / num2;
                resultTextView.setText(result + "");
            }
        });
    }
}
