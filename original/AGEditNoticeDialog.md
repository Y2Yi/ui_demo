## AGEditNoticeDialog - 多行输入框弹窗控件

## KotlinCode

```kotlin
 AGEditNoticeDialog.builder(context)
		// 按钮文案
    .setBtn(findString(R.string.ui_modify_button_text), object :
      AGEditNoticeDialogView.OnClickListener {
      override fun onClick(dialog: DialogInterface, which: Int, content: CharSequence?) {
       	// 输入结果的回调函数
        dialog.dismiss()
      }
    })	
		// 顶部标题
    .setTitle(R.string.ui_title_dialog)
		// 内容和Placeholder
    .setContent("", findString(R.string.ui_title_hint_dialog))
    .show()
```

## 说明

1. 支持设置标题、输入框内容、hint和按钮的文案。
2. 【视觉】设置对话框最小高度为140px，宽度为310px，圆角为8px。
3. 【视觉】内容较多时，对话框高度若即将超过380时，内容区滑动展示