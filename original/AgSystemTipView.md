# AgSystemTipView - 系统提示文本

## Kotlin Code

```kotlin
binding.agSystemTipView.apply {
   setTipImg(findDrawable(R.drawable.ui_icon_info)) // 设置左侧图标
   setTipContent(findString(R.string.ui_ag_system_tip_view_content))// 设置提示文字内容
   setRightImg(findDrawable(R.drawable.ui_icon_arrow_right))// 设置右侧图标
}	
```

## XML Code

```xml
<com.guang.mobile.uidemo.base.code_components.UiDemoDescriptionTextView
  android:id="@+id/tvDescription"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:layout_marginTop="@dimen/ig_dp_8"
  android:background="@drawable/ui_f1f2f5_r5"
  android:padding="@dimen/ig_dp_8"
  android:text="@string/ui_ag_system_tip_view_description" />
```

## 说明

1. 支持设置左右侧小图标，尺寸16*16
2. 支持设置中间提示内容、文字大小
3. 支持设置左右内边距，默认12dp
4. 使用时需要**手动设置AgSystemTipView的高度**



