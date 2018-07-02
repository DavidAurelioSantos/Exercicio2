package c.david.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    Intent iCampoLogin;
    String campoLogin;
    Intent iCampoRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        final TextView txtLogin = (TextView) findViewById(R.id.txtLogin);
        TextView txtSenha = (TextView) findViewById(R.id.txtSenha);
        Button bLogin = (Button) findViewById(R.id.bLogin);
        Button bRegistrar = (Button) findViewById(R.id.bRegistrar); 

        bLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Toast.makeText(v.getContext(), "Apertei o botão Login", Toast.LENGTH_SHORT).show();
                iCampoLogin = new Intent(v.getContext(),Login.class);
                campoLogin = txtLogin.getText().toString();

                Bundle bdlLogin = new Bundle();
                bdlLogin.putString("ChaveLogin",campoLogin);
                iCampoLogin.putExtras(bdlLogin);
                startActivity(iCampoLogin);
            }
        });
        
        bRegistrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Toast.makeText(v.getContext(), "Apertei o botão para Registrar", Toast.LENGTH_SHORT).show();
                iCampoRegistrar = new Intent(v.getContext(),Register.class);
                startActivity(iCampoRegistrar);
                //setContentView(R.layout.activity_register);
            }
        });
    }
}
