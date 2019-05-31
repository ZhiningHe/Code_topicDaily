package day9;


/**
 * /**
 *  * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？
 *  * 比如: n = 10; n! = 3628800,所以答案为2
 *  *
 *  * 2*5=10; 有5即有10
 *
 *  通过
 *  */

import java.util.Scanner;

public class zeroNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        for(int i=n; i>=5; i--){
            int tmp = i;
            while(tmp%5 ==0){
                count++;
                tmp /= 5;
            }
        }
        System.out.println(count);
    }
}
