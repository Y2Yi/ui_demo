StatusTipDialog - 轻提示（带有图标样式）

## Kotlin Code

```kotlin
// 构建
StatusTipDialog(context).setStatus(status,tips).show()

// status取值
class StatusTipDialog(context: Context) : Dialog(context, R.style.UtilsLoadingDialog) {
  companion object {
    const val LOADING = 0x01 //加载中(转圈 + 提示)
    const val LOADING_NO_TIP = 0x02 //加载中无提示 （转圈）
    const val SUCCESS = 0x03 //成功(✅)
    const val FAIL = 0x04 //失败(❗️)
  }
	······
}
```