package day11;

import java.util.Scanner;


/**
 * 请编写程序统计每种不同的个位数字出现的次数。
 * 例如：给定N = 100311，则有2个0，3个1，和1个3。
 *
 * 通过
 */
class Main{
    //因为int长度有限，所以转化成字符数组
    public static void main(String[] args) {
        //用来存储0-9的次数
        int[] count = new int[10];
        //读取原数
        Scanner in = new Scanner(System.in);
        char[] number = in.nextLine().toCharArray();
        //直到最后一位
        int k=0;
        while (k <number.length){
            //对应数组+1
            count[number[k]-'0']++;
            k++;
        }
        for(int i=0; i<10; i++){
            if(count[i] != 0){
                System.out.println(i+":"+count[i]);
            }
        }
    }
}