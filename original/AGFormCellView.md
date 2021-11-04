AGFormCellView

## XML Code

```xml
<com.guang.max.widget.form.AGFormCellView
  android:id="@+id/basicStyle1"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  app:fcTitleText="左上标题"
  app:fcDescText="左下描述文字"
  app:fcContentText="右侧描述文字"
  app:fcContentImg="右侧描述文字的图片（20x20）"
  app:fcContentType="右侧描述文字的强弱:hard|weak" //强提示：#646566、弱提示：#c8c9cc
  app:fcRightImg="右侧icon,单独出现（32x32）"    
  app:fcBottomLineVisible="单元格上、下分割线的显示隐藏:true|false" 
  app:fcArrowRightVisible="右侧箭头图标的显示与隐藏:true|false" /> 
```

## 说明

1. **fcRightImg**的尺寸、圆角可通过方法**setRightImgConfig(config)**自定义，一般单独使用，默认隐藏：

   ```kotlin
   // 只配置图片的属性
   agFormCellView10.setRightImgConfig(AGFormCellView.ImageParamConfig(24.dp,24.dp,24.dp))
   
   // 或者手动加载图片
   agFormCellView10.setRightImg(
     "https://img01.yzcdn.cn/upload_files/2021/08/06/FjHeAl0ATuHTl5LVdJ4pj0Xgxepg.jpg",
     AGFormCellView.ImageParamConfig(24.dp, 24.dp, 24.dp)//宽、高、圆角
   )
   ```

2. 右侧的**fcContentText + fcContentImg** 或者是**fcRightImg **不能同时使用。

   



