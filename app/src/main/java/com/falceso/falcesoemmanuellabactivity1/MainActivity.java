package com.falceso.falcesoemmanuellabactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_portal, btn_greetings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_portal= findViewById(R.id.btn_portal);
        btn_portal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPortal();
            }
        });

        btn_greetings = findViewById(R.id.btn_greetings);
        btn_greetings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                greetings();
            }
        });

    }

    public void openPortal(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);

    }

    public void greetings(){
        Intent i = new Intent(this, CottonPicker.class);
        startService(i);
    }
}
