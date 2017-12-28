package com.amaker.algorithm_demo;


/*
* 海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子平均分为五份，多了一个，
* 这只猴子把多的一个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，
* 又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
* */
//public class Demo5 {
//
//    static int ts = 0;// 桃子总数
//    static int fs = 1;// 记录分的次数
//    static int hs = 5;// 猴子数
//    static int tsscope = 5000;// 桃子数的取值范围，太大容易溢出。
//    public static int fT(int t) {
//        if (t == tsscope) {
//            // 当桃子数到了最大的取值范围时取消递归
//            System.out.println("结束");
//            return 0;
//        } else {
//            if ((t - 1) % hs == 0 && fs <= hs) {
//                if (fs == hs) {
//                    System.out.println("桃子数=" + ts + "时满足分桃条件");
//                }
//                fs += 1;
//                return fT((t - 1) / 5 * 4);// 返回猴子拿走一份后的剩下的总数
//            } else {
//                // 没满足条件
//                fs = 1;// 分的次数重置为1
//                return fT(ts += 1);// 桃子数加+1
//            }
//        }
//    }
//    public static void main(String[] args) {
//        fT(0);
//    }

    public  class Demo5 {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 6; ; i++) {// 最少6个分最后一次
                sum = i;// 桃子数
                for (int j = 0; j < 5; j++) {// 分的次数循环
                    if ((sum - 1) % 5 == 0 && j < 5) {// 如果扔一个后能均分5份，继续分
                        sum = (sum - 1) / 5 * 4;// 每分一次剩余桃子数
                        if (j == 4) {// 如果已分5次，且仍能除尽，输出，退出程序
                            System.out.println(i);
                            System.exit(0);
                        }
                    }
                }
            }
        }
    }
//}
