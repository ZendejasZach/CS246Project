package cs246.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class startPage extends AppCompatActivity {

    // logging
    private static final String TAG = "startPage";
    String userName;
    inventoryData inventory;
    String filename;

    /**
     * Activity Creation
     *
     * Creates the activity and the buttons on the page
     * @author Zach Zendejas
     * @param savedInstanceState Needed for method
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        // Buttons
        viewInventoryButton();
        updateInventoryButton();
        settingsButton();
        logoutButton();

        // Load user information
        userName = "Zach";  // Used for testing
        filename = userName + ".data";

        // check for existing inventory

        if(!(inventoryData.checkData(userName, filename))){
            inventory = new inventoryData(userName, filename);
        }
        else{
            inventory = inventoryData.load(userName, filename);
        }

    }

    /**
     * Logout Button
     *
     * This is the creation of the logout button on the start page
     * TODO: Create logout process
     *
     * @author Zach Zendejas
     */
    private void logoutButton() {
        Button logout = findViewById(R.id.logOut);
        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.v(TAG, "Logout button tapped");
//                startActivity(new Intent(startPage.this, loginPage.class));
//                Likely some other logic here to log the user out.
            }
        });
    }

    /**
     * Settings button
     *
     * This creates the settings button on the start page
     * TODO: Settings activity not created yet.
     *
     * @author Zach Zendejas
     */
    private void settingsButton() {
        Button settings = findViewById(R.id.notificationSettings);
        settings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.v(TAG, "Settings button tapped");
//                startActivity(new Intent(startPage.this, notificationSettings.class));
            }
        });
    }

    /**
     * Update Inventory Button
     *
     * This creates the update inventory button on the start page and navigates to said page
     *
     * @author Zach Zendejas
     */
    private void updateInventoryButton() {
        Button updateInventory = findViewById(R.id.updateInventory);
        updateInventory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.v(TAG, "Update Inventory Button tapped");
                startActivity(new Intent(startPage.this, updateInventory.class));
            }
        });
    }

    /**
     * View Inventory Button
     *
     * This creates the view inventory button on the start page and navigates to said page
     *
     * @author Zach Zendejas
     */
    private void viewInventoryButton(){
        Button viewInventory = findViewById(R.id.viewInventory);
        viewInventory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.v(TAG, "View Inventory button tapped");
                startActivity(new Intent(startPage.this, viewInventory.class));
            }
        });
    }


}
