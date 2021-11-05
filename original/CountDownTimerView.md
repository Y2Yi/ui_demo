# CountDownTimerView - 倒计时组件

## Kotlin Code

```kotlin
private val unitsWithDay = arrayListOf("小时", "分钟", "秒")//对应的单位
private val timeFormats =
    arrayListOf(3600000, 60000, 1000)//三个单位对毫秒的换算率，1分钟 = 60s = 60x1000ms = 60000ms

private var enableCountDownListener = false//是否开始倒计时

binding.apply {
  //配置实例
  countDownTimerView1.configCountDown(
    System.currentTimeMillis() + 4000000,//endTime,当前时间戳的4000000ms后
    unitsWithDay,//时间单位
    timeFormats,//对应毫秒的换算率
    timeStyleType = CountDownTimerUtils.TimeStyleType.NO_AUTO,//时间显示风格
    strStartFix = findString(R.string.ui_task_will_finish),//前缀文字
    strEndFix = findString(R.string.ui_after_will_close)//后缀文字
  )

  // 倒计时监听
  countDownTimerView1.setOnCountDownListener(object : CountDownTimerView.OnCountDownListener {
    // 倒计时
    override fun onCountDown(view: TextView, timeArr: IntArray) {
      
    }
		// 计时结束
    override fun onFinish() {
      
    }
  })
}
```

## XML Code

```xml
  <com.guang.max.widget.text.countdowntimer.CountDownTimerView
    android:id="@+id/countDownTimerView1"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
  />
```

## 说明

1. 指定每个节点解析的单位集合，比如：[86400000, 3600000]
解析出来的就是 [天、时]
2. 指定分割单位集合，比如：[时, 分, 秒]
3. 指定字符串风格 TimeStyleType：
- DEFAULT：一直展示
- NO_FIRST：第一位为00不显示
-  NO_SECOND：第二位为00不显示
-  NO_THIRD：第三位为00不显示
-  NO_AUTO：只要为00不显示 
4. 指定前后添加的描述文字 strStartFix、strEndFix 
5. 可手动结束倒计时 endTimeCountDown() 
6. 监听倒计时中、结束状态 OnCountDownListener

