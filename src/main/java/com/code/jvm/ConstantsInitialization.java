package com.code.jvm;

public class ConstantsInitialization {

    private static final String aaa = "aaa";

    private static String bbb = "bbb" ;

    private String ccc = "ccc" ;

    public static void main(String[] args) {
        // 有什么区别?
        // 谁会在<init>, 谁会在<clinit>,
        // 或者还有别的情况么?
    }

    // 结论:
    // aaa 字段的初始化在"链接"阶段就完成了, 直接在常量池初始化成功.
    // 具体请查看下面字节码中 #9,#10,#11

//   #8 = Utf8               aaa
//   #9 = Utf8               Ljava/lang/String;
//  #10 = Utf8               ConstantValue
//  #11 = String             #8             // aaa
//  #12 = Utf8               bbb
//  #13 = Utf8               ccc
//  #14 = Utf8               <init>

    // 同时可以在下面代码中看到常量的标识情况:

//    private static final java.lang.String aaa = "aaa";
//    descriptor: Ljava/lang/String;
//    flags: ACC_PRIVATE, ACC_STATIC, ACC_FINAL
//    ConstantValue: String aaa

}
