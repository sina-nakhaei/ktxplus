package com.sinanakhaei.ktx_plus

import android.app.Fragment
import android.widget.Toast
import androidx.annotation.StringRes

inline fun Fragment.toast(text: CharSequence): Toast = activity.toast(text)

inline fun Fragment.longToast(text: CharSequence): Toast = activity.longToast(text)

inline fun Fragment.toast(@StringRes resId: Int): Toast = activity.toast(resId)

inline fun Fragment.longToast(@StringRes resId: Int): Toast = activity.longToast(resId)
