package com.sinanakhaei.ktx_plus

/**
 * Returns the original string if it is not null, or the provided fallback value if it is null.
 *
 * @param value The fallback value to use if the original string is null.
 * @return The original string if it is not null, or the fallback value if it is null.
 */
fun String?.or(value: String): String = this ?: value

/**
 * Checks if the string represents a valid email address.
 *
 * @return True if the string is a valid email address, false otherwise.
 */
fun String.isEmail(): Boolean {
    val emailRegex = Regex("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")
    return emailRegex.matches(this)
}

/**
 * Truncates the string to a specified length and appends a suffix if the string exceeds the length.
 *
 * @param length The maximum length of the truncated string.
 * @param suffix The suffix to append if the string exceeds the specified length. Default is "...".
 * @return The truncated string.
 */
fun String.truncate(length: Int, suffix: String = "..."): String {
    return if (this.length > length) {
        this.substring(0, length) + suffix
    } else {
        this
    }
}

/**
 * Returns true if the string is not null and not blank (contains non-whitespace characters), false otherwise.
 *
 * @return True if the string is not null and not blank, false otherwise.
 */
fun String?.isNotNullOrBlack(): Boolean = !isNullOrBlank()

/**
 * Returns true if the string is not null and not empty, false otherwise.
 *
 * @return True if the string is not null and not empty, false otherwise.
 */
fun String?.isNotNullOrEmpty(): Boolean = !isNullOrEmpty()
