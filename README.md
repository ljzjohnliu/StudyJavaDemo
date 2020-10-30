# StudyJavaDemo

## Android Studio无法执行Java main方法的问题
    方案：修改.idea/gradle.xml文件
    Android Studio使用gradle作为构建工具，所以归根到底还是gradle配置的问题。
    在<GradleProjectSettings>标签下添加<option name="delegatedBuild" value="false" />这行配置，然后给新项目添加这行配置，运行代码发现成功了。
    
    
## 八种排序算法原理及Java实现
    https://juejin.im/post/6844903687932887053