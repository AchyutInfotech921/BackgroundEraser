package com.achyut.backgrounderaser.Drawing_View.brushes;


import android.graphics.Canvas;

import com.achyut.backgrounderaser.Drawing_View.DrawingEvent;


public interface BrushRenderer {
    void draw(Canvas canvas);
    void onTouch(DrawingEvent drawingEvent);
    void setBrush(Brush brush);
}
