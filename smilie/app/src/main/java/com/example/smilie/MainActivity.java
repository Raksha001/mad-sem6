package com.example.smilie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(new myView(this));
    }
    private class myView extends View {

        public myView(Context context) {
            super(context);
        }
        protected void onDraw(Canvas canvas) {

            Paint myPaint = new Paint();
            myPaint.setColor(Color.BLACK);

            myPaint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(540, 700, 520, myPaint);
            myPaint.setColor(Color.YELLOW);
            canvas.drawCircle(540, 700, 500, myPaint);
            myPaint.setColor(Color.BLACK);
            myPaint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(300, 550, 100, myPaint);
            myPaint.setColor(Color.WHITE);
            canvas.drawCircle(300, 600,  30,myPaint);
            myPaint.setColor(Color.BLACK);

            canvas.drawCircle(750, 550, 100, myPaint);
            myPaint.setColor(Color.WHITE);
            canvas.drawCircle(750, 600, 30, myPaint);
            myPaint.setColor(Color.RED);
            canvas.d
            RectF oval = new RectF(300, 600 +650 / 8, 750, (float) (650 + 650 / 2.5));
            canvas.drawArc(oval, 40, 100, false, myPaint);
        }}
}

