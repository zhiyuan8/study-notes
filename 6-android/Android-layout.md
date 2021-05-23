# Android-layout

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

** gravity vs layout_gravity vs layout_weight ** :  
*android:gravity* : for parent view. sets the gravity of the contents (i.e. its subviews) of the View it's used on.  
*android:layout_gravity* : for child view group. sets the gravity of the View or Layout relative to its parent. Can only control a small part of area.  
*android:layout_weight* specifies how much of the extra space in the layout to be allocated to the View. Usually use **android:height = 0dp** and only use **layout_weight** to control vertical space.

# 2. RelativeLayout


# 3. FrameLayout


# 4. TableLayout


# 5. GridLayout



# 6. ConstraintLayout
