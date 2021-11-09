## TimelineLinearLayout - 时间线容器

## 说明

本质上是一个LinearLayout加上左侧或者是上面的步骤、时间节点，设置时，只需要在TimelineLinearLayout内部加载子View即可。

1. 支持竖直、横向两个方向，通过 LinearLayout 的 android:orientation 属性设置
2. 支持四种状态的节点 State : Finished/OnGoing/UnFinish/Error
3. 支持设置圆形节点半径、颜色、图标
4. 支持设置头部线、中间线、尾部线的宽度、颜色，以及头尾部线的显隐
5. 节点 view 通过 addView(view, layoutParams) 依次添加进去即可

## XML Code

```xml
<com.guang.max.widget.container.TimelineLinearLayout
  android:id="@+id/timeLineVertical"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:orientation="vertical">

  <androidx.appcompat.widget.AppCompatTextView
    android:id="@+id/tvStep1"
    android:layout_width="match_parent"
    android:layout_height="@dimen/ig_dp_44"/>

  <androidx.appcompat.widget.AppCompatTextView
    android:id="@+id/tvStep2"
    android:layout_width="match_parent"
    android:layout_height="@dimen/ig_dp_44" />

  <androidx.appcompat.widget.AppCompatTextView
    android:id="@+id/tvStep3"
    android:layout_width="match_parent"
    android:layout_height="@dimen/ig_dp_44" />

  <androidx.appcompat.widget.AppCompatTextView
    android:id="@+id/tvStep4"
    android:layout_width="match_parent"
    android:layout_height="@dimen/ig_dp_44" />

  <androidx.appcompat.widget.AppCompatTextView
    android:id="@+id/tvStep5"
    android:layout_width="match_parent"
    android:layout_height="@dimen/ig_dp_44" />


</com.guang.max.widget.container.TimelineLinearLayout>
```

## Kotlin Code 

### 1. 相关属性说明

```kotlin
data class Config(
    var timeLineMargin: Int = 0, // 时间线距离view的距离
    var style: Int = FULL_LINE,  // 样式。 完整的线，一半的线。
    var unFinishedRadius: Float = 4.dp.toFloat(), // 未完成的radius
    var onGoingRadius: Float = 4.dp.toFloat(), // 进行中的radius
    var finishedRadius: Float = 4.dp.toFloat(), // 已完成的radius
    var errorRadius: Float = 4.dp.toFloat(), // 错误的radius
    var customRadius: Float = 4.dp.toFloat(), // 自定义的radius
    var lineWidth: Float = 2.dp.toFloat(), // 线的宽度
    var footerLine: Boolean = false, // 是否需要尾部的线
    var footerLineWidth: Float = 2.dp.toFloat(), // 尾部线的宽度
    var footerLineColor: Int = Color.parseColor("#EBEDF0"), // 尾部线的颜色
    var headerLine: Boolean = false, // 是否需要头部的线
    var headerLineWidth: Float = 2.dp.toFloat(), // 头部线的宽度
    var headerLineColor: Int = Color.parseColor("#EBEDF0"), // 头部线的颜色
    var unFinishedColor: Int = Color.parseColor("#EBEDF0"), // 未完成的颜色
    var onGoingColor: Int = Color.parseColor("#44D489"), // 进行中的颜色
    var finishedColor: Int = Color.parseColor("#44D489"), // 已完成的颜色
    var errorColor: Int = Color.parseColor("#FF4444"), // 错误的颜色
    var onDrawPointIntercept: ((c: Canvas, p: Paint, state: State, rect: RectF, index: Int) -> Unit)? = null// 自定义绘制pointer拦截器
  )
```

### 2. 使用

```kotlin
// 配置纵向时间线容器
binding.timeLineVertical.apply {
  // 设置第i个节点的状态
  setChildState(0, TimelineLinearLayout.State.Finished)
  setChildState(1, TimelineLinearLayout.State.Finished)
  setChildState(2, TimelineLinearLayout.State.OnGoing)
  setChildState(3, TimelineLinearLayout.State.Error)
  setChildState(4, TimelineLinearLayout.State.UnFinish)

  // 对timeLineVertical.config属性进行额外的配置
  config.apply {
    this.headerLine = true
    this.headerLineColor = findColor(R.color.ig_color_F2F3F5)
    this.onGoingColor = findColor(R.color.ui_color_3296f1)
  }
}
```