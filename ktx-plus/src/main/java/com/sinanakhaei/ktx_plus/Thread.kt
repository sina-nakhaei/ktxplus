package com.sinanakhaei.ktx_plus

import android.os.Handler
import android.os.Looper

/**
 * Runs the specified action asynchronously in a separate thread.
 *
 * @param action The action to be executed.
 */
fun runAsync(action: () -> Unit) = Thread(Runnable(action)).start()

/**
 * Runs the specified action on the UI thread.
 * If the UI thread is not available, the action is posted to the UI thread's message queue for later execution.
 *
 * @param action The action to be executed on the UI thread.
 */
fun runOnUiThread(action: () -> Unit) {
    if (isMainLooperAlive()) action()
    else Handler(Looper.getMainLooper()).post(Runnable(action))
}

/**
 * Runs the specified action after a delay on the current thread.
 *
 * @param delayMillis The delay in milliseconds before executing the action.
 * @param action The action to be executed after the delay.
 */
fun runDelayed(delayMillis: Long, action: () -> Unit) =
    Handler().postDelayed(Runnable(action), delayMillis)

/**
 * Runs the specified action after a delay on the UI thread.
 * If the UI thread is not available, the action is posted to the UI thread's message queue for later execution.
 *
 * @param delayMillis The delay in milliseconds before executing the action.
 * @param action The action to be executed on the UI thread after the delay.
 */
fun runDelayedOnUiThread(delayMillis: Long, action: () -> Unit) =
    Handler(Looper.getMainLooper()).postDelayed(Runnable(action), delayMillis)

private fun isMainLooperAlive() = Looper.myLooper() == Looper.getMainLooper()