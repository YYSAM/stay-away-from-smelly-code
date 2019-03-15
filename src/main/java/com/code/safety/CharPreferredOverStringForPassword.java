package com.code.safety;

public class CharPreferredOverStringForPassword {

    // 不推荐
    private String getPassword1() {
        return "*****";
    }

    // 推荐
    private char[] getPassword2() {
        return new char[10];
    }

    // 总结:
    // 1. String 是不可变的,也就意味着GC之前没有好办法防止其他人Dump出来
    // 2. Array 是可以随意擦除的, 当你用完之后就可以清除掉防止泄露
    // 3. 如果不小心打印出来了,那么Array比String更有一定的安全性
    //      String: Password
    //      Array: [C@5829428e
    // 4. 使用Array, 只能说减少攻击者的窗口时间, 但不能完全避免

}
