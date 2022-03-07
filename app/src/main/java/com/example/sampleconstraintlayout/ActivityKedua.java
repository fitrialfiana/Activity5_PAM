package com.example.sampleconstraintlayout;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    //Mendeklarasikan variabel dengan tipe data Textview
    TextView txEmail, txPassword;

    @Override
    protected void onCreate (Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_kedua);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        txEmail = findViewById(R.id.tvEmail);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        txPassword = findViewById(R.id.tvPassword);

        //mendeklarasikan variabel bundle yang akan digunakan untuk mengambil
        // pesan yang dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString("a");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam txEmail
        txEmail.setText (email);

        //menampilkan value dart variabel pass kedalam txPassword
        txPassword.setText (pass);

    }
}
