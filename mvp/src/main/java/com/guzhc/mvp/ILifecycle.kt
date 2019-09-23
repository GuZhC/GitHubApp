package com.guzhc.mvp

import android.content.res.Configuration
import android.os.Bundle

interface ILifecycle {

    fun onCreate(savedInstanceState: Bundle?)

    fun onSaveInstanceState(outState: Bundle)

    fun onViewStateRestored(savedInstanceState: Bundle?)

    fun onConfigurationChange(newConfig: Configuration)

    fun onStart()

    fun onResume()

    fun onPause()

    fun onStop()

    fun onDestroy()

}