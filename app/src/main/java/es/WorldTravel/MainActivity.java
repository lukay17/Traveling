package es.WorldTravel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editTextPerson;
    private EditText editTextPais;
    private EditText editTextComen;
    private Button buttonEnviar;
    private TextView textviewResumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPerson = (EditText) findViewById(R.id.editTextPerson);
        editTextPais = (EditText) findViewById(R.id.editTextPais);
        editTextComen = (EditText) findViewById(R.id.editTextComen);
        buttonEnviar = (Button) findViewById(R.id.buttonEnviar);
        textviewResumen = (TextView) findViewById(R.id.textview_resumen);

        buttonEnviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if(view == buttonEnviar){
            String nombre = "Nombre: " + editTextPerson.getText().toString() ;
            String pais = "\nPais: " + editTextPais.getText().toString() ;
            String comen = "\nComenatario: " + editTextComen.getText().toString() ;
            String mensajerecibido = nombre + pais + comen;
            textviewResumen.setText(mensajerecibido);
            editTextPerson.setText("");
            editTextPais.setText("");
            editTextComen.setText("");
        }
    }
}