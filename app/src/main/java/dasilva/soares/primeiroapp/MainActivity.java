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

        //renderiza os elementos na tela
        setContentView(R.layout.activity_main);

        //conecta o id "btnEnviar" ao botão da interface do usuário
        Button btnEnviar = findViewById(R.id.btnEnviar);

        //liga o "listener" do botão "btnEnviar" à função OnClick
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            //função onClick
            public void onClick(View v) {

                //recebe o texto digitado pelo usuário no campo "etDigiteAqui'
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

                //converte o texto digitado pelo usuário em String
                String textoDigitado = etDigiteAqui.getText().toString();

                //cria uma intenção ligando as duas telas
                Intent i = new Intent(MainActivity.this, NextActivity.class);

                //dita que o texto exibido na próxima tela seja o mesmo do recebido pelo usuário
                i.putExtra("texto", textoDigitado);

//              inicia a próxima tela a partir da intenção criada
                startActivity(i);

            }
        });
    }
}
