package com.amaker.algorithm_demo;

/*
* ��һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡�
1.�����������ץס�������ĸ�ı仯���ɡ�
* */
public class Demo11 {
    public static void main(String args[]){
        float fm = 1.0f;
        float fz = 1.0f;
        float temp;
        float sum = 0f;
        for (int i = 0; i < 20; i++) {
            temp = fm;
            fm = fz;
            fz = fz + temp;
            System.out.println((int) fz + "/" + (int) fm);
            sum += fz / fm;
        }
        System.out.println(sum);
    }
}
