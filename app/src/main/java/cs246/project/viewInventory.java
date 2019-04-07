package cs246.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.Vector;
import java.util.Iterator;
import android.util.Log;

public class viewInventory extends AppCompatActivity  {

    private static final String TAG = "viewInventory";
    Vector<String> v = new Vector<>();//***Temporary  Test Example ***
    inventoryData localInventoryData; // This needs to connect to the InventoryData object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_inventory);
        /**
         * Table Layout
         *
         * Dynamically updates the table based on what's in the vector
         *
         * @author Kirk Fletcher
         */
        TableLayout tl = (TableLayout) findViewById(R.id.viewInventoryTable);

        //***Temporary Text Example
            v.add("Example Item 1");
            v.add("Example Item 2");
            v.add("Example Item 3");
            v.add("Example Item 4");
            Iterator itex = v.iterator();

            while(itex.hasNext()) {
                TableRow tr = new TableRow(this);

                TextView tv = new TextView(this);
                String str = String.valueOf(itex.next());
                tv.setText(str);
                tr.addView(tv);

                tl.addView(tr);
                Log.v(TAG, "While Loop run");
            }
            // *** Ends Here ****

        // NEEDS TO REPLACE TEMPORARY TEXT ABOVE WHEN WE PULL FROM INVENTORY_DATA*******
//        Iterator it = localInventoryData.vInventory.iterator();
//
//        while(it.hasNext()) {
//            TableRow tr = new TableRow(this);
//
//            // Item Description
//            TextView tvDesc = new TextView(this);
//            String strDesc = String.valueOf(it.next().getItem());
//            tvDesc.setText(strDesc);
//
//            // Item Amount
//            TextView tvAmt = new TextView(this);
//            String strAmt = String.valueOf(it.next().getAmt());
//            tvAmt.setText(strAmt);
//
//            // Item Limit
//            TextView tvLmt = new TextView(this);
//            String strLmt = String.valueOf(it.next().getLmt());
//            tvLmt.setText(strLmt);
//
//            tr.addView(tvDesc); // Add Desc to Row
//            tr.addView(tvAmt); // Add Amount to Row
//            tr.addView(tvLmt); // Add Limit to Row
//
//            tl.addView(tr); // Add Row to Layout
//        }
    }
}