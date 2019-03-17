package cs246.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class updateInventory extends AppCompatActivity {

    // logging
    private static final String TAG = "updateInventory";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_inventory);

        // Buttons
       manualUpdateButton();
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








    // Test comment
}