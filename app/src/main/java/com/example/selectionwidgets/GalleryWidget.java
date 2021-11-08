package com.example.selectionwidgets;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;

public class GalleryWidget extends Activity {

    TextView mySelection;
    Gallery myGallery;


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_gallery_widget);
        mySelection = (TextView) findViewById(R.id.mySelection);
// Bind the gallery defined in the main.xml
// Apply a new (customized) ImageAdapter to it.
        myGallery = findViewById(R.id.myGallery);
        myGallery.setAdapter(new ImageAdapter(this));
        myGallery.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                mySelection.setText(" selected option: " + arg2 );
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                mySelection.setText("Nothing selected");
            }
        });
    // onCreate
    }


}

class ImageAdapter extends BaseAdapter {

    private Context myContext;
    private int[] myImageIds = {R.drawable.fl1, R.drawable.fl2, R.drawable.fl3, R.drawable.cat1, R.drawable.cat2 };

    public ImageAdapter(Context c) {
        this.myContext = c;
    }


    public int getCount() {
        return this.myImageIds.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    // Returns a new ImageView to be displayed,
    public View getView(int position, View convertView,
                        ViewGroup parent) {
// Get a View to display image data
        ImageView iv = new ImageView(this.myContext);
        iv.setImageResource(this.myImageIds[position]);

        iv.setScaleType(ImageView.ScaleType.FIT_END);
// Set the Width & Height of the individual images
        iv.setLayoutParams(new LayoutParams(250, 250));
        iv.setPadding(50, 50,50,50);
        return iv;
    }
}
