package com.code.jvm;

import java.lang.reflect.Method;

// 定义一个范型接口
interface Parent<T> {
    T bridgeMethod(T param);
}

// 定义一个类实现范型接口
class Child implements Parent<String> {
    public String bridgeMethod(String param) {
        return param;
    }
}

// 测试方法
public class BridgeMethodIntroduction {
    public static void main(String[] args) throws Exception {
        // 使用java的多态
        Parent parent = new Child();
        System.out.println(parent.bridgeMethod("abc123"));// 调用的是实际的方法
        Class<? extends Parent> clz = parent.getClass();
        Method method = clz.getMethod("bridgeMethod", Object.class); // 获取桥接方法
        System.out.println(method.isBridge()); // true
        System.out.println(method.invoke(parent, "hello")); // 调用的是桥接方法
        System.out.println(parent.bridgeMethod(new Object()));// 调用的是桥接方法, 会报ClassCastException: java.lang.Object cannot be cast to java.lang.String`错误`
    }
}