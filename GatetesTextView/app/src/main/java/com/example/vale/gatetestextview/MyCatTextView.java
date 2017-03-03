package com.example.vale.gatetestextview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by vale on 13/02/17.
 */
public class MyCatTextView extends TextView
{
    public MyCatTextView(Context context) {
        super(context);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "tenderkittens.ttf");
        this.setTypeface(face);
    }

    public MyCatTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "tenderkittens.ttf");
        this.setTypeface(face);
    }

    public MyCatTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Typeface face= Typeface.createFromAsset(context.getAssets(), "tenderkittens.ttf");
        this.setTypeface(face);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
