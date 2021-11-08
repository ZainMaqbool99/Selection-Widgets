package com.example.selectionwidgets;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Spinner extends Activity
 implements  AdapterView.OnItemSelectedListener{

    TextView selection;
    String[] items = { "this", "is", "a", "class",
            "class2", "class3","class4",
            "class5", "silly", "list" };

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_spinner);
        selection = (TextView) findViewById(R.id.selection);
        android.widget.Spinner spin = findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
// set a clickable right push-button comboBox to show items
        ArrayAdapter<String> aa = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, items);
// provide a particular design for the drop-down lines
        aa.setDropDownViewResource(
                android.R.layout.select_dialog_singlechoice);
// associate GUI spinner and adapter
        spin.setAdapter(aa);
    }
    // ////////////////////////////////////////////////////////////////////
    public void onItemSelected(
            AdapterView<?> parent, View v, int position, long id) {
        selection.setText(items[position]);
    }
    public void onNothingSelected(AdapterView<?> parent) {
        selection.setText("");
    }
}