package com.amaker.algorithm_demo;

import java.util.Scanner;

/*
* ���õݹ鷽����5!��
1.����������ݹ鹫ʽ��f(n)=f(n-1)*4!
* */
public class Demo13 {
    public static void main(String args[]){
        System.out.println("������һ������");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n + "�Ľ׳�Ϊ��" + fac(n));
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
