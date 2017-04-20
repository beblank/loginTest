package com.example.adit.mobiletagloc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.adit.mobiletagloc.base.App;
import com.example.adit.mobiletagloc.http.login.APIService;
import com.example.adit.mobiletagloc.http.login.model.ServerResponse;
import retrofit2.Call;
import rx.Observable;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.usernameEdit)
    EditText usernameEdit;

    @BindView(R.id.passwordEdit)
    EditText passwordEdit;

    @BindView(R.id.submitBtn)
    Button submitBtn;

    private APIService loginApiService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ((App)getApplication()).getComponent().inject(this);

        ButterKnife.bind(this);

        submitBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.submitBtn:
                Toast.makeText(this, "Button tapped", Toast.LENGTH_SHORT).show();
                sendLogin(usernameEdit.getText().toString(), passwordEdit.getText().toString());
                break;
        }
    }

    private void sendLogin(String username, String password){
        Observable<ServerResponse> call = loginApiService.post("login", username, password);

        Log.d("dodol", "sendLogin: " + call);
    }

}
