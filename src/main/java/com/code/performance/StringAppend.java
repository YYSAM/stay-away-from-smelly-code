package com.code.performance;

public class StringAppend {

    public static void main(String[] args) {

        String value = "aa" ;
        value = value + "bb";
        System.out.println( value);

        //Java8 反编译结果:
/*
       3: new           #3 // class java/lang/StringBuilder
       6: dup
       7: invokespecial #4 // Method java/lang/StringBuilder."<init>":()V
      10: aload_1
      11: invokevirtual #5 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: ldc           #6 // String bb
      16: invokevirtual #5 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      19: invokevirtual #7 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      22: astore_1
      23: getstatic     #8 // Field java/lang/System.out:Ljava/io/PrintStream;
      26: aload_1
      27: invokevirtual #9 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
*/
        // 结论:
        // 在Java8 以上的虚拟机已经能够在字节码编译的过程中做优化了,
        // 所以针对很多之前的编码规范中需要严格使用StringBuilder
        // 的约束规则的说明,相对来说就变弱了.
        // 同时需要注意的是,多线程情况下还是需要考虑StringBuilder
        // 和StringBuffer的使用场景的.

    }
}
