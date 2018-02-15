package com.think360.pro.healthguru.doctors.customviews.expandablelistview;

import com.think360.pro.healthguru.doctors.customviews.expandablelistview.swipemenu.SwipeMenu;
import com.think360.pro.healthguru.doctors.customviews.expandablelistview.swipemenu.SwipeMenuLayout;
import com.think360.pro.healthguru.doctors.customviews.expandablelistview.swipemenu.SwipeMenuView;

import android.view.View;

/**
 * 
 * @author yuchentang
 * 
 */
public class SwipeMenuViewForExpandable extends SwipeMenuView {

    private Swipable mListView;
    private SwipeMenuLayout mLayout;
    private SwipeMenu mMenu;
    private OnSwipeItemClickListenerForExpandable onItemClickListener;
    private int groupPosition, childPostion;

    public int getGroupPosition() {
        return this.groupPosition;
    }

    public void setGroupPosition(int groupPosition) {
        this.groupPosition = groupPosition;
    }

    public int getChildPostion() {
        return this.childPostion;
    }

    public void setChildPostion(int childPostion) {
        this.childPostion = childPostion;
    }

    public SwipeMenuViewForExpandable(SwipeMenu menu, Swipable listView, int groupPosition, int childPostion) {
        super(menu, listView);
        this.groupPosition = groupPosition;
        this.childPostion = childPostion;
    }


    @Override
    public void onClick(View v) {
        if (onItemClickListener != null && mLayout.isOpen()) {
            onItemClickListener.onItemClick(this, mMenu, v.getId());
        }
    }

    public OnSwipeItemClickListenerForExpandable getOnSwipeItemClickListenerForExpandable() {
        return onItemClickListener;
    }

    public void setOnSwipeItemClickListenerForExpandable(OnSwipeItemClickListenerForExpandable onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setLayout(SwipeMenuLayout mLayout) {
        this.mLayout = mLayout;
    }

    public static interface OnSwipeItemClickListenerForExpandable {
        void onItemClick(SwipeMenuViewForExpandable view, SwipeMenu menu, int index);
    }
}
