package com.code.performance;

import java.util.ArrayList;
import java.util.List;

public class OptimizableToArrayCall {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("demo1");
    list.add("demo2");
    list.add("demo3");


    // 方法1：
    String[] array = list.toArray(new String[list.size()]);

    // 方法2：
    String[] array1 = list.toArray(new String[0]);

    // 总结:
    // 1. 使用旧的JVM（1.6以前）或者非Hotspot的JVM，
    //    创建对应大小的数组所需的反射调用非常慢，所以需要
    //    预先设置大小

    // 2. OpenJDK 1.6之后的做了优化，与之前相比性能相同甚至更好。

  }
}
