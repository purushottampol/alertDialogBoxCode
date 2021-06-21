package com.devpoler.dialogusingswitch;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//let us create a textview button, we can also create a button directly, if we add a button instead of textview in xml, and replace TextView by Button here
    TextView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//connect java file with xml file

        button = findViewById(R.id.openB);
//set action that will take place when the user clicks the text view
        button.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("This is AITM");
            String[] events = {"Aarambh","NSS", "Vencer", "MoodI", "Tomorrowland"};
            builder.setItems(events, (dialog, which) -> {
                switch (which) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Hello aarambhors", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Hello NSS coordinators", Toast.LENGTH_SHORT).show();
                    break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Hello Vencer coordinators", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Hello MoodI coordinators", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "Hello Tomorrowland coordinators", Toast.LENGTH_SHORT).show();
                        break;

                }
            });

AlertDialog dialog = builder.create();
dialog.show();
        });

    }
}
