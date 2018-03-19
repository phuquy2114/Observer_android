package vn.uits.observerviewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mList: MutableList<Fragment> = mutableListOf();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fetchData()
        mViewPager.adapter = ViewPagerAdapter(supportFragmentManager, mList)
        mViewPager.offscreenPageLimit = mList.size
        mTabLayout.setupWithViewPager(mViewPager)
    }

    fun fetchData() {
        mList.add(OneFragment())
        mList.add(TwoFragment())
        mList.add(ThreeFragment())
    }
}
