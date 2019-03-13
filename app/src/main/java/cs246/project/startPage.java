package cs246.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class startPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        // Buttons
        // TODO: Test these methods in emulator.
        viewInventoryButton();
        updateInventoryButton();
        settingsButton();
        logout();
    }

    // Page not created yet
    private void logout() {
        Button logout = findViewById(R.id.logOut);
        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//                startActivity(new Intent(startPage.this, loginPage.class));
//                Likely some other logic here to log the user out.
            }
        });
    }

    // Page not created yet
    private void settingsButton() {
        Button settings = findViewById(R.id.notificationSettings);
        settings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//                startActivity(new Intent(startPage.this, notificationSettings.class));
            }
        });
    }

    private void updateInventoryButton() {
        Button updateInventory = findViewById(R.id.updateInventory);
        updateInventory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(startPage.this, updateInventory.class));
            }
        });
    }

    // go to viewInventory activity
    private void viewInventoryButton(){
        Button viewInventory = findViewById(R.id.viewInventory);
        viewInventory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(startPage.this, viewInventory.class));
            }
        });
    }
}
