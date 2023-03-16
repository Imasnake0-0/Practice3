package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonZ, buttonRas;
    private Spinner spinner;
    private static final String TAG = "Practice2";
    private SecondFragment secondFragment = new SecondFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setNewFragment(secondFragment);
        //back = findViewById(R.id.background);
        buttonZ = findViewById(R.id.zapic);
        buttonRas = findViewById(R.id.raspisanie);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.FitnessClubs, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        String item = (String)spinner.getAccessibilityClassName();
        buttonRas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Недоступно в этой версии";
                Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
    public void onClickZ(View view)
    {
        FirstFragment firstFragment = new FirstFragment();
        setNewFragment(firstFragment);
        //Intent intent = new Intent(this, SecondActivity.class);
        //intent.putExtra("Club", (String) spinner.getSelectedItem());
        //startActivity(intent);
    }

    private void setNewFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.frameLayout, fragment);
        ft.commit();
    }


}