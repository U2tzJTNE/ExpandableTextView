package com.u2tzjtne.expandabletextview.controller;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;


public class ImageButtonExpandController implements ExpandIndicatorController {

    private final Drawable mExpandDrawable;
    private final Drawable mCollapseDrawable;

    private ImageButton mImageButton;

    public ImageButtonExpandController(Drawable expandDrawable, Drawable collapseDrawable) {
        mExpandDrawable = expandDrawable;
        mCollapseDrawable = collapseDrawable;
    }

    @Override
    public void changeState(boolean collapsed) {
        mImageButton.setImageDrawable(collapsed ? mExpandDrawable : mCollapseDrawable);
    }

    @Override
    public void setView(View toggleView) {
        mImageButton = (ImageButton) toggleView;
    }
}
