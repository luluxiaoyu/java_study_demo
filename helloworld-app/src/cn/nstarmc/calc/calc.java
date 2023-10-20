package cn.nstarmc.calc;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 从键盘读入两个整型变量
        System.out.println("请输入第一个整数：");
        int integer1 = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int integer2 = scanner.nextInt();
        // 从键盘读入两个float变量
        System.out.println("请输入第一个浮点数：");
        float float1 = scanner.nextFloat();
        System.out.println("请输入第二个浮点数：");
        float float2 = scanner.nextFloat();
        // 从键盘读入两个double型变量
        System.out.println("请输入第一个双精度浮点数：");
        double double1 = scanner.nextDouble();
        System.out.println("请输入第二个双精度浮点数：");
        double double2 = scanner.nextDouble();
        // 计算整型变量的加减乘除并打印结果
        System.out.println("整数1：" + integer1 + "，整数2：" + integer2);
        System.out.println("加法结果：" + integer1 + " + " + integer2 + " = " + (integer1 + integer2));
        System.out.println("减法结果：" + integer1 + " - " + integer2 + " = " + (integer1 - integer2));
        System.out.println("乘法结果：" + integer1 + " * " + integer2 + " = " + (integer1 * integer2));
        System.out.println("除法结果：" + integer1 + " / " + integer2 + " = " + (integer1 / integer2));
        // 计算float变量的加减乘除并打印结果
        System.out.println("浮点数1：" + float1 + "，浮点数2：" + float2);
        System.out.println("加法结果：" + float1 + " + " + float2 + " = " + (float1 + float2));
        System.out.println("减法结果：" + float1 + " - " + float2 + " = " + (float1 - float2));
        System.out.println("乘法结果：" + float1 + " * " + float2 + " = " + (float1 * float2));
        System.out.println("除法结果：" + float1 + " / " + float2 + " = " + (float1 / float2));
        // 计算double变量的加减乘除并打印结果
        System.out.println("双精度浮点数1：" + double1 + "，双精度浮点数2：" + double2);
        System.out.println("加法结果：" + double1 + " + " + double2 + " = " + (double1 + double2));
        System.out.println("减法结果：" + double1 + " - " + double2 + " = " + (double1 - double2));
        System.out.println("乘法结果：" + double1 + " * " + double2 + " = " + (double1 * double2));
        System.out.println("除法结果：" + double1 + " / " + double2 + " = " + (double1 / double2));
    }
}
