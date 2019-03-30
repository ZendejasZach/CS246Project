package cs246.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class manualUpdate extends AppCompatActivity {

    // Logging tag
    private static final String TAG = "manualUpdate";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_update);

        //Debugging
        createDebugInventory();
    }
    // Test comment

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
                Log.v(TAG, "Started creating inventory");
                createTestInventory();
            }
        });
    }

    private void createTestInventory(){
        inventoryData data = new inventoryData;

        data.addItem(5, "bandAids");
    }
}