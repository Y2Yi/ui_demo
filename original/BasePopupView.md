## BasePopupView - 通用弹窗组件

#### 1. 普通对话框

```kotlin
XPopup.Builder(this)
	// 分别对应标题，和右侧的按钮(positiveButton，通常是确认)
  .asConfirm(findString(R.string.ui_title), findString(R.string.ui_content)) {
    // 确认时的回调
  }.show()
```

#### 2. 带有输入框的对话框

```kotlin
XPopup.Builder(this)
	// 分别对应标题，和右侧的按钮(positiveButton，通常是确认)
  .asInputConfirm(findString(R.string.ui_title), findString(R.string.ui_content)) {
    // 回调入参是输入的内容
  }.show()
```

#### 3. 中间弹出的列表

```kotlin
XPopup.Builder(this)
  .asCenterList(
	// 分别对应标题以及列表的内容
    findString(R.string.ui_plz_select_one), arrayOf("1", "2", "3", "4")
  ) { index, text ->
    // 回调入参是索引、文字
  }.show()
```

#### 4. 底部弹出的列表

```kotlin
//用法大致同上
XPopup.Builder(this)
  .asBottomList(
    findString(R.string.ui_plz_select_one), arrayOf("1", "2", "3", "4")
  ) { _, text ->
    // 回调入参是索引、文字
  }.show()
```

#### 5. 依附于某个View的弹窗

```kotlin
XPopup.Builder(this)
  .atView(要依附的View)
  .asAttachList(
    // 线性布局的一个操作组，例如：[编辑|分享|删除]
    arrayOf(
      findString(R.string.ui_share),
      findString(R.string.ui_delete),
      findString(R.string.ui_no_icon),
    ), 
    // 线性布局的一个操作组对应的图标，不传就没有图标
    arrayOf(
      R.drawable.ui_goods_ic_share,
      R.drawable.ui_goods_ic_delete,
    ).toIntArray()
  ) { 
    position, text ->
    // 回调入参是索引、文字
  }.show()
```

#### 6. 全屏弹窗

```kotlin
XPopup.Builder(this)
  .hasStatusBarShadow(true)
  .autoOpenSoftInput(true)
  .asCustom(CustomFullScreenPopup(this))
  .show();

// 你需要去自定义一个CustomFullScreenPopup，示例代码如下：

class CustomFullScreenPopup(context: Context) : FullScreenPopupView(context) {
  override fun getImplLayoutId(): Int {
    // 布局
    return R.layout.ui_dialog_full_sreen
  }
  override fun onCreate() {
    super.onCreate()
  }
}
```

#### 7. 抽屉弹窗

```kotlin
XPopup.Builder(this)
  .popupPosition(PopupPosition.Left)//右边
  .hasStatusBarShadow(true) //启用状态栏阴影
  .asCustom(CustomDrawerPopupView(this))
  .show();

// 自定义Drawer
class CustomDrawerPopupView(context: Context) : DrawerPopupView(context) {
  override fun getImplLayoutId(): Int {
    return R.layout.ui_dialog_drawer
  }

  private lateinit var binding: UiDialogDrawerBinding
  override fun onCreate() {
    super.onCreate()
  }
}
```

#### 8. 依附于布局中某个点的弹窗

```kotlin
val builder = XPopup.Builder(this)
  .watchView(viewBinding.rcAttachPoint)

// 依附布局的监听事件中，弹出代码可参考（5.依附于某个View的弹窗）
viewBinding.rcAttachPoint.setOnClickListener {
  builder.asAttachList(
    arrayOf(
      findString(R.string.ui_share),
      findString(R.string.ui_delete),
      findString(R.string.ui_no_icon),
    ), arrayOf(
      R.drawable.ui_goods_ic_share,
      R.drawable.ui_goods_ic_delete,
    ).toIntArray()
  ) { _, text ->
    
  }.show()
}
```

#### 9. 全屏图片浏览弹窗

```kotlin
XPopup.Builder(context)
  .asImageViewer(
    holder.binding.ivPic,// 外部imageView
    holder.absoluteAdapterPosition,// 显示图片位置
    data.map { // 图片Url集合
      it.second
    },
    { 
      popupView, position ->
      // 如果当滑动ViewPager切换图片后，需要更新srcView，此时会执行该回调，你需要调用updateSrcView方法。
      popupView.updateSrcView(
        recyclerView.getChildAt(position)?.findViewById(R.id.ivPic) ?: return@asImageViewer
      )
    }, ImageLoader()
  ).show()

```