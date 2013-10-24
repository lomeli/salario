package com.example.salariomin;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
public class MainActivity extends Activity implements OnItemSelectedListener{
    /** Called when the activity is first created. */
    EditText num1;
	Button button01;
	TextView tv1;
	
	TextView tv1b;
	TextView tv2b;
	TextView tv3b;
	TextView tv4b;
	
	ImageView iv1;
	Spinner spinOps;
	
	String[] ops={"Lugar","Mexico Area A 64.76","Mexico Area B 61.38", "Nueva York", "Tu Salario"};
	//String[] ops={"Choose operation","+","-","*","/"};
	String opselected;
	double a, c, d, e, f, g;
    private OnClickListener myClickListener = new OnClickListener()
    {
    	public void onClick(View v) {
    		a=Double.parseDouble(num1.getText().toString()); 
    		//b=Double.parseDouble(num2.getText().toString()); 
    		//if (opselected=="+"){c=a+b; tv1.setText(Double.toString(c));}
    		
    		
    		if (opselected=="Mexico Area A 64.76"){c=a/64.76; tv1.setText(Double.toString(c));}
    		//else if (opselected=="Mexico Area B 61.38"){c=a/61.38; tv1.setText(Double.toString(c));}
    		
    		else if (opselected=="Mexico Area B 61.38"){
    			c=a/61.38; tv1.setText(String.format("%.2f", c));
    			d=a*2; tv1b.setText(String.format("%.2f", d));
    			e=a*3; tv2b.setText(String.format("%.2f", e));
    			f=a*4; tv3b.setText(String.format("%.2f", f));
    			g=a*5; tv4b.setText(String.format("%.2f", g));
    			}  
    		
    		//else if (opselected=="Mexico Area B 61.38"){c=a/61.38; tv1.setText( String.format( "Value of a: %.2f", a ) );}
    		
    		
    		
    		else if (opselected=="Nueva York"){c=a*2; tv3b.setText(Double.toString(c));}
    		else if (opselected=="Tu Salario"){c=a*3; tv4b.setText(Double.toString(c));}
    		
    		// con decimanles
    		//Text.setText( String.format( "Value of a: %.2f", a ) );
    		// You can use a DecimalFormat, or String.format("%.2f", a);
    		
    	// original	
    	//	if (opselected=="+"){c=a+b; tv1.setText(Double.toString(c));}
    	//	else if (opselected=="-"){c=a-b; tv1.setText(Double.toString(c));}
    	//	else if (opselected=="*"){c=a*b; tv1.setText(Double.toString(c));}
    	//	else if (opselected=="/"){c=a/b; tv1.setText(Double.toString(c));}
    	//	else {tv1.setText("Please select the operation");}
    		
    		
    		
    		
    		
    		
    		
    		
    		else {tv1.setText("Please select the operation");}
    		//tv1 = (TextView)findViewById(R.id.TextView01);
    		
    		
    	}
    };
        @Override
        public void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main_dos);
            
           tv1 = (TextView)findViewById(R.id.TextView01);
           
           tv1b = (TextView)findViewById(R.id.textView1b);
           tv2b = (TextView)findViewById(R.id.textView2b);
           tv3b = (TextView)findViewById(R.id.textView3b);
           tv4b = (TextView)findViewById(R.id.textView4b);
           

           
           
           
           
           
           //iv1= (ImageView)findViewById(R.id.);//try imageview
           
           button01 = (Button)findViewById(R.id.Button01);
           button01.setText("Cuantos Dias Serian?");
           button01.setOnClickListener(myClickListener);
           
           num1 = (EditText)findViewById(R.id.EditText01);
           num1.setText("");
        //   num2 = (EditText)findViewById(R.id.EditText02);
        //   num2.setText("");
           
           //list of operations
           spinOps = (Spinner)findViewById(R.id.Spinner01);
           ArrayAdapter<String> adapter = new ArrayAdapter<String>(
             this, android.R.layout.simple_spinner_item, ops);
           adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
           spinOps.setAdapter(adapter);
           spinOps.setOnItemSelectedListener(this);
           
        }   
        public void onItemSelected (AdapterView<?> p,View v,int position,long id) {
        	opselected=ops[position];
        	//tv1.setText("Elegiste " + opselected);
        }
        public void onNothingSelected(AdapterView<?> p) { 
        	tv1.setText("Please select ops"); 
        }
}
