package com.example.travels;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       sendMessage(view);
    }
    public void sendMessage(View view) {
        EditText message = (EditText)findViewById(R.id.message);
    Intent intent = new Intent(this, DisplayMessageActivity.class);
    intent.putExtra("MESSAGE", message.getText().toString());
        startActivity(intent);
        message.setText("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.men,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //responding to menu items selected
        switch(item.getItemId()){
            case R.id.id1:
                startActivity(new Intent(this,activity1.class));
                return true;
            case R.id.id2:
                startActivity(new Intent(this,activity2.class));
                return true;
            default:
                return true;

        }

    }
}
