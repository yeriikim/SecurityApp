package com.example.yerikim.securityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity
{
    static boolean isCodeCorrect = false; //boolean variable to test whether code is correct or not


    static TextView message; //App display message

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button unlockButton = (Button) findViewById(R.id.unlockBtn); //Instantiates button object and casts using XML button ID
        unlockButton.setOnClickListener(new View.OnClickListener()  //Button click method
        {
            public void onClick(View view)
            {
                Intent openMainPage = new Intent(MainActivity.this, AccessControl.class); //Intent object to open main screen
                startActivity(openMainPage);
            }

        });

        message = (TextView) findViewById(R.id.messageTxt); //Message that shows that code is correct and app is opened
        if(isCodeCorrect)
        {
            message.setText("The App is Unlocked.");
            isCodeCorrect = false;
        }
    }


    static public void ifIncorrectCode ()
    {
        isCodeCorrect = true;
    }

}
