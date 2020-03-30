package com.example.formpendaftran;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText edName, edAlamat, edTlp;
    Button btnDaftar;
    String nama,alamat,telepon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edName = findViewById(R.id.name2);
        edAlamat = findViewById(R.id.alamat2);
        edTlp = findViewById(R.id.tlp2);
        btnDaftar = findViewById(R.id.btn);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edName.getText().toString();
                alamat = edAlamat.getText().toString();
                telepon = edTlp.getText().toString();

                if (nama.isEmpty() || alamat.isEmpty()|| telepon.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Data Harus Terisi", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Pendaftaran Berhasil", Toast.LENGTH_LONG).show();
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.menu1) {
            startActivity(new Intent(this, menu1.class));
        } else if (item.getItemId()== R.id.menu2){
            startActivity(new Intent(this, menu2.class));
        }else  if (item.getItemId()== R.id.menu3){
            startActivity(new Intent(this, menu3.class));
        }
        return true;
    }
}
