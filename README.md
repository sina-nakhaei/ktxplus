# KTX-Plus: Supercharge Your Android Development with Kotlin Extensions

[![](https://jitpack.io/v/sina-nakhaei/ktxplus.svg)](https://jitpack.io/#sina-nakhaei/ktxplus)
[![Kotlin Version](https://img.shields.io/badge/kotlin-1.9.22-orange.svg)](https://kotlinlang.org/)
[![Android Min SDK](https://img.shields.io/badge/Android%20Min%20SDK-21-green)](https://developer.android.com/about/versions/android-5.0)

Welcome to KTX-Plus, an Android library designed to supercharge your Kotlin development experience. With KTX-Plus, you'll gain access to a collection of powerful and user-friendly extensions tailored for Android development.

## Features

- **View Extensions**: Simplify your code with intuitive extensions for views, including visibility toggling, click listeners, and more.
- **String Extensions**: Enjoy a variety of string extensions for formatting, validation, and manipulation.
- **Context Extensions**: Simplify resource access and system services with context extensions.

- and lots of more...

## Installation

To use KTX-Plus in your Android project, follow these steps:

1. Add the following maven repository to your project-level `build.gradle` file:

   ```groovy
   allprojects {
       repositories {
           maven { url 'https://jitpack.io' }
       }
   }
   ```


2. Add the dependency to your module-level build.gradle file:

   ```groovy
   dependencies {
    implementation 'com.github.sina-nakhaei:ktxplus:v1.0.0-alpha'
   }
