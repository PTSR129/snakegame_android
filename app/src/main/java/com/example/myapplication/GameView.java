package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
    private Paint paint = new Paint();
    private float size = 100;
    private char[][] viewMap =
            {{'a','a','a','a','a'},
            {'a','a','b','a','a'},
            {'a','b','c','b','a'},
            {'a','a','b','a','a'},
            {'a','a','a','a','a'}};

    //5x5 원 그리기
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int inc_x = canvas.getWidth() / 5;
        int x = inc_x / 2;
        int inc_y = canvas.getHeight() / 5;
        int y = inc_y / 2;

        for(int i = 0;i < 5;i++) {
            for (int j = 0; j < 5; j++) {
                
                //색깔 바꾸기. a : 검정, b : 빨강, c : 파랑
                if(viewMap[i][j] == 'a')paint.setColor(Color.BLACK);
                else if (viewMap[i][j] == 'b')paint.setColor(Color.RED);
                else paint.setColor(Color.BLUE);
                
                canvas.drawCircle(x, y, size, paint);
                x += inc_x;
            }
            x = inc_x / 2;
            y += inc_y;
        }
    }

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
