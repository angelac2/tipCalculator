package com.example.tipcalculator;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void calculateTips(View view) {
    	//find out which button was clicked
    	int percentage = 0;
    	int buttonId = view.getId();
    	
    	switch(buttonId) {
    	case R.id.button1:
    		percentage = 10;
    		break;
    	case R.id.button2:
    		percentage = 15;
    		break;
    	case R.id.button3:
    		percentage = 20;
    		break;
    	default: 
    		percentage = 0;
    		break;
    		
    	}
 
    	
    	EditText etInput = (EditText)findViewById(R.id.etInput);
    	Float amount = Float.valueOf(etInput.getText().toString());
    	
    	TextView tipAmount = (TextView)findViewById(R.id.tipResult);
    	tipAmount.setText(Double.toString(amount * percentage / 100.0));
    }
    
}
