package com.maeda.exemploradiobutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // define objtetos relacionados às views da activity
    private RadioGroup grupoDeOpcoes;
    private RadioButton radioOpcao;
    private TextView textoOpcaoEscolhida;
    private Button botaoMostrarOpcao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instancia as views
        grupoDeOpcoes = findViewById(R.id.rdg_grupo_de_opcoes);
        textoOpcaoEscolhida = findViewById(R.id.txv_opcao_escolhida);
        botaoMostrarOpcao = findViewById(R.id.btn_mostrar_opcao);

        // listener para capturar o evento OnClick
        botaoMostrarOpcao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // obtém o ID do item selecionado
                int opcao = grupoDeOpcoes.getCheckedRadioButtonId();
                // obtém os dados do RadioButton selecionado
                radioOpcao = findViewById(opcao);
                // mostra o texto do RadioButton numa TextView
                textoOpcaoEscolhida.setText("Opção escolhida: " + radioOpcao.getText());
            }
        });

    }
}
