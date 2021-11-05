## MagicIndicator - Tab页面切换控件

```kotlin
// Fragment Adapter
class UiCustomFragmentAdapter(
  fragmentActivity: FragmentActivity,
  private val fragments: List<UiBaseFragmentUi<*>>
) :
  FragmentStateAdapter(fragmentActivity) {
  override fun getItemCount(): Int {
    return fragments.size
  }

  override fun createFragment(position: Int): Fragment {
    return fragments[position]
  }

}

// 初始化ViewPager
private fun initViewPager() {
  // 添加Fragment
  fragments?.let {
    mViewPagerAdapterUi = UiCustomFragmentAdapter(context as FragmentActivity, it)
  }
  viewPager.adapter = FragmentStateAdapter()
  viewPager.isUserInputEnabled = false //禁止ViewPager手动滑动
  // viewPager.setPageTransformer(StackCardPagerTransFormer()), 切换动画，可选
}

//初始化标题下方导航栏
private fun initNavigator() {
  val navigator = CommonNavigator(context)
  // titleView的填充方式，true:match_parent,false:wrap_content
  navigator.isAdjustMode = Boolean

  navigator.adapter = object : CommonNavigatorAdapter() {
    override fun getCount(): Int {
      return viewPagerTitles.size
    }

    override fun getTitleView(context: Context, index: Int): IPagerTitleView {
      // 用与展示Tab文字的组件
      val titleView = TabTitleView(
        context,
        viewPagerTitles[index],// 词条
        styleConfig.titleViewTextSize, // 文字尺寸，单位是dp，不需要手动.dp
        styleConfig.titleViewInactiveColor,// 未选中时的颜色
        styleConfig.titleViewActiveColor,// 选中时的颜色
        selectBold = true // 选中时加粗
      )
      // 设置Tab中文字与周围的内间距
      titleView.setPadding(
        styleConfig.titleViewHorizontalPadding,
        styleConfig.titleViewVerticalPadding,
        styleConfig.titleViewHorizontalPadding,
        styleConfig.titleViewVerticalPadding,
      )
			
      // 点击事件，通常用于切换下方的ViewPager
      titleView.setOnClickListener {
        viewPager.currentItem = index
      }
      return titleView
    }

    // 设置游标样式
    override fun getIndicator(context: Context): IPagerIndicator {
      val indicator = LinePagerIndicator(context)
      indicator.lineWidth = styleConfig.lineWidth // 线宽，需要.dp
      indicator.lineHeight = styleConfig.lineHeight// 线高，需要.dp
      indicator.roundRadius = styleConfig.lineRoundRadius// 线圆角，需要.dp
      indicator.setColors(styleConfig.lineColor) // 线颜色
      indicator.mode = styleConfig.indicatorWidthStyle // 线与TabTitleView的适配模式
      return indicator
    }
  }

  magicIndicator.navigator = navigator
  ViewPagerHelper.bind(magicIndicator, viewPager)
}
```

## 说明

1. **navigator.isAdjustMode**，如果为true。那么CommonNavigator将会横向撑满MagicIndicator，如果为false，那么类似wrap_content，Tab将会居左显示。

2. **indicator.mode**，indicator指示器的线宽模式，

   ```java
   class LinePagerIndicator{
     public static final int MODE_MATCH_EDGE = 0;   // 占满整个TabTitleView
     public static final int MODE_WRAP_CONTENT = 1;    // 和TabTitleView的文字宽度相同
     public static final int MODE_EXACTLY = 2;  // 预设的线宽，采用lineWidth设置的值
   }
   ```

   