package com.example.travels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class activity2 extends AppCompatActivity {
    TextView textView;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        textView = findViewById(R.id.txt);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text="";
                try{

                    InputStream in=getAssets().open("prog.c");
                    int size=in.available();
                    byte[] buffer=new byte[size];
                    in.read(buffer);
                    in.close();
                    text=new String(buffer);
                   /* AssetManager assetManager = getAssets();
                    String[] files = assetManager.list("");
                    InputStream input = assetManager.open("benon.txt");
*/

                }catch(IOException ex){
                    ex.printStackTrace();

                }
                textView.setText(text);
            }
        });
    }
}
