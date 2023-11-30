package com.example.tugas_pwdm_kel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class ResultActivity extends AppCompatActivity{
    private TextView hasil_luas_label, hasil_luas, satuan_luas;
    private TextView hasil_keliling_label, hasil_keliling, satuan_keliling;
    private Button back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Begitu file ini dijalankan akan mengarahkan ke layout/activity_result.xml
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Ambil variabel di line 10 dari component layout/activity_result.xml
        hasil_luas_label = findViewById(R.id.hasil_luas_label);
        hasil_luas = findViewById(R.id.hasil_luas);
        satuan_luas = findViewById(R.id.satuan_luas);

        hasil_keliling_label = findViewById(R.id.hasil_keliling_label);
        hasil_keliling = findViewById(R.id.hasil_keliling);
        satuan_keliling = findViewById(R.id.satuan_keliling);

        back_button = findViewById(R.id.back_button);

        // Get values nya dari Intent yang dibuat di MainActivity.java
        Intent intent = getIntent();
        double luas = intent.getDoubleExtra("LUAS", 0.0);
        double keliling = intent.getDoubleExtra("KELILING", 0.0);

        // Nampilin values nya dalam TextViews @+id/hasil_luas & @+id/hasil_keliling
        hasil_luas_label.setText("Hasil Luas Persegi Panjang adalah: ");
        hasil_luas.setText(String.valueOf(luas));
        satuan_luas.setText("cm");
        hasil_keliling_label.setText("Hasil Keliling Persegi Panjang adalah: ");
        hasil_keliling.setText(String.valueOf(keliling));
        satuan_keliling.setText("cm");
    }
}
