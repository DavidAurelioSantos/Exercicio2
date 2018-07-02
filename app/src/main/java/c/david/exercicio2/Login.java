package c.david.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView txtWelcome = (TextView) findViewById(R.id.txtWelcome);

        Intent iLogin = getIntent();
        Bundle bdlLogin = iLogin.getExtras();
        String campoLogin = bdlLogin.getString("ChaveLogin");
        txtWelcome.setText("Seja Bem Vindo " + campoLogin);
    }
}
