package com.sinanakhaei.ktx_plus

import android.util.Log

/**
 * Logs the string representation of the object using the debug log level.
 *
 * @param tag The tag to associate with the log message. Defaults to the tag of the object.
 */
fun Any.logMe(tag: String = this.tag) {
    d(tag, this.toString())
}

/**
 * Logs a verbose-level message if the log level for the specified tag is VERBOSE.
 *
 * @param message A lambda function that returns the message to be logged.
 */
fun Any.v(message: () -> String) {
    if (Log.isLoggable(tag, Log.VERBOSE)) v(message())
}

/**
 * Logs a debug-level message if the log level for the specified tag is DEBUG.
 *
 * @param message A lambda function that returns the message to be logged.
 */
fun Any.d(message: () -> String) {
    if (Log.isLoggable(tag, Log.DEBUG)) d(message())
}

/**
 * Logs an info-level message if the log level for the specified tag is INFO.
 *
 * @param message A lambda function that returns the message to be logged.
 */
fun Any.i(message: () -> String) {
    if (Log.isLoggable(tag, Log.INFO)) i(message())
}

/**
 * Logs an error-level message if the log level for the specified tag is ERROR.
 *
 * @param message A lambda function that returns the message to be logged.
 */
fun Any.e(message: () -> String) {
    if (Log.isLoggable(tag, Log.ERROR)) e(message())
}

/**
 * Logs a wtf-level (What a Terrible Failure) message if the log level for the specified tag is WTF.
 *
 * @param message A lambda function that returns the message to be logged.
 */
fun Any.wtf(message: () -> String) = w(message())


/**
 * Logs a verbose-level message with the specified tag and message.
 *
 * @param message The message to be logged.
 */
fun Any.v(message: String) = v(tag, message)

/**
 * Logs a debug-level message with the specified tag and message.
 *
 * @param message The message to be logged.
 */
fun Any.d(message: String) = d(tag, message)


/**
 * Logs an info-level message with the specified tag and message.
 *
 * @param message The message to be logged.
 */
fun Any.i(message: String) = i(tag, message)

/**
 * Logs a warning-level message with the specified tag and message.
 *
 * @param message The message to be logged.
 */
fun Any.w(message: String) = w(tag, message)

/**
 * Logs an error-level message with the specified tag and message.
 *
 * @param message The message to be logged.
 */
fun Any.e(message: String) = e(tag, message)

/**
 * Logs a wtf-level (What a Terrible Failure) message with the specified tag and message.
 *
 * @param message The message to be logged.
 */
fun Any.wtf(message: String) = wtf(tag, message)

inline fun v(tag: String, message: String) = Log.v(tag, message)

inline fun d(tag: String, message: String) = Log.d(tag, message)

inline fun i(tag: String, message: String) = Log.i(tag, message)

inline fun w(tag: String, message: String) = Log.w(tag, message)

inline fun e(tag: String, message: String) = Log.e(tag, message)

inline fun wtf(tag: String, message: String) = Log.wtf(tag, message)

/**
 * Logs the execution time of a block of code and returns the result of the block.
 *
 * @param tag The tag to associate with the timing log message. Defaults to "Timing".
 * @param message The message to be logged along with the execution time.
 * @param block The block of code whose execution time is to be measured.
 * @return The result of the block of code.
 */
inline fun <T> logTiming(tag: String = "Timing", message: String, block: () -> T): T {
    val startTime = System.currentTimeMillis()
    val result = block()
    val endTime = System.currentTimeMillis()
    d(tag, "$message: ${endTime - startTime} ms")
    return result
}

private val Any.tag: String
    get() = javaClass.simpleName
