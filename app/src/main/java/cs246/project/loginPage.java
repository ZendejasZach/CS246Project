package cs246.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class loginPage extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    private void validate(String userName, String userPassword) {
        if ((userName.equals("")) && (userPassword.equals(""))){
            Intent intent = new Intent(loginPage.this, startPage.class);
            startActivity(intent);
            }
        else{
            Info.setText("Incorrect username and/or password");
        }

    }
}