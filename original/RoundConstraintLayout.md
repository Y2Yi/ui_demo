## RoundConstraintLayout - 圆角约束布局

## XML Code

```xml
<com.guang.max.widget.container.RoundConstraintLayout
  android:id="@+id/roundConstraintLayout"
  android:layout_width="300dp"
  android:layout_height="200dp"
  android:background="@color/ig_color_F2F3F5"
  app:layout_constraintEnd_toEndOf="parent"
  app:layout_constraintStart_toStartOf="parent"
  app:layout_constraintTop_toTopOf="parent">

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
```

## Kotlin Code

```kotlin
binding.roundConstraintLayout.roundViewDelegate.setRectRadius(16.dp.toFloat()) //设置圆角
```