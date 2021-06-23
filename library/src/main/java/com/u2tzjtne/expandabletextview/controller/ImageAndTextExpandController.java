package com.u2tzjtne.expandabletextview.controller;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.u2tzjtne.expandabletextview.library.R;


public class ImageAndTextExpandController implements ExpandIndicatorController {

    private final String mExpandText;
    private final String mCollapseText;

    private final Drawable mExpandDrawable;
    private final Drawable mCollapseDrawable;

    private TextView mTextView;
    private ImageButton mImageButton;

    public ImageAndTextExpandController(String expandText, String collapseText,
                                        Drawable expandDrawable, Drawable collapseDrawable) {
        mExpandText = expandText;
        mCollapseText = collapseText;
        mExpandDrawable = expandDrawable;
        mCollapseDrawable = collapseDrawable;
    }

    @Override
    public void changeState(boolean collapsed) {
        mTextView.setText(collapsed ? mExpandText : mCollapseText);
        mImageButton.setImageDrawable(collapsed ? mExpandDrawable : mCollapseDrawable);
    }

    @Override
    public void setView(View toggleView) {
        mTextView = (TextView) toggleView.findViewById(R.id.expand_collapse_text);
        mImageButton = (ImageButton) toggleView.findViewById(R.id.expand_collapse_image);
    }
}
