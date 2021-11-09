## StateView - 状态容器视图

## Kotlin Code

1. 声明各类视图（骨架图、失败、空视图）

```kotlin
internal val skeletonView by lazy {
  SkeletonView(context).bindData(
    R.drawable.ui_home_brand_skeletion
  )
}

internal val failView by lazy {
  FailView(context).bindData {
    ToastUtils.showShort(R.string.ui_state_reload)
    viewModel.queryStringList(0, QueryMode.REPLACE)
  }
}

internal val emptyView by lazy {
  EmptyView(context).also {
    it.setPageType(EmptyView.TYPE_WHOLE_PAGE)
    it.setImgRes(R.drawable.ui_base_icon_no_order)
    it.setDesc(findString(R.string.ui_state_empty))
  }
}
```

2. 声明stateHolder

```kotlin
private val stateHolder: IStateView by lazy {
  // 重写方法获取当前页面的状态View
  StateView.from(object : AgCommonCommonStateAdapter() {

    override fun getEmptyView(context: Context): View {
      return emptyView
    }

    override fun getSkeletonView(context: Context): View {
      return skeletonView
    }

    override fun getNetWorkErrorView(context: Context, retryTask: Runnable?): View {
      return failView
    }
  }).cover(binding.loadContent)
}
```

3. 切换视图

```kotlin
stateHolder.showStatusView(StateType.XXX)

XXX可取：SUCCESS、FAIL、LOADING、EMPTY、SKELETON、INVALID
```