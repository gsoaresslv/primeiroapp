package dasilva.soares.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //renderiza os elementos na tela a partir do arquivo de layout
        setContentView(R.layout.activity_main);

        //conecta o id "btnEnviar" ao botao da interface do usuario
        Button btnEnviar = findViewById(R.id.btnEnviar);

        //liga o "listener" do botao "btnEnviar" a funcao OnClick
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            //funcao onClick
            public void onClick(View v) {

                //recebe o texto digitado pelo usuario no campo "etDigiteAqui'
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

                //converte o texto digitado pelo usuario em String
                String textoDigitado = etDigiteAqui.getText().toString();

                //cria uma intencao de navegar para a proxima tela
                Intent i = new Intent(MainActivity.this, NextActivity.class);

                //envia o texto dentro da intencao para enviar para a proxima tela
                i.putExtra("texto", textoDigitado);

                //inicia a próxima tela a partir da intencao criada
                startActivity(i);

            }
        });
    }
}
