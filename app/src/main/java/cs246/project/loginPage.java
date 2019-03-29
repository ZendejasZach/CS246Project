package cs246.project;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class loginPage extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle saved InstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        Name = (EditText) findViewById(R.id.username);
        Name = (EditText) findViewById(R.id.password);
        Login = (Button) findViewById(R.id.login);
    }

    private void validate(String userName, String userPassword){
        if((userName == "") && (userPassword == ""))
    }
}