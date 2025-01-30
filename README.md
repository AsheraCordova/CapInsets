# CapInsets

CapInsets project which adds capinsets support for background and foreground attributes.


## Installation
To install the plugin use:

```
cordova plugin add https://github.com/AsheraCordova/CapInsets.git
```

## Important Links
https://asheracordova.github.io/doc/com/ashera/plugin/CapInsets.html

https://developer.apple.com/documentation/uikit/uiimage/1624097-capinsets

## Usage
The following is simple example of configuring a view with capinsets:
```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:ignore="MissingPrefix">

    <TextView
        android:id="@+id/submit"
        backgroundCapInsetsLeft-swt="30dp"
        backgroundCapInsetsRight-swt"30dp"
        backgroundCapInsetsLeft-web="30dp"
        backgroundCapInsetsRight-web="30dp"
        backgroundCapInsetsLeft-ios="30dp"
        backgroundCapInsetsRight-ios="30dp"">
        android:background="@drawable/common_9_button"
        android:textSize="14sp"
        android:textColor="@color/color_red"
        android:textStyle="bold"
        onClick="changePassword"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_marginTop="30dp"
        android:gravity="center"
        android:paddingHorizontal="30dp"
        android:text="Update"></TextView>
</LinearLayout>
```

It must be noted that android is using 9 patch image. However the other platform simulates applying nine patch using backgroundCapInsets attributes.
