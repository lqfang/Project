package com.amaker.algorithm_demo;

/*
* 打印出杨辉三角形（要求打印出10行如下图）
1.程序分析：
1
1   1
1   2   1
1   3   3   1
1   4   6   4   1
1   5   10   10   5   1
* */
public class Demo14 {
    public static void main(String args[]) {
        int i, j;
        int a[][];
        int n = 10;
        a = new int[n][n];
        for (i = 0; i < n; i++) {
            a[i][i] = 1;
            a[i][0] = 1;
        }
        for (i = 2; i < n; i++) {
            for (j = 1; j <= i - 1; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.printf(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
