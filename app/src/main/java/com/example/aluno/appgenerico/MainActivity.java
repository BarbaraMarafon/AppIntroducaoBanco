package com.example.aluno.appgenerico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextSenha;
    private Button btnLogin;
    private Button btnCadastrar;
    private Button btnSobre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsuario = (EditText) findViewById(R.id.editTextUsuario);
        editTextSenha = (EditText) findViewById(R.id.editTextSenha);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnSobre = (Button) findViewById(R.id.btnSobre);


        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CadastroActivity.class));
            }
        });

        btnSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SobreActivity.class));
            }
        });

    }
}
