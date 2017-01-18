package com.example.android.assignment_4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewRobot;
    private Button buttonToggleVisibility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewRobot = (TextView) findViewById(R.id.textViewRobot);
        buttonToggleVisibility = (Button) findViewById(R.id.buttonToggleVisibility);
        buttonToggleVisibility.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (textViewRobot.getVisibility() == View.VISIBLE) {
            textViewRobot.setVisibility(View.INVISIBLE);
            buttonToggleVisibility.setText(getResources().getString(R.string.show));
        } else {
            textViewRobot.setVisibility(View.VISIBLE);
            buttonToggleVisibility.setText(getResources().getString(R.string.hide));
        }
    }
}
