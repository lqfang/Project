package com.amaker.algorithm_demo;

import java.util.Scanner;

/*
* 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
1.程序分析：利用for循环语句,if条件语句。
* */
public class Demo8 {
    public static void main(String args[]) {
        System.out.println("请输入一个字符串;");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] ch = str.toCharArray();
        count use = new count();
        use.count(ch);
    }

    static class count {
        int digital, character, blank, other;

        public void count(char[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= '0' && arr[i] <= '9') {
                    digital++;
                } else if ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) {
                    character++;
                } else if (arr[i] == ' ') {
                    blank++;
                } else {
                    other++;
                }
            }
            System.out.println("数字个数：" + digital);
            System.out.println("英文字母个数：" + character);
            System.out.println("空格个数：" + blank);
            System.out.println("其他字符个数：" + other);
        }
    }

}

