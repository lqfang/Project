package com.amaker.algorithm_demo;

/*
* ��1+2!+3!+...+20!�ĺ͡�
1.����������˳���ֻ�ǰ��ۼӱ�����۳ˡ�
* */
public class Demo12 {
    public static void main(String args[]){
        long sum = 0;
        long fac = 1;
        for (int i = 1; i <= 20; i++) {
            fac = fac * i;
            sum += fac;
        }
        System.out.println(sum);
    }
}
