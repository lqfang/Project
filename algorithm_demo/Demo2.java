package com.amaker.algorithm_demo;


/*
* �ж�101-200֮���ж��ٸ����������������������
1.����������ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ����������������������������֮��������
* */
public class Demo2 {

    public static void main(String args[]) {

    boolean flag = true;
    int primeNum = 0;
        for(int i = 101 ; i < 201 ; i++){
        flag = isPrime(i);

        if(flag == true){
            //������
            System.out.println("101-200֮��������У�" + i);
            primeNum++;
        }
    }
        System.out.println("101-200֮��������������У�"+primeNum);

}

    public static boolean isPrime(int x){
        boolean flag = true;

        for(int i = 2 ; i <= Math.sqrt(x) ; i++){
            if(x % i == 0){
                flag = false;   //��������
            }
        }

        return flag;
    }
}
