package com.example.tugas_pwdm_kel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText panjang_input_text, lebar_input_text;
    private Button hitung_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panjang_input_text = findViewById(R.id.panjang_input_text);
        lebar_input_text = findViewById(R.id.lebar_input_text);
        hitung_button = findViewById(R.id.hitung_button);

        hitung_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateAndNavigate();
            }
        });
    }

    private void calculateAndNavigate() {
        // Get Panjang & Lebar dari EditText line 11
        double panjang = Double.parseDouble(panjang_input_text.getText().toString());
        double lebar = Double.parseDouble(lebar_input_text.getText().toString());

        // Hitung Luas & Keliling
        double luas = hitungLuas(panjang, lebar);
        double keliling = hitungKeliling(panjang, lebar);

        // Ngebuat Intent untuk pindah ke ResultActivity
         Intent intent = new Intent(MainActivity.this, ResultActivity.class);

        // Passing value yang udah dihitung kedalam ResultActivity.java
         intent.putExtra("LUAS", luas);
         intent.putExtra("KELILING", keliling);

        // Start ResultActivity nya
         startActivity(intent);
    }


    private double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    private double hitungKeliling(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }
}