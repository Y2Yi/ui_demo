## ScaleViewGroup - 下拉回弹容器

## XML Code

```xml
  <com.guang.max.widget.container.ScaleViewGroup
    android:id="@+id/scaleViewGroup"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <androidx.constraintlayout.widget.ConstraintLayout
      android:layout_width="match_parent"
      android:layout_height="300dp">

      <!--  bg  -->
      <ImageView
        android:id="@+id/bg"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@drawable/ui_bg_sink_sticky"
        android:scaleType="centerCrop"
        app:layout_constraintTop_toTopOf="parent" />

      <com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout
        android:id="@+id/scrollerLayout"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:background="@color/ig_color_20_00"
        app:layout_constraintBottom_toBottomOf="@+id/bg"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="@id/bg"
        app:layout_constraintStart_toStartOf="parent" />

    </androidx.constraintlayout.widget.ConstraintLayout>

  </com.guang.max.widget.container.ScaleViewGroup>
```

## Kotlin Code

```
// 放大效果
binding.scaleViewGroup.apply {
  setTargetView(binding.bg)
}
```

## 说明

在`@+id/scrollerLayout`上的滑动，最终会放大`@+id/bg`处的图片。

