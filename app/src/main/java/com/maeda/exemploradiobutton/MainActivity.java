package com.maeda.exemploradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup grupoDeOpcoes;
    private RadioButton radioOpcao;
    private TextView textoOpcaoEscolhida;
    private Button botaoMostrarOpcao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grupoDeOpcoes = findViewById(R.id.rdg_grupo_de_opcoes);
        textoOpcaoEscolhida = findViewById(R.id.txv_opcao_escolhida);
        botaoMostrarOpcao = findViewById(R.id.btn_mostrar_opcao);

        botaoMostrarOpcao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int opcao = grupoDeOpcoes.getCheckedRadioButtonId();
                radioOpcao = findViewById(opcao);
                textoOpcaoEscolhida.setText("Opção escolhida: " + radioOpcao.getText());
            }
        });

    }
}
