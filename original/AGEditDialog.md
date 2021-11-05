

## AGEditDialog - 单行输入框弹窗控件

## KotlinCode

```kotlin
AGEditDialog.builder(context)
	// 顶部标题
  .setTitle(findString(R.string.ui_create_new_classify))
	// 默认内容和PlaceHolder
  .setContent("", findString(R.string.ui_plz_input_classify_name))
	// 取消按钮的回调事件
  .setNegativeBtn(
    findString(R.string.ui_cancel),
    object : AGEditDialogView.OnClickListener {
      override fun onClick(dialog: DialogInterface, which: Int, content: CharSequence?) {
        dialog.dismiss()
        // do sth
      }
    })
	// 确认按钮的回调事件
  .setPositiveBtn(
    findString(R.string.ui_ok),
    object : AGEditDialogView.OnClickListener {
      override fun onClick(dialog: DialogInterface, which: Int, content: CharSequence?) {
        dialog.dismiss()
        // do sth
      }
    })
  .show()
```

## 说明

1. 支持设置标题、输入框内容、hint和按钮的文案。
2. 【视觉】设置对话框最小高度为140px，宽度为310px，圆角为8px。
3. 【视觉】内容较多时，对话框高度若即将超过380时，内容区滑动展示