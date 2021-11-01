AGStepper

## Kotlin Code

```kotlin
binding.mStepper.apply {
  // 最小值文案
  setStrMinToast(findString(R.string.ui_already_min_value))
  // 最大值文案
  setStrMaxToast(findString(R.string.ui_already_max_value))
  // 最大值，最小值，当前数值
  setNormalData(1, 5, 1)
  // 所有状态改变的监听
  setListener(object : AGStepper.IOnStepperChangeListener {
    override fun onChange(num: Int) {
      
    }
  })

  // 区分增、减的状态改变监听
  setListener(object : AGStepper.IOnStepperCriticalPointListener {
    override fun onDecrease(minValue: Int) {
      ToastUtils.showShort(R.string.ui_at_least)
    }

    override fun onIncrease(maxValue: Int) {
      ToastUtils.showShort(R.string.ui_no_more)
    }

  })

}
```

## XML Code

```xml
  <com.guang.max.widget.text.stepper.AGStepper
    android:id="@+id/mStepper"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

## 说明

1. 支持设置最大、最小限制值，以及对应的提示文案
2. 支持在数字右侧设置单位文本
3. 支持加减按钮的点击监听
4. 支持数值变化监听



