package com.amaker.algorithm_demo;


/*
* ��̲����һ�����ӣ���ֻ�������֡���һֻ���Ӱ��������ƽ����Ϊ��ݣ�����һ����
* ��ֻ���ӰѶ��һ�����뺣�У�������һ�ݡ��ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ�
* �ֶ���һ������ͬ���Ѷ��һ�����뺣�У�������һ�ݣ����������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
* */
//public class Demo5 {
//
//    static int ts = 0;// ��������
//    static int fs = 1;// ��¼�ֵĴ���
//    static int hs = 5;// ������
//    static int tsscope = 5000;// ��������ȡֵ��Χ��̫�����������
//    public static int fT(int t) {
//        if (t == tsscope) {
//            // ����������������ȡֵ��Χʱȡ���ݹ�
//            System.out.println("����");
//            return 0;
//        } else {
//            if ((t - 1) % hs == 0 && fs <= hs) {
//                if (fs == hs) {
//                    System.out.println("������=" + ts + "ʱ�����������");
//                }
//                fs += 1;
//                return fT((t - 1) / 5 * 4);// ���غ�������һ�ݺ��ʣ�µ�����
//            } else {
//                // û��������
//                fs = 1;// �ֵĴ�������Ϊ1
//                return fT(ts += 1);// ��������+1
//            }
//        }
//    }
//    public static void main(String[] args) {
//        fT(0);
//    }

    public  class Demo5 {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 6; ; i++) {// ����6�������һ��
                sum = i;// ������
                for (int j = 0; j < 5; j++) {// �ֵĴ���ѭ��
                    if ((sum - 1) % 5 == 0 && j < 5) {// �����һ�����ܾ���5�ݣ�������
                        sum = (sum - 1) / 5 * 4;// ÿ��һ��ʣ��������
                        if (j == 4) {// ����ѷ�5�Σ������ܳ�����������˳�����
                            System.out.println(i);
                            System.exit(0);
                        }
                    }
                }
            }
        }
    }
//}
