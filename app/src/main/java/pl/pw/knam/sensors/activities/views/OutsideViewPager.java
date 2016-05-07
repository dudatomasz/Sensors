package pl.pw.knam.sensors.activities.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by toudi on 07.05.2016.
 */
public class OutsideViewPager   extends android.support.v4.view.ViewPager {

    private boolean enabled = false;

    public OutsideViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (this.enabled) {
            return super.onTouchEvent(event);
        }

        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.enabled) {
            return super.onInterceptTouchEvent(event);
        }

        return false;
    }

    public void setPagingEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    public void setSwipeEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
