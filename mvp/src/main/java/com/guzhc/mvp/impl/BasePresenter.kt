package com.guzhc.mvp.impl

import android.content.res.Configuration
import android.os.Bundle
import com.guzhc.mvp.IMvpView
import com.guzhc.mvp.IPresenter

abstract class BasePresenter<out V:IMvpView<BasePresenter<V>>>:IPresenter<V> {

    override lateinit var view: @UnsafeVariance V

    override fun onCreate(savedInstanceState: Bundle?) = Unit
    override fun onSaveInstanceState(outState: Bundle) = Unit
    override fun onViewStateRestored(savedInstanceState: Bundle?) = Unit
    override fun onConfigurationChange(newConfig: Configuration) = Unit
    override fun onDestroy() = Unit
    override fun onStart() = Unit
    override fun onStop() = Unit
    override fun onResume() = Unit
    override fun onPause() = Unit
}