package imastudio.id.co.mhquser.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;


public class BaseActivity extends AppCompatActivity {
    protected Context c;
    public static final AlphaAnimation btnAnimasi = new AlphaAnimation(1F, 0.5F);


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        c = this;


    }
}
