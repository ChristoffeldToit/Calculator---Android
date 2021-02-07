package com.example.basiccalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity
{
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal;
    double input1 = 0, input2 = 0;
    TextView edt1;
    Button btn0, btn1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub,
            buttonMul, buttonDivision, buttonEqual, buttonDel, buttonDot, Remainder;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDot = findViewById(R.id.buttonDot);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDivision = findViewById(R.id.buttondiv);
        Remainder = findViewById(R.id.Remainder);
        buttonDel = findViewById(R.id.buttonDel);
        buttonEqual = findViewById(R.id.buttoneql);

        edt1 = findViewById(R.id.display);

        //Display that user will see when selecting a button
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText() + "1");
            }
        });

        //Display that user will see when selecting a button
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText() + "2");
            }
        });

        //Display that user will see when selecting a button
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText() + "3");
            }
        });

        //Display that user will see when selecting a button
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText() + "4");
            }
        });

        //Display that user will see when selecting a button
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText() + "5");
            }
        });

        //Display that user will see when selecting a button
        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText() + "6");
            }
        });

        //Display that user will see when selecting a button
        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText() + "7");
            }
        });

        //Display that user will see when selecting a button
        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText() + "8");
            }
        });

        //Display that user will see when selecting a button
        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText() + "9");
            }
        });

        //Display that user will see when selecting a button
        btn0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edt1.setText(edt1.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (edt1.getText().length() != 0)
                {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Addition = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (edt1.getText().length() != 0)
                {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Subtract = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (edt1.getText().length() != 0)
                {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (edt1.getText().length() != 0)
                {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Division = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        Remainder.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (edt1.getText().length() != 0)
                {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    mRemainder = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (Addition || Subtract || Multiplication || Division || mRemainder)
                {
                    input2 = Float.parseFloat(edt1.getText() + "");
                }

                if (Addition)
                {
                    edt1.setText(input1 + input2 + "");
                    Addition = false;
                }

                if (Subtract)
                {
                    edt1.setText(input1 - input2 + "");
                    Subtract = false;
                }

                if (Multiplication)
                {
                    edt1.setText(input1 * input2 + "");
                    Multiplication = false;
                }

                if (Division)
                {
                    edt1.setText(input1 / input2 + "");
                    Division = false;
                }
                if (mRemainder)
                {
                    edt1.setText(input1 % input2 + "");
                    mRemainder = false;
                }
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edt1.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (decimal)
                {
                    //do nothing or you can show the error
                } 
                else 
                    {
                    edt1.setText(edt1.getText() + ".");
                    decimal = true;
                }

            }
        });
    }
}