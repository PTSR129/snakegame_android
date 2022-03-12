package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class TestView extends View {
    private Paint paint = new Paint();

    public TestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLACK);
        int x = canvas.getWidth() / 6;
        int inc_x = x;
        int y = canvas.getHeight() / 6;
        int inc_y = y;
        for(int i = 0;i < 5;i++) {
            for (int j = 0; j < 5; j++) {
                canvas.drawCircle(x, y, 60, paint);
                x += inc_x;
            }
            x = inc_x;
            y += inc_y;
        }
    }
}