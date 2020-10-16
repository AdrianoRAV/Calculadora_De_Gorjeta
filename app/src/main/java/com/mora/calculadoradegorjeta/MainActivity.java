package com.mora.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editvalor;
    private TextView texPorcentagem;
    private TextView textGorjeta;
    private  TextView textTotal;
    private SeekBar seekBarGorjeta;

    private double porcentagem = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editvalor  = findViewById(R.id.editValor);
        texPorcentagem  = findViewById(R.id.textPorcentagem);
        textGorjeta  = findViewById(R.id.textGorjeta);
        textTotal  = findViewById(R.id.textTotal);
         seekBarGorjeta = findViewById(R.id.seekBarGorjeta);

         //adicionar listener seekBar
         seekBarGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
             @Override
             public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                 porcentagem = progress;
                 texPorcentagem.setText(Math.round( porcentagem ) + " %");
                 calcular();
             }

             @Override
             public void onStartTrackingTouch(SeekBar seekBar) {

             }

             @Override
             public void onStopTrackingTouch(SeekBar seekBar) {

             }
         });

    }
    public void  calcular(){
        String valorRecuperado = editvalor.getText().toString();
        if (valorRecuperado == null || valorRecuperado.equals("")){
            Toast.makeText(
                    getApplicationContext(),
                    "Digite um valor",
                    Toast.LENGTH_LONG
            ).show();
        }else {
            // converter String para double
            double valorDigitado = Double.parseDouble( valorRecuperado );

            //calculo da gorjeta total
            double gojeta = valorDigitado * (porcentagem/100);
            double total = gojeta + valorDigitado;

            //exiber gorjeta e total
           // textGorjeta.setText("R$ " + Math.round(gojeta));
            textGorjeta.setText("R$ " + Math.round(gojeta)); // o Math.round deixa o valor inteiro
            textTotal.setText("R$ " + Math.round(total));
        }
    }
}