package app.prajeet.com.groundbooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class UserRegistrationActivity1 extends AppCompatActivity {

    TextView mFirstNameTextView;
    TextView mMiddleNameTextView;
    TextView mLastNameTextView;

    EditText mFirstNameEditText;
    EditText mMiddleNameEditText;
    EditText mLastNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);
        mFirstNameTextView = (TextView) findViewById(R.id.tv_firstname);
        mMiddleNameTextView = (TextView) findViewById(R.id.tv_middlename);
        mLastNameTextView = (TextView) findViewById(R.id.tv_lastname);

        mFirstNameEditText = (EditText) findViewById(R.id.et_firstname);
        mMiddleNameEditText = (EditText) findViewById(R.id.et_middlename);
        mLastNameEditText = (EditText) findViewById(R.id.et_lastname);

        mFirstNameEditText.setOnFocusChangeListener(new EditText.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    mFirstNameTextView.setVisibility(View.VISIBLE);
                    mFirstNameEditText.setHint("");
                } else {
                    if (mFirstNameEditText.getText().toString().isEmpty()) {
                        mFirstNameTextView.setVisibility(View.INVISIBLE);
                        mFirstNameEditText.setHint(R.string.first_name);
                    }
                }
            }
        });

        mMiddleNameEditText.setOnFocusChangeListener(new EditText.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    mMiddleNameTextView.setVisibility(View.VISIBLE);
                    mMiddleNameEditText.setHint("");
                } else {
                    if (mMiddleNameEditText.getText().toString().isEmpty()) {
                        mMiddleNameTextView.setVisibility(View.INVISIBLE);
                        mMiddleNameEditText.setHint(R.string.middle_name);
                    }
                }
            }
        });

        mLastNameEditText.setOnFocusChangeListener(new EditText.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    mLastNameTextView.setVisibility(View.VISIBLE);
                    mLastNameEditText.setHint("");
                } else {
                    if (mLastNameEditText.getText().toString().isEmpty()) {
                        mLastNameTextView.setVisibility(View.INVISIBLE);
                        mLastNameEditText.setHint(R.string.last_name);
                    }
                }
            }
        });
    }

    public void onNextButtoClick(View view) {
        Intent i = new Intent(this, UserRegistrationActivity2.class);
        startActivity(i);
    }

    public void onEditFieldClick(View view) {
//        switch(view.getId()) {
//            case R.id.et_firstname:
//                mFirstNameTextView.setVisibility(View.VISIBLE);
//                break;
//            default:
//                break;
//        }
    }
}
