package com.example.sampleconstraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.view.Menu;
import android.view.MenuItem;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edEmail, edPassword;

    //deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //method untuk menampilkan menu.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Membuat kondisi jika yang dipilih adalah id mnDaftar
        if (item.getItemId() == R.id.mnDaftar)
        {
            //Method untuk memanggil activity "DaftarActivity"
            Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnLogin dengan component pada layout
        btnLogin = findViewById(R.id.btSignin);
        //Menghubungkan variabel edemail dengan component pada layout
        edEmail = findViewById(R.id.edEmail);
        //menghubungkan variabel edpassword dengan component pada layout
        edPassword = findViewById(R.id.edPassword);



        btnLogin.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Menyimpan input user di edittext email kedalam variabel nama
                nama = edEmail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = edPassword.getText().toString();

                //Mengeset email yang benar
                String email = "admin@mail.com";

                //Mengeset password yang benar
                String pass = "123";

                //Mengecek apakah edittext email dan password terdapat isi atau tidak
                if (nama.isEmpty() && password.isEmpty()) {
                    //Membuat variabel toast dan menampilkan pesan "edittext tidak boleh kosong"
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password Wajib diisi!!!",
                            Toast.LENGTH_LONG);
                    //Menampilkan toast
                    t.show();
                } else {
                    //Mengecek apakah isi dari email dan password sudah sama
                    // dengan email dan password yang sudah di set
                    if (nama.equals(email) && password.equals(pass)){
                        //Membuat variabel toast dan menampilkan pesan "login sukses"
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses",
                                Toast.LENGTH_LONG);
                        //Menampilkan toast
                        t.show();

                        //Membuat objek bundle
                        Bundle b = new Bundle();

                        //Memasukkan value dari variabel nama dengan kunci "a"
                        //dan dimasukkan ke dalam bundle
                        b.putString("a", nama.trim());

                        //Memasukkan value dari variabel nama dengan kunci "b"
                        //dan dimasukkan ke dalam bundle
                        b.putString("b", pass.trim());

                        //Membuat objek intent berpindah activity dari mainactivity ke ActivityHasil
                        Intent i = new Intent(getApplicationContext(), ActivityHasil.class);

                        //Memasukkan bundle kedalam intent untuk dikirimkan ke ActivityHasil
                        i.putExtras(b);

                        //berpindah ke ActivityHasil
                        startActivity(i);
                    }
                    else {
                        //Membuat variabel toast dan membuat toast
                        //dan menampilkan pesan "login gagal"

                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login gagal",
                                Toast.LENGTH_LONG);

                        //Menampilkan toast
                        t.show();
                    }

                }
            }
        });
    }
}