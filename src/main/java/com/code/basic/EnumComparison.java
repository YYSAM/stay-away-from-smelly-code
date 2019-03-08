package com.code.basic;

public class EnumComparison {

    private enum EnumType1 {ONE};
    private enum EnumType2 {ONE};

    public static void main(String[] args) {

        EnumType1 type1 = EnumType1.ONE;
        EnumType2 type2 = EnumType2.ONE;
        System.out.println(type1.equals(type2));

        // 总结
        // 1. 从出发者角度来说, 枚举是基于"内容"的比较, 而不是引用
        // 2. 从读者交付来说, == 号比 equals 更易读
        // 3. == 是不会造成空指针的, 而equals则又可能:
        // 4. == 是编译时候做类型的静态检查, 而equals只有运行时才会

        // #3:
        EnumType1 nothing = null;
        if (nothing == EnumType1.ONE); // 执行OK
        if (nothing.equals(EnumType1.ONE)); // 抛 NullPointerException

        // #4:
        if (EnumType1.ONE.equals(EnumType2.ONE)); // 编译OK
        if (EnumType1.ONE == EnumType2.ONE); // 编译失败
    }
}
