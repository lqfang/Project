package com.amaker.algorithm_demo;

/*
* 打印出如下图案（菱形）
1.程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重for循环，第一层控制行，第二层控制列。
  菱形：
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


//        三角形：
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
