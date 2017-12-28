package com.amaker.algorithm_demo;

import java.util.Scanner;

/*
* 利用递归方法求5!。
1.程序分析：递归公式：f(n)=f(n-1)*4!
* */
public class Demo13 {
    public static void main(String args[]){
        System.out.println("请输入一个数：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n + "的阶乘为：" + fac(n));
    }

    public static long fac(int n) {
        long value = 0;
        if (n == 1 || n == 0) {
            value = 1;
        } else if (n > 1) {
            value = n * fac(n - 1);
        }
        return value;
    }
}
