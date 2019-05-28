package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * [神奇的口袋]
 *
 * 物品的总体积必须是40。John现在有n个想要得到的物品，
 * 每个物品的体积分别是a1，a2……an。John可以从这些物品中选择一些，
 * 如果选出的物体的总体积是40，那么利用这个神奇的口袋，John就可以得到这些物品。
 * 现在的问题是，John有多少种不同的选择物品的方式。
 */

/**
 * 像斐波那契数一样，用递归把每个物品分为两个可能，加入和不加入
 */

public class Mypackage {

        private static int count = 0;
        private static int[] goods;
        private static int n;

        public static void main(String[] args){

            Scanner in =  new Scanner(System.in);

            //添加到数组中
            while (in.hasNextInt()){
                n = in.nextInt();
                goods = new int[n+1];
                for (int i=0; i<=n; i++ ){
                    goods[i] = in.nextInt();
                }
            }
                //递归
            count(40,n);
            System.out.println(count);
        }
        //要装入的重量，可以选择的个数
        private static void count(int sum, int n){
            //定义出口:正好装满，直接返回
            if(sum ==0){
                count++;
                return;
            }
            if(sum<0 ||(n<1 && sum >0)){
                return;
            }

            //递归
            //选择这个物品,40减去这个物品的重量，可以选择的个数-1
            count(sum-goods[n],n-1);
            //不选择这个物品，重量不变，可选择个数-1
            count(sum,n-1);
        }
    }
