package com.example.selectionwidgets;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class GridExample extends Activity
        implements AdapterView. OnItemClickListener {

    TextView selection;
    String[] items = { "this", "is", "a", "class",
            "class2", "class3","class4",
            "class5", "silly", "list" };

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_grid_example);
        selection = (TextView) findViewById(R.id.selection);
        GridView gv = (GridView) findViewById(R.id.grid);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                items );
        gv.setAdapter(aa);
        gv.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> parent, View v,
                            int position, long id) {
        selection.setText(items[position]);
    }

}