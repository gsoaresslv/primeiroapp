package dasilva.soares.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //exibe os elementos na tela do usuário
        setContentView(R.layout.activity_next);

        //recebe a intenção da classe Main
        Intent i = getIntent();

        //cria a variável "texto" que recebe o texto digitado pelo usuário através da intent
        String texto = i.getStringExtra("texto");

        //liga o id "tvTexto" para o texto digitado pelo usuário
        TextView tvTexto = findViewById(R.id.tvTexto);

        //seta o texto exibido como o texto do usuário
        tvTexto.setText(texto);
    }
}