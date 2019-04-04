package cs246.project;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class updateInventory extends AppCompatActivity {

    // logging
    private static final String TAG = "updateInventory";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_inventory);

        // Buttons
       manualUpdateButton();
        //Debugging
        createDebugInventory();
    }



    // go to scanAddition activity
    private void scanAdditionButton(){
        Button scanAddition = findViewById(R.id.scanAddition);
        scanAddition.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.v(TAG, "Scan for Addition button tapped");
                //startActivity(new Intent(updateInventory.this, scanAddition.class));
            }
        });
    }


    private void manualUpdateButton() {
        Button manualUpdate = findViewById(R.id.manualUpdate);
        manualUpdate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(updateInventory.this, manualUpdate.class));
            }
        });
    }

    /**
     * Created to create a test inventory
     * @author Zach Zendejas
     */
    //Debugging
    private void createDebugInventory(){
        final Button createInventory = findViewById(R.id.createInventory);
        createInventory.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                createTestInventory();
            }
        });
    }

    private void createTestInventory(){
        inventoryData data = new inventoryData("Test", "Test.data");

        data.addItem("BandAids", 5, 1);
        data.addItem("BandAids", 5, 1);
        data.addItem("BandAids", 5, 1);
        data.addItem("BandAids", 5, 1);
        data.addItem("BandAids", 5, 1);
        data.addItem("BandAids", 5, 1);
        data.addItem("BandAids", 5, 1);

        // Finished toast
        Context context = getApplicationContext();
        CharSequence text = "Test Database Created";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}