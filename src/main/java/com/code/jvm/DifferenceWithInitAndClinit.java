package com.code.jvm;

public class DifferenceWithInitAndClinit {

    static String A = "aaa"; // <clinit>

    static {
        // <clinit>
    }

    private int x = 1;   // <init>

    DifferenceWithInitAndClinit() {
        // <init>
    }

    // 总结:
    // <init> 代表着所有的构造函数,和非静态字段的初始化;
    // <clinit> 代表着静态代码块的初始化,和警惕字段的初始化;

}

