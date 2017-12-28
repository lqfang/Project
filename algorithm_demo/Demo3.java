package com.amaker.algorithm_demo;


/*
* 打印出所有的 水仙花数 ，所谓 水仙花数 是指一个三位数，其各位数字立方和等于该数本身。
* 例如：153是一个 水仙花数 ，因为153=1的三次方＋5的三次方＋3的三次方。
1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
* */
public class Demo3 {
    public static void main(String args[]) {

//        //方法一
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

        //方法二
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
        System.out.print("三位数的水仙花数一共有: "+n+" 个");
    }
}
