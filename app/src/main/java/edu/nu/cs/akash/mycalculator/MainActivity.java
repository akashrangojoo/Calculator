package edu.nu.cs.akash.mycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    // instance variables
    EditText num1ET,num2ET;
    TextView resultTV;
    Integer num1,num2,result;
    Float dnum1,dnum2,dresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1ET = (EditText) findViewById(R.id.num1EditText);
        num2ET = (EditText) findViewById(R.id.num2EditText);

        resultTV = (TextView)findViewById(R.id.resultTV);

        Button addButton = (Button) findViewById(R.id.addButton);
        Button subButton = (Button) findViewById(R.id.subButton);
        Button multButton = (Button) findViewById(R.id.multButton);
        Button divideButton = (Button) findViewById(R.id.divideButton);

        // Addition

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Checktoseeifdata exists
                if(num1ET.getText().toString().matches("") || num2ET.getText().toString().matches(""))
                {
                    Toast.makeText(v.getContext(),"Please Enter a valid Input..!!",Toast.LENGTH_LONG).show();
                    return;
                }
                // Get the Numbers

                num1 =Integer.parseInt(num1ET.getText().toString());
                num2 =Integer.parseInt(num2ET.getText().toString());
                result=num1+num2;
                //Display Result

                resultTV.setText(result.toString());
            }
        });

        // Subtraction

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Checktoseeifdata exists
                if(num1ET.getText().toString().matches("") || num2ET.getText().toString().matches(""))
                {
                    Toast.makeText(v.getContext(),"Please Enter a valid Input..!!",Toast.LENGTH_LONG).show();
                    return;
                }
                // Get the Numbers

                num1 =Integer.parseInt(num1ET.getText().toString());
                num2 =Integer.parseInt(num2ET.getText().toString());
                result=num1-num2;
                //Display Result

                resultTV.setText(result.toString());
            }
        });

        //Multiplication

        multButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Checktoseeifdata exists
                if(num1ET.getText().toString().matches("") || num2ET.getText().toString().matches(""))
                {
                    Toast.makeText(v.getContext(),"Please Enter a valid Input..!!",Toast.LENGTH_LONG).show();
                    return;
                }
                // Get the Numbers

                num1 =Integer.parseInt(num1ET.getText().toString());
                num2 =Integer.parseInt(num2ET.getText().toString());
                result=num1*num2;
                //Display Result

                resultTV.setText(result.toString());
            }
        });

        // Division

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Checktoseeifdata exists
                if(num1ET.getText().toString().matches("") || num2ET.getText().toString().matches(""))
                {
                    Toast.makeText(v.getContext(),"Please Enter a valid Input..!!",Toast.LENGTH_LONG).show();
                    return;
                }

                if(num2ET.getText().toString().matches("0"))
                {
                    Toast.makeText(v.getContext(),"Number 2 cannot be ZERO..!!",Toast.LENGTH_LONG).show();
                    return;
                }
                // Get the Numbers

                dnum1 =Float.parseFloat(num1ET.getText().toString());
                dnum2 =Float.parseFloat(num2ET.getText().toString());
                dresult=dnum1/dnum2;
                //Display Result

                resultTV.setText(dresult.toString());
            }
        });

        // Clear Screen

        Button clearButtton = (Button) findViewById(R.id.clearButton);
        clearButtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1ET.setText("");
                num2ET.setText("");
                resultTV.setText("");
            }
        });
    }
}
