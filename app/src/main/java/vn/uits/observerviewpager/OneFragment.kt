package vn.uits.observerviewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import vn.uits.observerviewpager.observer.ObserverImpl
import vn.uits.observerviewpager.observer.RepositoryObserver

/**
 * Copyright © 2017 BAP CO., LTD
 * Created by PHUQUY on 3/19/18.
 */

class OneFragment : Fragment(), RepositoryObserver {
    override fun onUserDataChanged(name: String?, age: Int) {

    }

    private var mObserverImpl: ObserverImpl? = ObserverImpl.getInstance()

    fun newInstance(): OneFragment {
        val args = Bundle()
        val fragment = OneFragment()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        var mTvInfo: TextView? = view.findViewById(R.id.mTvInfo)
        mTvInfo?.setOnClickListener(View.OnClickListener {
            mObserverImpl?.setData("PhuQuy", 28);
        })
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mObserverImpl?.registerObserver(this)
        mObserverImpl?.setData("PhuQuy", 28);
    }
}
