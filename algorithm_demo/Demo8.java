package com.amaker.algorithm_demo;

import java.util.Scanner;

/*
* ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
1.�������������forѭ�����,if������䡣
* */
public class Demo8 {
    public static void main(String args[]) {
        System.out.println("������һ���ַ���;");
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
            System.out.println("���ָ�����" + digital);
            System.out.println("Ӣ����ĸ������" + character);
            System.out.println("�ո������" + blank);
            System.out.println("�����ַ�������" + other);
        }
    }

}

