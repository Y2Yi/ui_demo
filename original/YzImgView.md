## YzImgView - 图片展示组件

## XML Code

```xml
<com.youzan.yzimg.YzImgView
  android:id="@+id/ivDefault"
  android:layout_width="@dimen/ig_dp_100"
  android:layout_height="@dimen/ig_dp_100"
  
  // 图片加载相关
  app:yzimg_imageDrawable="默认图，请使用该属性替代src属性。否则圆角、圆形等设置不会生效"
  app:yzimg_placeholderDrawable="占位图"
  app:yzimg_failureDrawable="加载失败图"
                            
  // 圆角
  app:yzimg_asCircle="是否显示为圆形"             
  app:yzimg_roundedCornerRadius="指定圆角的大小"
                            
  // 单独的圆角设置
  app:yzimg_roundedBottomLeft="false"
  app:yzimg_roundedBottomRight="false"
  app:yzimg_roundedTopLeft="false"
  app:yzimg_roundedTopRight="true"
                            
  // 边框
  app:yzimg_roundedBorderColor="边框颜色"
  app:yzimg_roundedBorderWidth="边框宽度"                          
                            
  // 图片的宽高比                          
  app:yzimg_aspectRatio="宽高比"
                            
  // resize
  app:yzimg_autoResize="是否按照控件尺寸去远端加载合适大小的图片"
                            
 	// 高斯模糊       
  app:yzimg_isBlur="是否模糊"
  app:yzimg_blurRadius="模糊半径，默认12"
  app:yzimg_blurSampleRatio="采样率，默认0.5f"
     
  // GIF                          
  app:yzimg_isGif="GIF标志" />
```

## 说明

1. **ScaleType**只支持`center_crop`类型。



