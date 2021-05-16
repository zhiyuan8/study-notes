# Android-UI-controls

tutorials:
https://www.bilibili.com/video/BV13y4y1E7pF?p=3

Here is example


# 1. LinearLayout
容器
LinearLayout is a view group that aligns all children in a single direction, vertically or horizontally.

```
<LinearLayout
      xmlns:android="http://schemas.android.com/apk/res/android"
      android:layout_width="match_parent"
      android:layout_height="match_parent">
    ... // add UI controls
 </LinearLayout>
```
Why 'http://schemas...' must be the first in the layout xml file?
This is XML Name Space declaration. XML namespaces are used for providing uniquely named elements and attributes in an XML document. xmlns:android describes the android namespace.

# 2. StateListDrawable


# 3. TextView
A user interface element that displays text to the user. To provide user-editable text, see EditText. click attribute with control key to trace what property to choose. Type property first to for auto-fill! All attributes must be put into values/ folder, into secondary layers such as colors strings/, do not hard-code! 

first two chars: 00 100% transparent, FF 0% transparent. 3rd-4th controls red color (FF means 100% red), then g, then b.
```

android:textColor="#FFFF0000"
```

Specifies how to align the text by the view's x- and/or y-axis when the text is smaller than the view.
```

android:gravity="center"
```

control shadow effect
```
android:shadowColor="@color/green"
android:shadowRadius="0.1" // Blur radius of the text shadow.
android:shadowDx="10.0"	// Horizontal offset of the text shadow.
android:shadowDy="10.0"	// Vertical offset of the text shadow. 
```

control marquee effect
```
android:singleLine = 'true'
android:ellipsize="marquee"
android:focusable="true"
android:focusableInTouchMode="true"
android:marqueeRepeatLimit="marquee_forever" // The number of times to repeat the marquee animation. 
android:clickable="true"
```

# 4. Button
click
long pressing
touch

# 5. EditText


# 4. ImageView



# 5. ProcessBar



