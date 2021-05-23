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
get button
```
Button btn = findViewById(R.id.btn);
```

colorSelector
```
<Button
    android:id="@+id/btn"
    android:text="this is button"
    android:background="@drawable/btn_selector"
    android:backgroundTint="@drawable/btc_color_selector"
    android:layout_width="200dp"
    android:layout_height="100dp"
    />
```

btc_color_selector is defined at btc_color_selector.xml
```
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:color = "#FFFF0000" android:state_pressed="true"/>
    <item android:color = "#FF00FF00"/>
</selector>
```

click 点击事件
```
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        // Code here executes on main thread after user presses button
        Log.e(TAG,"onClick");
    }
});
```

long-press 长按事件
```
btn.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View v) {
        // Code here executes on main thread after user presses button
        Log.e(TAG,"onLongClick");
        return false;  // if return true, the event will be consumed, and won't call click
    }
});
```

touch 触摸事件
```
btn.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Log.e(TAG,"onTouch: " + event.getAction() );
        return false; // if return true, the event will be consumed, and won't call click / longClick
    }
});
```

# 5. EditText
```
    <EditText
        android:id="@+id/et"
        android:layout_width="200dp"
        android:layout_height="100dp"
        android:hint="input passwd"
        android:textColorHint="#95a1aa"
        android:inputType="textPassword"
        android:drawableLeft="@drawable/ic_font_download_black_24dp"
        android:drawablePadding="40dp"
        android:paddingStart="20dp"
        android:paddingLeft="20dp"
        android:background="@color/white"
        />
```
***android:drawableLeft*** : put image at left most.
***android:drawablePadding*** : distance between image and edit text.
***android:paddingStart*** : The start edge of whole editText box from start side.

# 6. ImageView

```
    <ImageView
        android:layout_width="200dp"
        android:layout_height="100dp"
        android:src="@drawable/moon"
        android:scaleType="centerCrop"/>
    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:maxWidth="150dp"
        android:maxHeight="150dp"
        android:adjustViewBounds="true"
        android:src="@drawable/moon"/>
```
***android:scaleType="fitXY"*** to stretch.  
***android:scaleType="fitCenter"***,"fitStart" "fitEnd" to fit middle, left, right.  
***android:scaleType="centerCrop"*** fill in and keep ratio.  
***android:scaleType="matrix"*** 不改变原图大小，从ImageView左下角开始绘制原图，原图超过ImageView部门做剪裁处理  

# 7. ProcessBar

```
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal" >
        <!--progress bar, just load, do not show accurate status -->
        <ProgressBar
            android:id="@+id/pb"
            android:indeterminate="true"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
        <Button
            android:id="@+id/btn_pb"
            android:onClick="clickFun"
            android:text="Change status"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
        <!--progress bar, show status, each time when click, increase 10 -->
        <ProgressBar
            android:id="@+id/pb2"
            style="?android:progressBarStyleHorizontal"
            android:layout_width="100dp"
            android:max="100"
            android:layout_height="wrap_content" />
        <!--模拟下载-->
        <Button
            android:onClick="loader"
            android:text="load"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
    </LinearLayout>
```

# 8. Notification
A class that represents how a persistent notification is to be presented to the user using the NotificationManager.
To create a notification channel, follow these steps:
(1) Construct a *NotificationChannel* object with a unique channel ID, a user-visible name, and an importance level.  
(2) Optionally, specify the description that the user sees in the system settings with setDescription().  
(3) Register the notification channel by passing it to createNotificationChannel().  

# 9. Toolbar
It's a ViewGroup that can be placed anywhere in your XML layouts. Toolbar's appearance and behavior can be more easily customized than the ActionBar.

```
    <androidx.appcompat.widget.Toolbar
        android:id="@+id/tb"
        app:navigationIcon="@drawable/ic_keyboard_arrow_left_black_24dp"
        android:minHeight="?attr/actionBarSize"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:title="this is Toolbar"
        app:titleTextColor="@android:color/white"
        app:titleMarginStart="10dp"
        app:subtitle="subtitle"
        app:logo="@mipmap/ic_launcher"
        android:background="?attr/colorPrimary"
        >
    </androidx.appcompat.widget.Toolbar>

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/tb2"
        app:navigationIcon="@drawable/ic_keyboard_arrow_left_black_24dp"
        android:minHeight="?attr/actionBarSize"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:title="this is Toolbar"
        app:titleTextColor="@android:color/white"
        app:titleMarginStart="90dp"
        app:subtitle="subtitle"
        app:logo="@mipmap/ic_launcher"
        android:background="?attr/colorPrimary"
        >
        <TextView
            android:text="overlap orignal title"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            />
    </androidx.appcompat.widget.Toolbar>
```

# 10. Toolbar


