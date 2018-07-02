package c.david.exercicio2;

import android.content.Intent;
import android.hardware.camera2.TotalCaptureResult;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView txtLogin = (TextView) findViewById(R.id.txtLogin);
        final TextView txtSenha = (TextView) findViewById(R.id.txtSenha);
        final TextView txtConfirmeSenha = (TextView) findViewById(R.id.txtConfirmeSenha);

        final Button bGravar = (Button) findViewById(R.id.bGravar);

        bGravar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Passou por aqui", Toast.LENGTH_SHORT).show();
                //String senha = txtSenha.getText().toString();
                //String confirma = txtConfirmeSenha.getText().toString();

                if (txtSenha.getText().toString().equals(txtConfirmeSenha.getText().toString())) {
                    Toast.makeText(v.getContext(), "São iguais", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(v.getContext(), "São diferentes", Toast.LENGTH_SHORT).show();

                    //if (senha.equals(confirma)) {
                    //    Toast.makeText(view.getContext(), "São iguais", Toast.LENGTH_SHORT).show();
                    //} else {
                    //    Toast.makeText(view.getContext(), "São diferentes", Toast.LENGTH_SHORT).show();
                }
                //setContentView(R.layout.activity_principal);
            }

            //Toast.makeText(view.getContext(),"Aqui", Toast.LENGTH_SHORT);

        });
    }
    }

