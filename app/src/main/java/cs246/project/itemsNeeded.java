package cs246.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class itemsNeeded extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_needed);

        // Buttons
        // TODO: need to test these buttons in emulator
        // TODO: implement android back button
        viewInventoryButton();
        updateInventoryButton();
    }

    private void viewInventoryButton() {
       Button viewInventory = findViewById(R.id.viewInventory);
       viewInventory.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               startActivity(new Intent(itemsNeeded.this, viewInventory.class));
           }
       });
    }

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
