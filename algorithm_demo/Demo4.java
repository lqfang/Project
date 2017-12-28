package com.amaker.algorithm_demo;


import java.util.Scanner;

/*
* 有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
（约瑟夫环问题，百度百科有时间复杂度最简单的数学方法）
* */
public class Demo4 {

    public static void main(String[] args) {
        System.out.println("请输人数n：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] arr = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true; //下标为TRUE时说明还在圈里
        }
        int leftCount = n;
        int countNum = 0;
        int index = 0;
        while (leftCount > 1) {
            if (arr[index] == true) { //当在圈里时
                countNum++;  //报数递加
                if (countNum == 3) { //报数为3时
                    countNum = 0; //从零开始继续报数
                    arr[index] = false; //此人退出圈子
                    leftCount--; //剩余人数减一
                }
            }
            index++; //每报一次数，下标加一
            if (index == n) { //是循环数数，当下标大于n时，说明已经数了一圈，
                index = 0; //将下标设为零重新开始。
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
    }
}
