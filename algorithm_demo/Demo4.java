package com.amaker.algorithm_demo;


import java.util.Scanner;

/*
* ��n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ��
��Լɪ�����⣬�ٶȰٿ���ʱ�临�Ӷ���򵥵���ѧ������
* */
public class Demo4 {

    public static void main(String[] args) {
        System.out.println("��������n��");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] arr = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true; //�±�ΪTRUEʱ˵������Ȧ��
        }
        int leftCount = n;
        int countNum = 0;
        int index = 0;
        while (leftCount > 1) {
            if (arr[index] == true) { //����Ȧ��ʱ
                countNum++;  //�����ݼ�
                if (countNum == 3) { //����Ϊ3ʱ
                    countNum = 0; //���㿪ʼ��������
                    arr[index] = false; //�����˳�Ȧ��
                    leftCount--; //ʣ��������һ
                }
            }
            index++; //ÿ��һ�������±��һ
            if (index == n) { //��ѭ�����������±����nʱ��˵���Ѿ�����һȦ��
                index = 0; //���±���Ϊ�����¿�ʼ��
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
    }
}
