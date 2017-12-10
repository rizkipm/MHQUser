package imastudio.id.co.mhquser.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.ViewFlipper;

import imastudio.id.co.mhquser.R;


public class SplashActivity extends BaseActivity {

    private static final String TAG = SplashActivity.class.getSimpleName();
    private static final int PERMISSION_WRITE_EXTERNAL_STORAGE = 100;

    protected Context c ;

    public static final AlphaAnimation btnAnimasi = new AlphaAnimation(1F, 0.5F);


    private GridView mGridView;
    private ProgressBar mProgressBar;
    public ViewFlipper viewFlipper;
    private String imgMenu, idSlider,nmMenu, desMenu, hargaMenu, Nmresto, idMenu, statusOps;

    private boolean mIsAppFirstLaunched = true;



    ImageView btnBuah, btnSayur;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_activity);

        mProgressBar = (ProgressBar)findViewById(R.id.progressBar);
        c = this;

//

        final Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

//              if (sesi.isLogin()){
//                  startActivity(new Intent(c, MainMenu.class));
//                  finish();
//
//                }else {
                    startActivity(new Intent(c, LoginActivity.class));
                    finish();
//                }
            }
        }, 2000L);
    }







    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                           int[] grantResults) {
        if (requestCode == PERMISSION_WRITE_EXTERNAL_STORAGE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            } else {
                Toast.makeText(this, "Until you grant the permission, we canot display the images", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
