## LineSpaceTextView - 行间距自适应多行文本

## XML Code

```xml
<com.guang.max.widget.text.LineSpaceTextView
  android:id="@+id/lstv12"
  android:layout_width="0dp"
  android:layout_height="wrap_content"
  android:layout_weight="1"
  android:includeFontPadding="true"
  android:text="@string/ui_long_text"
  android:textSize="@dimen/ig_dp_12" />
```

## 说明

1. 可根据字体大小适配行间距。
2. android:includeFontPadding 一直为true，防止部分内容被截断。



