## XShadow - 阴影容器

可嵌套在其他控件外层，实现四周阴影效果，需要注意的是，**容器内部的子view需要设置padding**，**且距离与阴影宽度、圆角一致**，否则阴影不显示，特性如下：

- 指定阴影颜色`shadow_color`

- 指定阴影圆角 `shadow_radius`

- 指定阴影内圆角` corner_radius`

- 指定阴影宽度 `shadow_width`

- 指定阴影显示的边 

  `shadow_side`属性，可自由组合 

  - all 全部边
  - left 左边
  - right 右边
  - top 上边
  - bottom 下边

## XML Code

```xml
<com.guang.max.widget.container.xshadow.XShadow
  android:id="@+id/xShadow11"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
 
  app:corner_radius="内圆角（即边框圆角）"
  app:shadow_color="阴影颜色"
  app:shadow_radius="外圆角（即阴影扩散后形成的圆角）"
  app:shadow_width="阴影宽度"
	app:shadow_side="bottom|left|right" >                                            
                                              
  <Button
    android:layout_width="100dp"
    android:layout_height="100dp"
    android:background="@color/ig_transparent"
    android:text="@string/ui_set_color_3296f1" />

</com.guang.max.widget.container.xshadow.XShadow>
```