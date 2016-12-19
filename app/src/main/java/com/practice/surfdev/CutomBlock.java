package com.practice.surfdev;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CutomBlock extends LinearLayout {

    private String[] songs = new String[]{"Drag", "Infra-Red", "Twenty years"};

    public CutomBlock(Context context) {
        this(context, null);
    }

    public CutomBlock(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.custom_block, this);
        TextView textView = (TextView) findViewById(R.id.block_text_view);
        for (int i = 0; i < songs.length; i++) {
            textView.setText(songs[i] + "\n");
        }
    }
}
