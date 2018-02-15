package com.think360.pro.healthguru.doctors.utils;

/**
 * Created by think360 on 29/06/17.
 */

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.think360.pro.healthguru.doctors.databinding.BlogChildOtherFragmentBinding;

public abstract class EndlessRecyclerOnScrollListener extends RecyclerView.OnScrollListener {
//    public static String TAG = EndlessRecyclerOnScrollListener.class.getSimpleName();

    /**
     * The total number of items in the dataset after the last load
     */
    public int mPreviousTotal = 0;
    /**
     * True if we are still waiting for the last set of data to load.
     */
    private boolean mLoading = true;

    private LinearLayoutManager mLinearLayoutManager;


    protected EndlessRecyclerOnScrollListener(LinearLayoutManager linearLayoutManager) {
        this.mLinearLayoutManager = linearLayoutManager;

    }



    @Override
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);
        //  blogChildOtherFragmentBinding.
    }

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        int visibleItemCount = recyclerView.getChildCount();
        int totalItemCount = mLinearLayoutManager.getItemCount();
        int firstVisibleItem = mLinearLayoutManager.findFirstVisibleItemPosition();

        if (mLoading) {
            if (totalItemCount > mPreviousTotal) {
                mLoading = false;
                mPreviousTotal = totalItemCount;
            }
        }
        int visibleThreshold = 5;
        if (!mLoading && (totalItemCount - visibleItemCount)
                <= (firstVisibleItem + visibleThreshold)) {
            // End has been reached

            onLoadMore();

            mLoading = true;
        }
    }

    public abstract void onLoadMore();
}





/*
package com.think360.pro.healthguru.doctors.utils;

*/
/**
 * Created by think360 on 29/06/17.
 *//*


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.think360.pro.healthguru.doctors.databinding.BlogChildOtherFragmentBinding;

public abstract class EndlessRecyclerOnScrollListener extends RecyclerView.OnScrollListener {
//    public static String TAG = EndlessRecyclerOnScrollListener.class.getSimpleName();

    */
/**
     * The total number of items in the dataset after the last load
     *//*

    public int mPreviousTotal = 0;
    */
/**
     * True if we are still waiting for the last set of data to load.
     *//*

    private boolean mLoading = true;

    private LinearLayoutManager mLinearLayoutManager;
    private BlogChildOtherFragmentBinding blogChildOtherFragmentBinding;

    protected EndlessRecyclerOnScrollListener(LinearLayoutManager linearLayoutManager,BlogChildOtherFragmentBinding blogChildOtherFragmentBinding) {
        this.mLinearLayoutManager = linearLayoutManager;
        this.blogChildOtherFragmentBinding = blogChildOtherFragmentBinding;
    }



    @Override
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);
      //  blogChildOtherFragmentBinding.
    }

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        int visibleItemCount = recyclerView.getChildCount();
        int totalItemCount = mLinearLayoutManager.getItemCount();
        int firstVisibleItem = mLinearLayoutManager.findFirstVisibleItemPosition();

        if (mLoading) {
            if (totalItemCount > mPreviousTotal) {
                mLoading = false;
                mPreviousTotal = totalItemCount;
            }
        }
        int visibleThreshold = 5;
        if (!mLoading && (totalItemCount - visibleItemCount)
                <= (firstVisibleItem + visibleThreshold)) {
            // End has been reached

            onLoadMore();

            mLoading = true;
        }
    }

    public abstract void onLoadMore();
}*/
