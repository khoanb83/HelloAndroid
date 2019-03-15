package com.example.bakhoa.helloandroid;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import  android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText text1;
private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        addListenerOnButton();
    }
    public  void addListenerOnButton()
    {
        text1=(EditText)findViewById(R.id.txtpass);
        button1 = (Button) findViewById(R.id.btn1);
        button1.setOnClickListener( new View.OnClickListener(){
            public  void onClick(View v)
            {
//            Toast.makeText(MainActivity.this,text1.getText(),Toast.LENGTH_LONG).show();
                AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                a_builder.setMessage("Dong uwng dung").setCancelable(false)
                        .setPositiveButton("Dung", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = a_builder.create();
                alert.setTitle("abcada");
                alert.show();


            }
        });
    }
//public void onBtnclick(View v)
//{
//    EditText e1= (EditText)findViewById(R.id.txtso1);
//    EditText e2= (EditText)findViewById(R.id.txtso2);
//    TextView t1= (TextView)findViewById(R.id.txtmessage);
//    int num1 = Integer.parseInt(e1.getText().toString());
//    int num2= Integer.parseInt(e2.getText().toString());
//    int sum = num1+num2;
//    t1.setText(Integer.toString(sum));
//}
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
