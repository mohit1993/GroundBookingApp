package app.prajeet.com.groundbooking;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class UserLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        intView();
    }

    public void intView(){
        ImageView image_ground = findViewById(R.id.groundImage);
        EditText text_user_name = findViewById(R.id.user_name);
        EditText text_pass = findViewById(R.id.password);
        TextView text_view_forgot_pass = findViewById(R.id.forgot_password);
        Button login = findViewById(R.id.login);
        TextView text_or = findViewById(R.id.text_or);
        Button sign_up = findViewById(R.id.sign_up);

        Context context = getApplicationContext();
        FractionUtils fractionUtils = FractionUtils.getInstance();
        int topMargin = fractionUtils.getFractionValueForHeight(context,
                R.fraction.login_top_margin);
        int editorWidth = fractionUtils.getFractionValueForWidth(context,
                R.fraction.login_field_width);

        ConstraintLayout.LayoutParams lp = (ConstraintLayout.LayoutParams) image_ground.getLayoutParams();
        lp.height = fractionUtils.getFractionValueForHeight(context,
                R.fraction.ground_image_height);
        image_ground.setLayoutParams(lp);

        lp = (ConstraintLayout.LayoutParams) text_user_name.getLayoutParams();
        lp.width = editorWidth;

        lp.setMargins(0,topMargin,0,0);
        text_user_name.setLayoutParams(lp);

        lp = (ConstraintLayout.LayoutParams) text_pass.getLayoutParams();
        lp.width = editorWidth;
        lp.setMargins(0,topMargin/2,0,0);
        text_pass.setLayoutParams(lp);

        lp = (ConstraintLayout.LayoutParams) text_view_forgot_pass.getLayoutParams();
        lp.setMargins(0,topMargin/2,0,0);
        text_view_forgot_pass.setLayoutParams(lp);

        lp = (ConstraintLayout.LayoutParams) login.getLayoutParams();
        lp.setMargins(0,topMargin,0,0);
        login.setLayoutParams(lp);

        topMargin = fractionUtils.getFractionValueForHeight(context,R.fraction.sign_up_top_margin);
        lp = (ConstraintLayout.LayoutParams) text_or.getLayoutParams();
        lp.setMargins(0,topMargin,0,0);
        text_or.setLayoutParams(lp);

        lp = (ConstraintLayout.LayoutParams) sign_up.getLayoutParams();
        lp.setMargins(0,topMargin,0,0);
        sign_up.setLayoutParams(lp);
    }

    public void onCreateNewAccoutButtonClick(View view){
        Intent i = new Intent(this, UserRegistrationActivity1.class);
        startActivity(i);
    }

    public void loginButtonClick(View view) {
        Intent i = new Intent(this, UserHomeActivity.class);
        startActivity(i);
    }
}
