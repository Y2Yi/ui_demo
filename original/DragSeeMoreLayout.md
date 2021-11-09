## DragSeeMoreLayout - 拖拽查看更多控件

 

## 使用说明

使用时，使用DragSeeMoreLayout包裹RecyclerView即可，需要注意的是拖拽的方向，如果希望实现横向拖拖拽，需要在DragSeeMoreLayout中配置`android:orientation="horizontal"`，纵向同理；如果需要实现隐藏的提示文案，如下图：

<img src="/Users/yzy/pandoc/pangit/original/res/image-20211108194047031.png" alt="image-20211108194047031" style="zoom: 50%;" />

需要将查看更多字样动态地加载到布局当中：

```xml
<com.guang.max.widget.container.DragSeeMoreLayout
  android:id="@+id/drag_layout"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:layout_marginTop="@dimen/ig_dp_8"
  android:orientation="horizontal"
  android:paddingStart="@dimen/ig_dp_10">

  <androidx.recyclerview.widget.RecyclerView
    android:id="@+id/rvList"
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />
</com.guang.max.widget.container.DragSeeMoreLayout>
```

## Kotlin Code

```kotlin
// 配置DragSeeMoreLayout的Drag事件
viewBinding.dragLayout.setOnDragListener(DragSeeMoreLayout.OnDragListener {
  //Load More
  BottomPopupDialog().show(this.supportFragmentManager, null)
})

// 设置加载更多的右侧布局（提示文字：加载更多）
UiHomeItemPromotionFooterSeeMoreBinding.inflate(layoutInflater, viewBinding.dragLayout, true)
```

UiHomeItemPromotionFooterSeeMoreBinding代码如下：

```xml
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
  android:layout_width="wrap_content"
  android:layout_height="80dp">

  <androidx.appcompat.widget.AppCompatImageView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    android:background="@drawable/ui_home_shape_half_left_f7f8fa"
    android:padding="@dimen/ig_dp_10"
    android:src="@drawable/ui_icon_home_ic_see_more" />
</FrameLayout>
```

