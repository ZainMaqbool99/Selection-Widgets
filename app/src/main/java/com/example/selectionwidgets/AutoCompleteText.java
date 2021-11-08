package com.example.selectionwidgets;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class AutoCompleteText extends Activity
        implements TextWatcher {

    TextView selection;
    AutoCompleteTextView edit;
    String[] items = { "this", "is", "a", "class",
            "class2", "class3","class4",
            "class5", "silly", "list" };

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_auto_complete_text);
        selection = (TextView) findViewById(R.id.selection);
        edit = (AutoCompleteTextView) findViewById(R.id.edit);
        edit.addTextChangedListener(this);
        edit.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, items));
    }
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        selection.setText(edit.getText());
    }
    public void beforeTextChanged(CharSequence s, int start,
                                  int count, int after) {
// needed for interface, but not used
    }
    public void afterTextChanged(Editable s) {
// needed for interface, but not used
    }
}