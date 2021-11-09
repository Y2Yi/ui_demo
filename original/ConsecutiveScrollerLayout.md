## ConsecutiveScrollerLayout - 连续滑动控件

ConsecutiveScrollerLayout是Android下支持多个滑动布局(RecyclerView、ViewPager、WebView、ScrollView等)和普通控件(TextView、ImageView、LinearLayou、自定义View等)持续连贯滑动的容器,它使所有的子View像一个整体一样连续顺畅滑动。



## 局部滑动

被设置了局部滑动的子View将会自己处理滑动事件，ConsecutiveScrollerLayout将不会拦截子View 的事件。

```xml
<com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout
  android:layout_width="match_parent"
  android:layout_height="match_parent">

      <!--  局部滑动-->
      <androidx.core.widget.NestedScrollView
        android:layout_width="match_parent"
        android:background="@drawable/ui_border_f2f3f5_1"
        android:padding="@dimen/ig_dp_8"
        android:layout_height="wrap_content"
        app:layout_isConsecutive="false">
        ······

```

## 普通吸顶

在需要吸顶的子View上，设置`app:layout_isSticky="true"`。

```xml
<com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout
  android:id="@+id/csl"
  android:layout_width="match_parent"
  android:layout_height="match_parent">

  <androidx.appcompat.widget.AppCompatTextView
    android:layout_width="match_parent"
    android:layout_height="44dp"
    app:layout_isSticky="true" />
  
  ······
```

## 常驻吸顶

和普通吸顶的区别就是，多个吸顶View在滑动时会排列在顶部，在`ConsecutiveScrollerLayout`处设置`app:isPermanent="true"`即可。

```xml
<!--  常驻吸顶-->
<com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout
  android:layout_width="match_parent"
  android:layout_height="match_parent"
  app:isPermanent="true">

  <androidx.appcompat.widget.AppCompatTextView
    android:layout_width="match_parent"
    android:layout_height="44dp"
    app:layout_isSticky="true" /> 
  
  ······
```

## 吸顶下沉

如果你希望吸顶View吸顶时，不是悬浮在顶部，而是像抽屉一样收起隐藏在布局下层，你可以把吸顶View设置为下沉模式。属性：「app:layout_isSink="true"」。设置了下沉模式，view在吸顶时会显示在下层，被其他布局覆盖，隐藏在下面。

```xml
<com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout
  android:layout_width="match_parent"
  android:layout_height="match_parent">

  <androidx.appcompat.widget.AppCompatImageView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:layout_isSink="true"
    app:layout_isSticky="true" />

  <androidx.appcompat.widget.AppCompatTextView
    android:layout_width="match_parent"
    android:layout_height="44dp"
    app:layout_isSticky="true"
    app:layout_isSink="true"
    />
  
  ······
```

## 吸顶偏移

在ConsecutiveScrollerLayout中指定「app:stickyOffset="dp"」（或者ConsecutiveScrollerLayout.stickyOffset=dp）来设置吸顶时视图顶部的偏移量。

如下例子中：「筛选」在吸顶之后，距离顶部有44dp的距离。

```xml
<com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout
  android:id="@+id/csl"
  android:layout_width="match_parent"
  android:layout_height="match_parent"
  app:isPermanent="true"
  app:stickyOffset="@dimen/ig_dp_44">
```

