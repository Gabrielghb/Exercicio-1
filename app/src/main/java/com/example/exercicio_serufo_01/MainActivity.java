package com.example.exercicio_serufo_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText texotIdade;
    private Button botao;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


    public void btnonClick(View w) {

        texotIdade = (EditText) findViewById(R.id.textoIdade);
        botao = (Button) findViewById(R.id.botao);
        resultado = (TextView) findViewById(R.id.Resultado);

        int Idade = Integer.parseInt(texotIdade.getText().toString());

        int soma = Idade;
        if(soma < 13) {
            resultado.setText("Criança");
        }

        else if(soma < 13) {
            resultado.setText("Adolescente");
        }

        else if(soma < 13) {
            resultado.setText("Adulto");
        }

        else if(soma < 13) {
            resultado.setText("Acho que nem era pra você estar vivo...");
        }

    }
}
