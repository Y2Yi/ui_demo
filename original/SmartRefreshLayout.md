## SmartRefreshLayout - 滑动刷新控件

## XML Code

```xml
<!--使用SmartRefreshLayout将RecyclerView包裹即可； -->
<com.scwang.smart.refresh.layout.SmartRefreshLayout
  android:id="@+id/srlList"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:background="@color/ig_color_F2F3F5">

  <androidx.recyclerview.widget.RecyclerView
    android:id="@+id/rvList"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager" />
</com.scwang.smart.refresh.layout.SmartRefreshLayout>
```

## Kotlin Code

```kotlin
//Adapter需要实现LoadMoreModule接口
class CustomAdapter :
  BaseQuickAdapter<Pair<String, Int>, CustomAdapter.CustomViewHolder>(R.layout.ui_demo_horizontal_item),
  LoadMoreModule {
   //······
  }
  
  
// 禁止掉控件自带的LoadMore模块
viewBinding.srlList.setEnableLoadMore(false)
viewBinding.srlList.setEnableAutoLoadMore(false)
viewBinding.srlList.setOnRefreshListener {
  dataRefresh()// 下拉刷新调用的函数
}

// 启用Adapter的loadMoreModule的加载模块
mCustomAdapter.loadMoreModule.setOnLoadMoreListener {
  loadData()// 加载更多调用的函数
}
```