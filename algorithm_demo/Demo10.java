package com.amaker.algorithm_demo;

/*
* ��ӡ������ͼ�������Σ�
1.����������Ȱ�ͼ�ηֳ���������������ǰ����һ�����ɣ�������һ�����ɣ�����˫��forѭ������һ������У��ڶ�������С�
  ���Σ�
   *
  ***
 *****
*******
 *****
  ***
   *
* */
public class Demo10 {
    public static void main(String args[]){
        int i = 0;
        int j = 0;
        for (i = 1; i <= 4; i++) {
            for (int k = 1; k <= 4 - i; k++)
                System.out.print( " " );
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (i = 3; i >= 1; i--) {
            for (int k = 1; k <= 4 - i; k++)
                System.out.print( " " );
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}


//        �����Σ�
//        *
//        ***
//        ******
//        ********
//        ******
//        ***
//        *
//public class Demo10 {
//    public static void main(String[] args) {
//        int i=0;
//        int j=0;
//        for ( i = 1; i <= 4; i++) {
//            for ( j = 1; j <= 2 * i - 1; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//        for ( i = 3; i >= 1; i--) {
//            for ( j = 1; j <= 2 * i - 1; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//    }
//}
