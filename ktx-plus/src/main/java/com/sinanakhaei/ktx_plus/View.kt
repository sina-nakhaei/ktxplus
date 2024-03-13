package com.sinanakhaei.ktx_plus

import android.view.View
import android.view.ViewGroup
import androidx.core.view.marginBottom
import androidx.core.view.marginEnd
import androidx.core.view.marginStart
import androidx.core.view.marginTop

/**
 * Sets the visibility of the view to GONE, making it invisible and not taking up any space in the layout.
 */
fun View.hide() {
    visibility = View.GONE
}

/**
 * Sets the visibility of the view to INVISIBLE, making it invisible but still taking up space in the layout.
 */
fun View.invisible() {
    visibility = View.INVISIBLE
}

/**
 * Sets the visibility of the view to VISIBLE, making it visible.
 */
fun View.show() {
    visibility = View.VISIBLE
}

/**
 * Returns true if the view's visibility is set to VISIBLE, indicating that the view is currently visible.
 *
 * @return True if the view is visible, false otherwise.
 */
fun View.isVisible() = (this.visibility == View.VISIBLE)

/**
 * Toggles the visibility of the view between VISIBLE, INVISIBLE, and GONE.
 *
 * @param gone If true, sets the visibility to GONE when toggling from VISIBLE. If false, sets the visibility to INVISIBLE.
 */
fun View.toggleVisibility(gone: Boolean = true) {
    visibility = if (visibility == View.VISIBLE) {
        if (gone) View.GONE
        else View.INVISIBLE
    } else View.VISIBLE
}

private const val DEFAULT_DEBOUNCE_TIME_MS = 300L


/**
 * Sets a safe click listener for the view, preventing rapid consecutive clicks within a specified debounce time.
 *
 * @param debounceTimeMs The debounce time in milliseconds. Default is 300 milliseconds.
 * @param onClick The click listener to be executed when the view is clicked.
 */
fun View.setOnSafeClickListener(
    debounceTimeMs: Long = DEFAULT_DEBOUNCE_TIME_MS,
    onClick: (View) -> Unit
) {
    var lastClickTime = 0L
    setOnClickListener { view ->
        val currentTime = System.currentTimeMillis()
        if (currentTime - lastClickTime >= debounceTimeMs) {
            lastClickTime = currentTime
            onClick(view)
        }
    }
}

/**
 * Fades in the view by animating its alpha property from 0f to 1f.
 *
 * @param duration The duration of the fade-in animation in milliseconds. Default is 300 milliseconds.
 */
fun View.fadeIn(duration: Long = 300) {
    alpha = 0f
    visibility = View.VISIBLE
    animate()
        .alpha(1f)
        .setDuration(duration)
        .start()
}

/**
 * Fades out the view by animating its alpha property from 1f to 0f, and sets the visibility to GONE when the animation ends.
 *
 * @param duration The duration of the fade-out animation in milliseconds. Default is 300 milliseconds.
 */
fun View.fadeOut(duration: Long = 300) {
    animate().alpha(0f)
        .setDuration(duration)
        .withEndAction { visibility = View.GONE }
        .start()
}

/**
 * Disables the view by setting its isEnabled and isClickable properties to false.
 */
fun View.disable() {
    isEnabled = false
    isClickable = false
}

/**
 * Enables the view by setting its isEnabled and isClickable properties to true.
 */
fun View.enable() {
    isEnabled = true
    isClickable = true
}

/**
 * Sets the margins of the view using the provided values.
 *
 * @param start The start margin value in pixels. Default is the current start margin of the view.
 * @param top The top margin value in pixels. Default is the current top margin of the view.
 * @param end The end margin value in pixels. Default is the current end margin of the view.
 * @param bottom The bottom margin value in pixels. Default is the current bottom margin of the view.
 */
fun View.setMargins(
    start: Int = marginStart,
    top: Int = marginTop,
    end: Int = marginEnd,
    bottom: Int = marginBottom
) {
    val params = layoutParams as ViewGroup.MarginLayoutParams
    params.setMargins(start, top, end, bottom)
    layoutParams = params
}