package com.amaker.algorithm_demo;


/*
* ��ӡ�����е� ˮ�ɻ��� ����ν ˮ�ɻ��� ��ָһ����λ�������λ���������͵��ڸ�������
* ���磺153��һ�� ˮ�ɻ��� ����Ϊ153=1�����η���5�����η���3�����η���
1.�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��
* */
public class Demo3 {
    public static void main(String args[]) {

//        //����һ
//        for (int num=100;num<1000;num++)
//        {
//            int gw=num%10;
//            int sw=num/10%10;
//            int bw=num/100%10;
//            if (gw*gw*gw+sw*sw*sw+bw*bw*bw==num)
//            {
//                System.out.println(num);
//            }
//        }

        //������
        int n=0,x,y;
        for (int i=1; i<=9; i++) {
            for (int j=0; j<=9; j++) {
                for (int k=0; k<=9; k++) {
                    x=i*i*i+j*j*j+k*k*k;
                    y=i*100+j*10+k;
                    if (x==y) {
                        n++;
                        System.out.print(y+" ");
                    }
                }
            }
        }
        System.out.print("��λ����ˮ�ɻ���һ����: "+n+" ��");
    }
}
