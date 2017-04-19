package com.example.adit.mobiletagloc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.adit.mobiletagloc.base.App;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.usernameEdit)
    EditText usernameEdit;

    @BindView(R.id.passwordEdit)
    EditText passwordEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ((App)getApplication()).getComponent().inject(this);

        ButterKnife.bind(this);

    }
}
