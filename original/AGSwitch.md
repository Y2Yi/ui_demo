# AGSwitch - 开关组件

## XML Code

```xml
  <com.guang.max.widget.switchview.AGSwitch
    android:id="@+id/switchDefault"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_marginTop="@dimen/ig_dp_4"
    android:checked="false"
    app:thumbColor="滑块颜色"
    app:thumbSize="滑块尺寸(圆形滑块的直径)"
    app:trackColor="轨道颜色"
    app:trackColor_check="选中时，轨道颜色"
    app:trackHeight="轨道高度"
    app:trackWidth="轨道宽度"
    app:trackRadius="轨道圆角" />
```

## 说明

支持以下特性：

- 设置**轨道宽高**：trackWidth、trackHeight
- 设置**轨道圆角**：trackRadius 默认为trackWidth的一半
- 设置**轨道颜色**：正常颜色 trackColor 默认为#EBEDF0、选中颜色 trackColor_check 默认为#*ff4c00*
- 设置**滑块尺寸**：thumbSize
- 设置**滑块颜色**：thumbColor 默认为#ffffff

使用中需要注意的是，系统测量的**轨道宽度**最小为**滑块宽度**的2倍，目前UI没出规范，如果UI稿不满足这个条件，需要去沟通下。