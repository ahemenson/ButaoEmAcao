package com.example.ahemenson.butaoemacao;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonNome = (Button) findViewById(R.id.buttonNome);
        Button buttonCor = (Button) findViewById(R.id.buttonCor);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        buttonNome.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().equals("Eminho")){
                    textView.setText("Ahemenson");
                }
                else{
                    textView.setText("Eminho");
                }

            }
        });


        buttonCor.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                relativeLayout.setBackgroundColor(Color.parseColor("#C51162"));
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
