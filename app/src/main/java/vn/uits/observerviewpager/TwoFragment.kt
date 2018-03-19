package vn.uits.observerviewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import vn.uits.observerviewpager.observer.ObserverImpl
import vn.uits.observerviewpager.observer.RepositoryObserver

/**
 * Copyright © 2017 BAP CO., LTD
 * Created by PHUQUY on 3/19/18.
 */

class TwoFragment : Fragment(), RepositoryObserver {

    private var mObserver: ObserverImpl = ObserverImpl.getInstance()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mObserver.registerObserver(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        mObserver.removeObserver(this)
    }

    override fun onUserDataChanged(name: String?, age: Int) {
        Log.d("xxx", "" + name)
    }
}
