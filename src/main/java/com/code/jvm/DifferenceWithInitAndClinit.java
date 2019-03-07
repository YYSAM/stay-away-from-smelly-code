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
    //    <init> is the (or one of the) constructor(s) for the instance, and non-static field initialization.
    //
    //    <clinit> are the static initialization blocks for the class, and static field initialization.
}

