package reecescupsinc.drawenator;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Reece on 6/26/2017.
 */

public class DrawenatorView extends View
{
    private Path mDrawPath;
    private Paint mDrawPaint;
    private Paint mCanvasPaint;
    private Canvas mDrawCanvas;
    private Bitmap mCanvasBitmap;
    private int mDefaultColor = 0xFFFF0000;

    public DrawenatorView(Context context, AttributeSet attributeSet)
    {
        super(context, attributeSet);
        letsDraw();
    }

    private void letsDraw()
    {

    }
}
