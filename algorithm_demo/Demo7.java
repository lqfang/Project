package com.amaker.algorithm_demo;

import java.util.Scanner;

/*
* ��s = a + aa + aaa + aaaa + aa...a��ֵ������a��һ�����֡�
* ����2 + 22 + 222 + 2222 + 22222(��ʱ����5�������)������������м��̿��ơ�
1.����������ؼ��Ǽ����ÿһ���ֵ��
* */
public class Demo7 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("������a��ֵ");
        int a = in.nextInt();
        System.out.println("������n����");
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
