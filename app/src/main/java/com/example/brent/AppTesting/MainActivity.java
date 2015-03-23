package com.example.brent.AppTesting;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    TextView mainTextView;
    Button updateButton;
    private int flag = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTextView = (TextView) findViewById(R.id.greeting);
        mainTextView.setText("HARD CODED JAVA STRING");

        updateButton = (Button) findViewById(R.id.updateButton);
        updateButton.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        this.flag *= -1;
        if (this.flag == 1) {
            mainTextView.setText("I like pie");
            updateButton.setText("CAKE!!!!!!!!!");
        }
        else {
            mainTextView.setText("I like cake");
            updateButton.setText("pie.");
        }
    }
}
