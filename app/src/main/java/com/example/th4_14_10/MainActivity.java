package com.example.th4_14_10;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
//import android.support.v4.app.Fragment;


public class MainActivity extends AppCompatActivity implements sendData {
    FrameLayout frame_above;
    FrameLayout frame_b;
    Button btn;
    fgm_above fgm_above;
    Button btnReplace,btnRemove;
    fgm_below frame_below;
    Frag1 frag1;

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frame_above = findViewById(R.id.frg_Above);
        frame_below =(fgm_below) getSupportFragmentManager().findFragmentById(R.id.frg_Below);
        btnReplace = (Button) findViewById(R.id.replace);
        btnRemove = findViewById(R.id.btnRemove);
        btn = (Button) findViewById(R.id.button);

        tv = (TextView) findViewById(R.id.textView_Gia);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        frag1 = new Frag1();
        fgm_above = new fgm_above();
        //fgm_below fgmBelow =  new fgm_below();
        getSupportFragmentManager().beginTransaction().add(R.id.frg_Above,fgm_above,"above").commit();//gan tag de tim
        btnReplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frg_Above,frag1).commit();
            }
        });
        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().remove(frag1).commit();
            }
        });
    }

    @Override
    public void send(String a) {
        tv.setText(a);
        frame_below.UpdateData(a);
    }
}