# RoundButton - 圆角渐变按钮

## XML 

```xml
<com.guang.max.widget.button.RoundButton
  android:id="@+id/button"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
                                         
  // 圆角                                      
  app:bgColor="背景色"
  app:radius="所有的四个圆角大小"
  app:radiusTopLeft="左上圆角大小，其他三个命名方式相同"
                                         
  // 边框                                       
  app:borderWidth="边框宽度"
  app:borderColor="边框颜色"
  app:borderColor_disable="禁用时边框颜色"
                                         
  // 纯色背景                                       
  app:bgColor="可用时纯色背景"
  app:bgColor_disable="禁用时纯色背景"
                                         
  // 渐变背景
  app:gradientOrientation="渐变方向，支持八个方向"
  app:bgStartColor="渐变起始颜色"
  app:bgEndColor="渐变终止颜色"      
  app:bgStartColor_disable="禁用时渐变起始颜色"
  app:bgEndColor_disable="禁用时渐变终止颜色" />
```

## 说明

1. 默认提供两种常用样式：`style`

   使用：

   ```xml
   // 样式一 ： 渐变色按钮风格
   <com.guang.max.widget.button.RoundButton
     style="@style/BaseGradientButtonStyle"
     android:layout_width="match_parent"
     android:layout_height="64dp" />
   
   // 样式二 ： 带边框按钮风格
   <com.guang.max.widget.button.RoundButton
     style="@style/BaseBorderButtonStyle"
     android:layout_width="match_parent"
     android:layout_height="64dp" />
   ```

   

2. `gradientOrientation`方向参数：

   ```xml
   <attr name="gradientOrientation" format="enum">
     <enum name="TOP_BOTTOM" value="1"/>
     <enum name="TR_BL" value="2"/>
     <enum name="RIGHT_LEFT" value="3"/>
     <enum name="BR_TL" value="4"/>
     <enum name="BOTTOM_TOP" value="5"/>
     <enum name="BL_TR" value="6"/>
     <enum name="LEFT_RIGHT" value="7"/>
     <enum name="TL_BR" value="8"/>
   </attr>
   ```

   

