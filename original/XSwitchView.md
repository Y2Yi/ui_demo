## XSwitchView - 游标左右切换控件

## XML Code

```xml
<com.guang.max.widget.navbar.XSwitchView
  android:id="@+id/switchView"
  android:layout_width="165dp"
  android:layout_height="36dp"
  android:background="@drawable/ui_button_bg_f7f8fa_r18"
  android:paddingHorizontal="4dp"
  android:paddingVertical="4dp"
  app:layout_constraintEnd_toEndOf="parent"
  app:layout_constraintStart_toStartOf="parent"
  app:layout_constraintTop_toTopOf="parent" />
```

## Kotlin Code

```kotlin
binding.switchView.apply {
  // 滑块的背景色
  setCursorView(findDrawable(R.drawable.ui_bg_ffffff_r14))
  // 滑块上的文案
  setText(
    "Left",
    "Right"
  )
  // 滑块上文案的尺寸
  setTextSize(13f)
  // 文字颜色，分别是check是时的文字颜色和uncheck时的文字颜色
  setTextColor(findColor(R.color.ig_color_ff4c00), findColor(R.color.ig_color_323233))
  // 状态切换监听
  setOnCheckListener(object : XSwitchView.OnCheckListener {
    override fun onCheck(type: XSwitchView.SelectType, view: View?) {
      when (type) {
        XSwitchView.SelectType.SELECT_LEFT -> {
          ToastUtils.showShort("SELECT_LEFT")
        }
        XSwitchView.SelectType.SELECT_RIGHT -> {
          ToastUtils.showShort("SELECT_RIGHT")
        }
      }
    }

  })
  // 默认选中左边
  this.check(XSwitchView.SelectType.SELECT_LEFT)
}
```