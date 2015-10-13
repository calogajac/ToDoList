package com.example.amandacarroll.ourbuttons;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Buttons extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_buttons, menu);
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

    public void OnButtonClickCaleb(View view){
        TextView textCaleb = (TextView)findViewById(R.id.textView);
        textCaleb.setText("Caleb");
    }

    public void OnButtonClickAmanda(View view){
        TextView textAmanda = (TextView)findViewById(R.id.textView);
        textAmanda.setText("Amanda");
    }

    public void OnButtonClickChristian(View view){
        TextView textChristian = (TextView)findViewById(R.id.textView);
        textChristian.setText("Christian");
    }

    public void OnButtonClickJosh(View view){
        TextView textJosh = (TextView)findViewById(R.id.textView);
        textJosh.setText("Josh");
    }
}
