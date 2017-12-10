package imastudio.id.co.mhquser.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import imastudio.id.co.mhquser.R;

public class LoginActivity extends AppCompatActivity {

    TextView btnDaftarDisni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnDaftarDisni = (TextView)findViewById(R.id.btnLoginSignUp);
        btnDaftarDisni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a1 = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(a1);
            }
        });
    }
}
