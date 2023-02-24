package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private LinearLayout back;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        back = findViewById(R.id.linearLayout);
        bt = findViewById(R.id.PodZapic);

    }

    public void onClickPod(View view) {
        String text = "Вы успешно записаны в ";
        Toast toast = Toast.makeText(getApplicationContext(), text + getIntent().getExtras().get("Club"), Toast.LENGTH_LONG);
        toast.show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}