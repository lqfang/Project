package com.amaker.algorithm_demo;


/*
* 判断101-200之间有多少个素数，并输出所有素数。
1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
* */
public class Demo2 {

    public static void main(String args[]) {

    boolean flag = true;
    int primeNum = 0;
        for(int i = 101 ; i < 201 ; i++){
        flag = isPrime(i);

        if(flag == true){
            //是素数
            System.out.println("101-200之间的素数有：" + i);
            primeNum++;
        }
    }
        System.out.println("101-200之间的素数数量共有："+primeNum);

}

    public static boolean isPrime(int x){
        boolean flag = true;

        for(int i = 2 ; i <= Math.sqrt(x) ; i++){
            if(x % i == 0){
                flag = false;   //不是素数
            }
        }

        return flag;
    }
}
