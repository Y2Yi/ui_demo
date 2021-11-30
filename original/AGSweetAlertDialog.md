

## AGSweetAlertDialog - 通用弹窗控件

主要有两种风格：

- TIP：纯提示风格
- EDIT：带有一个输入框

底部支持两个按钮共存，如果只含有Positive事件

## KotlinCode

```kotlin

// 带有编辑框的弹窗
AGSweetAlertDialog.builder(context, AGSweetAlertDialog.UiType.EDIT)
  .setTitle(findString(R.string.ui_create_new_classify))
  .setMessage("", findString(R.string.ui_plz_input_classify_name))
  .setNegativeButton(
    findString(R.string.ui_cancel),
    object : OnAlertDialogClickListener {
      override fun onClick(dialog: DialogInterface, which: Int, content: CharSequence?) {
        dialog.dismiss()
      }
    })
  .setPositiveButton(
    findString(R.string.ui_ok),
    object : OnAlertDialogClickListener {
      override fun onClick(dialog: DialogInterface, which: Int, content: CharSequence?) {
        dialog.dismiss()
        ToastUtils.showShort(findString(R.string.ui_value_of_input, content))
      }
    })
  .show()


// 文本提示弹窗
AGSweetAlertDialog.builder(context, AGSweetAlertDialog.UiType.TIP)
  .setTitle(findString(R.string.ui_tips_title))
  .setMessage(findString(R.string.ui_tips_text))
  .setNegativeButton(
    findString(R.string.ui_cancel),
    object : OnAlertDialogClickListener {
      override fun onClick(dialog: DialogInterface, which: Int, content: CharSequence?) {
        dialog.dismiss()
      }
    })
  .setPositiveButton(
    findString(R.string.ui_ok),
    object : OnAlertDialogClickListener {
      override fun onClick(dialog: DialogInterface, which: Int, content: CharSequence?) {
        dialog.dismiss()
      }
    })
  .show()


// 单个确认按钮的弹窗
AGSweetAlertDialog.builder(context, AGSweetAlertDialog.UiType.TIP)
  .setTitle(findString(R.string.ui_tips_title))
  .setMessage(findString(R.string.ui_tips_text))
  .setPositiveButton(
    findString(R.string.ui_ok),
    object : OnAlertDialogClickListener {
      override fun onClick(dialog: DialogInterface, which: Int, content: CharSequence?) {
        dialog.dismiss()
      }
    })
  .show()

```

## 说明

1. 支持设置标题、输入框内容、hint和按钮的文案。
2. 【视觉】设置对话框最小高度为140px，宽度为310px，圆角为8px。
3. 【视觉】内容较多时，对话框高度若即将超过380时，内容区滑动展示