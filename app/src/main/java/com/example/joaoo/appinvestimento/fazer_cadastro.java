package com.example.joaoo.appinvestimento;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class fazer_cadastro extends Activity {
    private TextView cad_nome;
    private TextView cad_login;
    private TextView cad_nome_empresa;
    private TextView cad_senha;
    private TextView cad_conf_senha;
    private Switch colab;
    private Switch invest;
    private Switch empreed;
    private Button fazer_cad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fazer_cadastro);
        cad_nome = findViewById(R.id.cad_nome_id);
        cad_login = findViewById(R.id.cad_login_id);
        cad_nome_empresa = findViewById(R.id.cad_empresa_id);
        cad_senha = findViewById(R.id.cad_senha_id);
        cad_conf_senha = findViewById(R.id.conf_senha_id);
        colab = findViewById(R.id.colab_id);
        invest = findViewById(R.id.invest_id);
        empreed = findViewById(R.id.empreed_id);
        fazer_cad = findViewById(R.id.fazer_cad_id);
        fazer_cad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //transição de activity
                startActivity(new Intent(fazer_cadastro.this,Cadastro.class));
            }
        });
    }
}
