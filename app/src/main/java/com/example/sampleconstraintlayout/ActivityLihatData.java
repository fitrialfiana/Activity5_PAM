package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    //Deklarasi variabel dengan jeis data Textview
    TextView tvnama, tvnomor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");


        switch (nama) {
            case "Inayah":
                tvnama.setText(nama);
                tvnomor.setText("081222333444");
                break;

            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("08133224455");
                break;

            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("08122453344");
                break;

            case "Fikri":
                tvnama.setText("M Fikri");
                tvnomor.setText("08122453344");
                break;

            case "Maul":
                tvnama.setText("Maul M");
                tvnomor.setText("08126633344");
                break;

            case "Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("08122555344");
                break;

            case "Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("08125555634");
                break;


            case "Gita":
                tvnama.setText("Gita S");
                tvnomor.setText("08199233344");
                break;


            case "Lutfi":
                tvnama.setText("Lutfi M");
                tvnomor.setText("08197833344");
                break;

            case "Vian":
                tvnama.setText("Vian M");
                tvnomor.setText("08122969344");
                break;

        }
    }
}