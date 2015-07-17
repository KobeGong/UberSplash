package com.kobe.ubersplash;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;


/**
 * Created by kobe.gong on 2015/7/17.
 */
public class FormView extends LinearLayout {
    public FormView(Context context) {
        super(context);
        loadView();
    }

    public FormView(Context context, AttributeSet attrs) {
        super(context, attrs);
        loadView();
    }

    public FormView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        loadView();
    }

    private void loadView(){
        setOrientation(VERTICAL);
        LayoutInflater.from(getContext()).inflate(R.layout.form_view, this);

    }
}
