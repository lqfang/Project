package com.amaker.algorithm_demo;

/*
* 求1+2!+3!+...+20!的和。
1.程序分析：此程序只是把累加变成了累乘。
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
