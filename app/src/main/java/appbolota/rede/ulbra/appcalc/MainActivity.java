package appbolota.rede.ulbra.appcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtValor1, edtValor2;
    Button btnSomar, btnSubtracao, btnMultiplicar, btnDividir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtValor1 = findViewById(R.id.edtV1);
        edtValor2 = findViewById(R.id.edt2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtracao = findViewById(R.id.btnSub);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);


        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, soma;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                soma = valor1 + valor2;
                Toast.makeText(MainActivity.this, "soma: "+soma, Toast.LENGTH_LONG).show();

            }
        });

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, sub;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                sub = valor1 - valor2;
                Toast.makeText(MainActivity.this, "Subtração: "+sub, Toast.LENGTH_LONG).show();
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, multi;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                multi = valor1 * valor2;
                Toast.makeText(MainActivity.this, "Multiplicação: "+multi, Toast.LENGTH_LONG).show();
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, div;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                div = valor1 / valor2;
                if(valor2 == 0){
                    Toast.makeText(MainActivity.this, "SEU IDIOTA!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "Divisão: "+div, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}