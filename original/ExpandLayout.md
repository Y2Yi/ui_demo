## ExpandLayout - 折叠容器

## XML Code

```xml
<com.guang.max.widget.container.ExpandLayout
  android:id="@+id/expandLayout"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:layout_marginTop="@dimen/ig_dp_8"
  android:gravity="center_horizontal">


  <com.guang.max.widget.container.RoundConstraintLayout
    android:id="@+id/roundConstraintLayout"
    android:layout_width="300dp"
    android:layout_height="200dp"
    android:background="@color/ig_color_F2F3F5">

    <TextView
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:gravity="center"
      android:text="@string/ui_round_constraint_layout_value"
      android:textSize="@dimen/ig_dp_24"
      app:layout_constraintBottom_toBottomOf="parent"
      app:layout_constraintEnd_toEndOf="parent"
      app:layout_constraintStart_toStartOf="parent"
      app:layout_constraintTop_toTopOf="parent" />

  </com.guang.max.widget.container.RoundConstraintLayout>
</com.guang.max.widget.container.ExpandLayout>
```

## Kotlin Code

```kotlin
binding.expandLayout.apply {
  post {
    // 初始状态（是否展开）、展开时的大小
    initExpand(false, 200.dp)
  }
  // 动画耗时
  this.setAnimationDuration(100)
  // 展开收起监听
  setOnToggleExpandListener(object : ExpandLayout.OnToggleExpandListener {
    override fun onToggleExpand(isExpand: Boolean) {
    }
  })
}
```