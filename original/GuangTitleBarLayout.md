## GuangTitleBarLayout - 导航栏

## Kotlin Code

```kotlin
// 展示部分
GuangTitleBarLayoutBuilder.builder(ctx)
	// 底部分割线是否展示
	.changeLineStatus(Boolean)
	
	// 左侧
	.changeIvLeftStatus(Boolean)// 是否含有左侧图标按钮
	.setIvLeft(drawableId)// 左侧图标

	// 中间
  .setBarTitle(String) // 中心标题    
  .setIvTitleRight(Drawable) // 标题右侧的一个小图标

	// 右侧
	.setIvRight(R.drawable.ui_icon_setting) // 右侧的小图标
	.setRightTxt(String) // 右侧的文字
  .setRightTxtColor(Color) // 右侧文字颜色
	
  .setIvRight(drawableId) // （从右往左数）右侧的第一个图标
  .setIvRightTwo(drawableId)// 第二个图标

	// 点击事件
	//左侧ImageView
  .setIvLeftClickListener()
 	// 右边ImageView
  .setIvRightClickListener()
	// 右边TextView
  .setRightTxtClickListener()
	// 标题右边的TextView
  .setIvTitleRightClickListener()
	// 标题右边的第二个TextView
  .setIvRightTwoClickListener()
```