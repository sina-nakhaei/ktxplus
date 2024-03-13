package com.sinanakhaei.ktx_plus

import android.os.Build

fun <T> doBasedOnAndroidVersion(
    versionCode: Int,
    doOnLowerVersion: () -> T,
    doOnHigherVersion: () -> T,
): T {
    return if (Build.VERSION.SDK_INT < versionCode)
        doOnLowerVersion()
    else
        doOnHigherVersion()
}