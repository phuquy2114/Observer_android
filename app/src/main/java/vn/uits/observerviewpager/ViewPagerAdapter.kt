package vn.uits.observerviewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Copyright © 2017 BAP CO., LTD
 * Created by PHUQUY on 3/19/18.
 */

class ViewPagerAdapter(fm: FragmentManager, private val mList: List<Fragment>) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return mList[position]
    }

    override fun getCount(): Int {
        return mList.size
    }
}
