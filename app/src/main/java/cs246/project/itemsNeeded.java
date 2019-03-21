package cs246.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class itemsNeeded extends AppCompatActivity {

    // logging tag
    private static final String TAG = "itemsNeeded";

    /**
     * onCreate
     *
     * Method needed to create the activity. Runs other methods to create the buttons on the page
     *
     * @author Zach Zendejas
     * @param savedInstanceState Needed for method
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_needed);

        // Buttons
        viewInventoryButton();
        updateInventoryButton();
    }

    /**
     * View Inventory Button
     *
     * View the inventory button for items needed page.
     *
     * @author Zach Zendejas
     */
    private void viewInventoryButton() {
       Button viewInventory = findViewById(R.id.viewInventory);
       viewInventory.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               Log.v(TAG, "View Inventory button tapped");
               startActivity(new Intent(itemsNeeded.this, viewInventory.class));
           }
       });
    }

    /**
     * UpdateInventory Button
     *
     * Update Inventory button. Takes user to the Update Inventory page.
     *
     * @author Zach Zendejas
     */
    private void updateInventoryButton(){
       Button updateInventory = findViewById(R.id.updateInventory);
       updateInventory.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               startActivity(new Intent(itemsNeeded.this, updateInventory.class));
           }
       });
    }
}
