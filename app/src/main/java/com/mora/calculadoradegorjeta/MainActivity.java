package com.mora.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

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
        textTotal  = findViewById(R.id.editValor);
         seekBarGorjeta = findViewById(R.id.seekGorjeta);

         //adicionar listener seekBar
         seekBarGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
             @Override
             public void onProgressChanged(SeekBar seekBar, int i, boolean b) {



             }

             @Override
             public void onStartTrackingTouch(SeekBar seekBar) {

             }

             @Override
             public void onStopTrackingTouch(SeekBar seekBar) {

             }
         });

    }
}