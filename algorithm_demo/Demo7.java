package com.amaker.algorithm_demo;

import java.util.Scanner;

/*
* 求s = a + aa + aaa + aaaa + aa...a的值，其中a是一个数字。
* 例如2 + 22 + 222 + 2222 + 22222(此时共有5个数相加)，几个数相加有键盘控制。
1.程序分析：关键是计算出每一项的值。
* */
public class Demo7 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入a的值");
        int a = in.nextInt();
        System.out.println("请输入n个数");
        int n = in.nextInt();
        int s = 0,t=0;
        for (int i = 1; i <= n; i++) {
            t += a;
            a = a*10;
            s += t;
        }
        System.out.println(s);
    }
}
