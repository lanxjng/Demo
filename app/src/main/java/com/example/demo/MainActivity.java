package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //khai báo thành phần
    private final String TAG = getClass().getSimpleName();
    private EditText edtUser, edtPass;
    private Button btnSubmit, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        // ánh xạ
        anhxa();
        // bắt sự kiện
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //dùng intent để chuyển activity
                Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent1);
            }
        });
    }

    private void anhxa() {
        edtUser = findViewById(R.id.user);
        edtPass = findViewById(R.id.password);
        btnSubmit = findViewById(R.id.btnSubmt);
        btnCancel = findViewById(R.id.btnCancel);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }
}