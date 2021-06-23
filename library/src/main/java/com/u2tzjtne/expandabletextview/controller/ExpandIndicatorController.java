package com.u2tzjtne.expandabletextview.controller;

import android.view.View;

public interface ExpandIndicatorController {
    void changeState(boolean collapsed);

    void setView(View toggleView);
}
