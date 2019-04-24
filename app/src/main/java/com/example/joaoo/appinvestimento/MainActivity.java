package com.example.joaoo.appinvestimento;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView login;
    private  TextView senha;
    private Button cadastro;
    private Button fazer_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.loginid);
        senha = findViewById(R.id.senhaid);
        cadastro = findViewById(R.id.cadastroid);
        fazer_login = findViewById(R.id.fazer_login_id);

        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, fazer_cadastro.class));//inicia o activity fazer_cadastro
            }
        });

        fazer_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //login
            }
        });
    }
}
