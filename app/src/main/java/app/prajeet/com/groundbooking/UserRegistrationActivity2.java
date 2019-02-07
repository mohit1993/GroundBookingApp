package app.prajeet.com.groundbooking;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class UserRegistrationActivity2 extends AppCompatActivity {

    TextView mDobTextView;
    TextView mPhoneNumberTextView;
    TextView mEmailTextView;
    TextView mPasswordTextView;
    TextView mConfirmPasswordTextView;

    EditText mDobEditText;
    EditText mPhoneNumberEditText;
    EditText mEmailEditText;
    EditText mPasswordEditText;
    EditText mConfirmPasswordEditText;
    SimpleDateFormat dateFormatter;

    private DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            Calendar newDate = Calendar.getInstance();
            newDate.set(year, month, dayOfMonth);
            mDobEditText.setText(dateFormatter.format(newDate.getTime()));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration2);

        mDobTextView = findViewById(R.id.tv_dob);
        mPhoneNumberTextView = findViewById(R.id.tv_phoneNumber);
        mEmailTextView = findViewById(R.id.tv_email);
        mPasswordTextView = findViewById(R.id.tv_password);
        mConfirmPasswordTextView = findViewById(R.id.tv_confirmPassword);

        mDobEditText = (EditText) findViewById(R.id.et_dob);
        mPhoneNumberEditText = (EditText) findViewById(R.id.et_phoneNumber);
        mEmailEditText = findViewById(R.id.et_email);
        mPasswordEditText = findViewById(R.id.et_password);
        mConfirmPasswordEditText = findViewById(R.id.et_confirmPassword);

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        mDobEditText.setOnFocusChangeListener(new EditText.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    mDobTextView.setVisibility(View.VISIBLE);
                    mDobEditText.setHint("");
                } else {
                    if (mDobEditText.getText().toString().isEmpty()) {
                        mDobTextView.setVisibility(View.INVISIBLE);
                        mDobEditText.setHint(R.string.dob);
                    }
                }
            }
        });

        mPhoneNumberEditText.setOnFocusChangeListener(new EditText.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    mPhoneNumberTextView.setVisibility(View.VISIBLE);
                    mPhoneNumberEditText.setHint("");
                } else {
                    if (mPhoneNumberEditText.getText().toString().isEmpty()) {
                        mPhoneNumberTextView.setVisibility(View.INVISIBLE);
                        mPhoneNumberEditText.setHint(R.string.phone_number);
                    }
                }
            }
        });

        mEmailEditText.setOnFocusChangeListener(new EditText.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    mEmailTextView.setVisibility(View.VISIBLE);
                    mEmailEditText.setHint("");
                } else {
                    if (mEmailEditText.getText().toString().isEmpty()) {
                        mEmailTextView.setVisibility(View.INVISIBLE);
                        mEmailEditText.setHint(R.string.email);
                    }
                }
            }
        });

        mPasswordEditText.setOnFocusChangeListener(new EditText.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    mPasswordTextView.setVisibility(View.VISIBLE);
                    mPasswordEditText.setHint("");
                } else {
                    if (mPasswordEditText.getText().toString().isEmpty()) {
                        mPasswordTextView.setVisibility(View.INVISIBLE);
                        mPasswordEditText.setHint(R.string.password);
                    }
                }
            }
        });

        mConfirmPasswordEditText.setOnFocusChangeListener(new EditText.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    mConfirmPasswordTextView.setVisibility(View.VISIBLE);
                    mConfirmPasswordEditText.setHint("");
                } else {
                    if (mConfirmPasswordEditText.getText().toString().isEmpty()) {
                        mConfirmPasswordTextView.setVisibility(View.INVISIBLE);
                        mConfirmPasswordEditText.setHint(R.string.confirm_password);
                    }
                }
            }
        });
    }

    public void onDobEditorClick(View view) {
        Calendar calendar = Calendar.getInstance();
        new DatePickerDialog(UserRegistrationActivity2.this, date,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)).show();
    }
}
