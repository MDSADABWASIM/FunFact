package com.example.pc.funfact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class factActivity extends AppCompatActivity {


    public TextView facts;
    public Button showFactButton;
    public RelativeLayout relativeLayout;
    public FactBook factBook = new FactBook();
    public Colorwheel colorwheel = new Colorwheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact);


        facts = (TextView) findViewById(R.id.text2);
        showFactButton = (Button) findViewById(R.id.button);


        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout);
        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a variable to get the fact.
                String factn=factBook.getfact();
                //create a variable to get the color.
                int color = colorwheel.getcolor();
                facts.setText( factn);
                //getcolor method form the colorwheel class
                relativeLayout.setBackgroundColor(colorwheel.getcolor());
                showFactButton.setTextColor(color);
            }
        });

    }
}