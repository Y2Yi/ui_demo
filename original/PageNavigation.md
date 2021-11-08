## PageNavigation - 页面底部导航

## XML Code

```xml
<com.guang.max.bottomtab.PageNavigationView
  android:id="@+id/tab"
  android:layout_width="match_parent"
  android:layout_height="@dimen/ig_dp_52"
  android:layout_gravity="top" />
```

## Kotlin Code

```kotlin
companion object {
  // 首页 tab index 对外1 2 3 4
  // 首页
  const val TAB_INDEX_HOME = 0
  // cpm
  const val TAB_INDEX_CPM = 1
  // 小店
  const val TAB_INDEX_STORE = 2
  // 消息
  const val TAB_INDEX_MSG = 3
  // 我的
  const val TAB_INDEX_MINE = 4
  //广告页面 1打开 0关闭
  const val AD_PAGE = "adPage"
}

private lateinit var navigationController: NavigationController

// 初始化NavigationController
private fun initNavigationController() {
  navigationController = viewBinding.tab.custom()
    .addItem(
      newItem(
        text = 按钮标签,
        drawable = 图标,
        checkedDrawable = 被选中时的图标Drawable,
      )
    //······
    ).build()
}

// 返回一个新标签item
private fun newItem(
  drawable: Int = 0,
  checkedDrawable: Int = 0,
  text: String
): BaseTabItem {
  val mainTab =
    UiSpecialTab(
      this
    )
  mainTab.initialize(drawable, checkedDrawable, text)
  mainTab.setTextDefaultColor(findColor(R.color.ig_color_969799))
  mainTab.setTextCheckedColor(findColor(R.color.ig_color_ff4c00))
  return mainTab
}

/**
 * 底部导航栏
 */
private fun initNavigation() {
  initNavigationController()
  val mainAdapter = ViewPager2ManagerAdapter(
    this
  )
  mainAdapter.setData(getFragments())
  viewBinding.mainContainer.adapter = mainAdapter
  viewBinding.mainContainer.isUserInputEnabled = false

  navigationController.addTabItemSelectedListener(object : OnTabItemSelectedListener {
    override fun onSelected(index: Int, old: Int) {
      // 按Index做item匹配
      when (index) {
        TAB_INDEX_HOME -> {
          StatusBarUtils.setUpStatusBar(this@UiPageNavigationActivity, true, true, true)
          StatusBarUtils.setStatusBarColor(this@UiPageNavigationActivity, Color.WHITE)
        }
        // ······
        else -> {
          //default, do nothing
        }
      }
      viewBinding.mainContainer.setCurrentItem(index, false)
    }

    override fun onRepeat(index: Int) {
    }
  })
}
```

