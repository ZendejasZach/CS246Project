package cs246.project;

import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.text.TextUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

public class loginPage extends AppCompatActivity {

    EditText username, password;
    Button login;
    Button signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(login(username.getText().toString(), password.getText().toString())==1)
                {
                    Intent intent = new Intent(loginPage.this, startPage.class);
                    startActivity(intent);
                }
            }
            });
    }

    private void showError() {
        password.setError("Password and username didn't match");
    }

    private int login(String userName, String userPassword) {
        if (userName.equals("admin") && userPassword.equals("1234"))
        {
            return 1;

        }else {
                showError();
                return 0;
            }
        }

}