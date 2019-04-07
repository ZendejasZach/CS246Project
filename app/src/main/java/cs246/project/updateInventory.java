package cs246.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Iterator;
import java.util.Vector;

public class updateInventory extends AppCompatActivity { // updateInventory

    // VARIABLES FOR CREATING NEW ITEM
    //Vector<InventoryItem> tempVector;// = new Vector<InventoryItem>();//***Temporary  Test Vector ***
    String itemDescription;
    int itemQuantity;
    int itemLimit;

    EditText newItemDescription;
    EditText newItemQuantity;
    EditText newItemLimit;

    Button submitButton;
    InventoryItem newInventoryItem;
    private static final String TAG = "updateInventory";

    // VARIABLES FOR VIEWING ITEMS
    Vector<String> v = new Vector<>();//***Temporary  Test Example ***
    inventoryData localInventoryData; // This needs to connect to the InventoryData object

    // VARIABLES FOR UPDATING ITEMS
    Button deleteButton;
    Button doneButton;
    Button incrementAmtButton;
    Button decrementAmtButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_inventory); // activity_update_inventory

        /**
         * Submit Button
         *
         * Takes the inputs from the user and creates an object with them, then adds to vector
         *
         * @author Kirk Fletcher
         */
        // NEW ITEM CODE
        newItemDescription = (EditText) findViewById(R.id.newItemDescription);
        newItemQuantity = (EditText) findViewById(R.id.newItemQuantity);
        newItemLimit = (EditText) findViewById(R.id.newItemLimit);

        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                itemDescription = newItemDescription.getText().toString();
                itemQuantity = Integer.valueOf(newItemQuantity.getText().toString());
                itemLimit = Integer.valueOf(newItemLimit.getText().toString());
                newInventoryItem = new InventoryItem(itemDescription, itemQuantity, itemLimit);
                //tempVector.add(InventoryItem);// Add to Vector*******************
                //startActivity(new Intent(viewInventory.this, viewInventory.class));
                Log.v(TAG, "Submit Button clicked");
            }
        });

        /**
         * Table Layout
         *
         * Dynamically updates the table based on what's in the vector
         *
         * @author Kirk Fletcher
         */
        // VIEW ITEMS CODE
        TableLayout tl = (TableLayout) findViewById(R.id.updateInventoryTable);

        //***Temporary Text Example
        v.add("Example Item 1");
        v.add("Example Item 2");
        v.add("Example Item 3");
        v.add("Example Item 4");
        final Iterator itex = v.iterator();

        int checkBoxIndex = 0;
        while(itex.hasNext()) {
            TableRow tr = new TableRow(this);

            CheckBox newCheckBox = new CheckBox(this);
            newCheckBox.setId(checkBoxIndex);
            checkBoxIndex++;
            tr.addView(newCheckBox);

            // Description Buttons
            final Button newButton = new  Button (this);
            String str = String.valueOf(itex.next()); // Delete and uncomment below when connected to real Vector
            //String str = String.valueOf(itex.next().getAmt());
            newButton.setText(str);
            tr.addView(newButton);

            // Amount columns
            String strAmt = "0"; // Delete and uncomment below when connected to real Vector
            //String strAmt = String.valueOf(itex.next().getAmt());
            TextView tvAmt = new TextView(this);
            tvAmt.setText(strAmt);
            tr.addView(tvAmt);

            // Limit columns
            String strLmt = "0"; // Delete and uncomment below when connected to real Vector
            //String strLmt = String.valueOf(itex.next().getLmt());
            TextView tvLmt = new TextView(this);
            tvLmt.setText(strLmt);
            tr.addView(tvLmt);

            tl.addView(tr);
        }

        /**
         * Edit Buttons
         *
         * Allows user to make updates to table above.
         *
         * @author Kirk Fletcher
         */
        // UPDATE ITEM CODE
        deleteButton = (Button) findViewById(R.id.deleteItemButton);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                int checkBoxIndex = 0;
                while(itex.hasNext()) {
//                    if (findViewById(checkBoxIndex).isChecked()) { // Uncomment when using real vector
//                        v.remove(checkBoxIndex);
//                    }
                    checkBoxIndex++;
                }
            }
        });

        doneButton = (Button) findViewById(R.id.doneButton);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                startActivity(new Intent(updateInventory.this, viewInventory.class));
            }
        });

        incrementAmtButton = (Button) findViewById(R.id.incrementQtyButton);
        incrementAmtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                int checkBoxIndex = 0;
                while(itex.hasNext()) {
//                    if (findViewById(checkBoxIndex).isChecked()) {
//                        // Code to Increment InventoryItem in InventoryData Object
//                    }
                    checkBoxIndex++;
                }
            }
        });

        decrementAmtButton = (Button) findViewById(R.id.decrementQtyButton);
        decrementAmtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
            int checkBoxIndex = 0;
            while(itex.hasNext()) {
//                if (findViewById(checkBoxIndex).isChecked()) {
//                    // Code to Decrement InventoryItem in InventoryData Object
//                }
                checkBoxIndex++;
            }

            }
        });
    }

}