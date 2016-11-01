package com.example.yvtc.wp110101;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("對話框測試");
        builder.setMessage("這是內容");

builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        Toast.makeText(MainActivity.this,"確定被按下",Toast.LENGTH_SHORT).show();
    }
});
       builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               Toast.makeText(MainActivity.this,"取消被按下",Toast.LENGTH_SHORT).show();
           }
       });
        builder.setNeutralButton("忽略", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"忽略被按下",Toast.LENGTH_SHORT).show();
            }
        });
       builder.show();

    }
    public void click2(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("對話框測試");
        builder.setMessage("這輸入金額");
        final EditText ed=new EditText(MainActivity.this);
         ed.setInputType(20);
        builder.setView(ed);
        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                TextView tv = (TextView)findViewById(R.id.textView);
                tv.setText(ed.getText().toString());
                Toast.makeText(MainActivity.this,"確定被按下",Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

}
