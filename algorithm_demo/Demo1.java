package com.amaker.algorithm_demo;

/*
*��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ������ĸ��º�ÿ��������һ�����ӣ�
* �������Ӷ���������ÿ���µ���������Ϊ���٣�
* */

public class Demo1 {

    public static void main(String args[]) {
        math mymath = new math();
        for (int i = 1; i <= 20; i++)
            System.out.println(mymath.f(i));
    }

    static class math {
        public int f(int x) {
            if (x == 1 || x == 2)
                return 1;
            else
                return f(x - 1) + f(x - 2);
        }
    }

}
