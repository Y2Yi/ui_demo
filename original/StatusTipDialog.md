## StatusTipDialog - 轻提示（带有图标样式）

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



## UI规范

1. 最小宽度**104**，最小高度**42**，圆角**5** 最大宽度**308**，高度跟随文本高度变化 提示文案距离两边最小宽度为14 
2. 提示内容仅包含文字。为了让用户在 **2s** 内知晓传达的信息，文案最好控制在 **16** 字以内； 
3. 轻提示持续 **2s** 后自动消失，出现速度先慢后快，**无法点击提示外区域或者通过操作项使轻提示消失**； 
4. **一般不同时出现多个**，多个同时被触发时，收起上一个再弹出下一个。