## TagFlexboxLayout - 流式标签布局

## XML Code

```xml
<com.guang.max.widget.flextbox.TagFlexboxLayout
  android:id="@+id/tagBox"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:layout_marginTop="@dimen/ig_dp_12"
  app:alignContent="flex_start"
  app:flexDirection="row"
  app:flexWrap="wrap"
  app:flow_horizontalAlign="start"
  app:justifyContent="flex_start"
  app:layout_constraintEnd_toEndOf="parent"
  app:layout_constraintStart_toStartOf="parent"
  app:layout_constraintTop_toTopOf="parent"
  tools:layout_height="500dp" />
```

## Kotlin Code

1. 适配器

   ```kotlin
   class CustomAdapter(
     private val item: List<T>,
   ) : TagAdapter<T>(item) {
   
     override fun getView(parent: FlexboxLayout, position: Int, item: T): View {
       	
     }
   
     override fun getViewLayoutParams(): ViewGroup.LayoutParams {
   
       return FlexboxLayout.LayoutParams(container.layoutParams).let { params ->
         params.width = ViewGroup.LayoutParams.WRAP_CONTENT
         params.height = ViewGroup.LayoutParams.WRAP_CONTENT
         params.rightMargin = 12.dp
         params.bottomMargin = 12.dp
         params
       }
     }
   }
   ```

2. 初始化

   ```kotlin
   private fun initTagBox() {
     binding.tagBox.apply {
       setAdapter(ViewEventTagFlexBoxAdapter(mList, this).apply {
         mAdapter = this
       })
       setOnTagClickListener(object : TagFlexboxLayout.OnTagClickListener {
         override fun onTagClick(view: View, position: Int, parent: FlexboxLayout) {
           mList.getOrNull(position)?.onEvent?.invoke()
         }
       })
     }
   }
   ```

## 说明

TagFlexBoxLayout含有非常多的可定制属性，包括主轴、主轴对齐方式、副轴、副轴对齐方式，可以在该标签下方的操作中点击具体的按钮进行预览。