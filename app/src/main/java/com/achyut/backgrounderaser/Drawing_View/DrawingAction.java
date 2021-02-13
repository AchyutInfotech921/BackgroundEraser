package com.achyut.backgrounderaser.Drawing_View;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Rect;


class DrawingAction {

    Bitmap mBitmap;
    Rect mRect;

    DrawingAction(Bitmap bitmap, Rect rect){
        mBitmap = bitmap;
        mRect = new Rect(rect);
    }

    //The size is needed so we do not get an OutOfMemoryError
    @SuppressLint("NewApi")
    int getSize() {
        return mBitmap.getAllocationByteCount();
    }

}
