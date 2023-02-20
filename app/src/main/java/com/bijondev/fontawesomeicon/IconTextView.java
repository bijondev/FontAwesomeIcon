package com.bijondev.fontawesomeicon;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

public class IconTextView extends TextView {

    private Context context;

    public IconTextView(Context context) {
        super(context);
        this.context = context;
        createView();
    }

    public IconTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        createView();
    }

    private void createView(){
        setGravity(Gravity.CENTER);
        String fontPath = "webfonts/fa-regular-400.ttf";
        Typeface tf = Typeface.createFromAsset(context.getAssets(), fontPath);
        setTypeface(tf);
    }
}
