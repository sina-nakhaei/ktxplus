package com.sinanakhaei.ktx_plus

/**
 * Checks if the number is greater than the specified value.
 *
 * @param value The value to compare against.
 * @return True if the number is greater than the specified value, false otherwise.
 */
fun Number.isMoreThan(value: Number): Boolean = (toDouble() > value.toDouble())

/**
 * Checks if the number is greater than or equal to the specified value.
 *
 * @param value The value to compare against.
 * @return True if the number is greater than or equal to the specified value, false otherwise.
 */
fun Number.equalsOrMoreThan(value: Number): Boolean = (toDouble() >= value.toDouble())

/**
 * Checks if the number is less than the specified value.
 *
 * @param value The value to compare against.
 * @return True if the number is less than the specified value, false otherwise.
 */
fun Number.isLessThan(value: Number): Boolean = (toDouble() < value.toDouble())

/**
 * Checks if the number is less than or equal to the specified value.
 *
 * @param value The value to compare against.
 * @return True if the number is less than or equal to the specified value, false otherwise.
 */
fun Number.equalsOrLessThan(value: Number): Boolean = (toDouble() <= value.toDouble())

/**
 * Checks if the number is an even number (0, 2, 4...).
 *
 * @return True if the number is even, false otherwise.
 */
fun Number.isEven(): Boolean = (toDouble() % 2.0 == 0.0)

/**
 * Checks if the number is an odd number (1, 3, 5...) .
 *
 * @return True if the number is odd, false otherwise.
 */
fun Number.isOdd(): Boolean = !isEven()


/**
 * Checks if the number is positive.
 *
 * @return True if the number is positive, false otherwise.
 */
fun Number.isPositive() = toDouble() > 0.0

/**
 * Checks if the number is negative.
 *
 * @return True if the number is negative, false otherwise.
 */
fun Number.isNegative() = toDouble() < 0.0