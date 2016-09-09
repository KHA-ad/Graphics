package cn.edu.bistu.cs.se.graphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class SimpleView extends View{

    public SimpleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawCircle(100, 200, 50, paint);

        //绘制文本
        Path CWRectpath = new Path();
        RectF rect1 = new RectF(300,300,490,450);
        CWRectpath.addRect(rect1, Path.Direction.CCW);
        String text = "风萧萧兮易水寒，壮士一去兮不复返";
        paint.setColor(Color.GRAY);
        paint.setTextSize(35);
       // canvas.drawPath(CWRectpath, paint);//画出路径
        canvas.drawTextOnPath(text, CWRectpath, 0, 18, paint);//顺时针生成
    }
}
