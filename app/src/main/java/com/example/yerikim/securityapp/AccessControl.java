package com.example.yerikim.securityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class AccessControl extends AppCompatActivity
{

    String accessCode = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_control);

        //1st Access Code Button

        Button button1 = (Button) findViewById(R.id.btn1); // Instantiates button object and casts using XML button ID
        button1.setOnClickListener(new View.OnClickListener() // Button click method

        {
            public void onClick(View view) //Adds code "1" to string when pressed
            {
                accessCode += "1";
            }
        });


        //2nd Access Code Button
        Button button2 = (Button) findViewById(R.id.btn2); // Instantiates button object and casts using XML button ID
        button2.setOnClickListener(new View.OnClickListener() // Button click method

        {
            public void onClick(View view) //Adds code "2" to string when pressed
            {
                accessCode += "2";
            }
        });


        //3rd Access Code Button
        Button button3 = (Button) findViewById(R.id.btn3); // Instantiates button object and casts using XML button ID
        button3.setOnClickListener(new View.OnClickListener() // Button click method

        {
            public void onClick(View view) //Adds code "3" to string when pressed
            {
                accessCode += "3";
            }
        });


        //4th Access Code Button
        Button button4 = (Button) findViewById(R.id.btn4); // Instantiates button object and casts using XML button ID
        button4.setOnClickListener(new View.OnClickListener() // Button click method

        {
            public void onClick(View view) //Adds code "4" to string when pressed
            {
                accessCode += "4";
            }
        });


        //Submit Code Button
        accessCode = "";
        Button submitCodeButton = (Button) findViewById(R.id.submitBtn);
        submitCodeButton.setOnClickListener(new View.OnClickListener() //Presses submit button
        {
            public void onClick(View view) //Tests whether access code is correct
            {
                if (accessCode.equals("1234")) //If access code is correct, opens app
                {
                    Intent openApp = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(openApp);
                    MainActivity.ifIncorrectCode();
                    accessCode = "";
                }
                else //If access code is incorrect
                {
                    Intent newPage = new Intent(AccessControl.this, MainActivity.class);
                    startActivity(newPage);
                    accessCode = "";
                }
            }
        });

    }

}
