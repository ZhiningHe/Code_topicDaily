package day10;

import java.util.Scanner;


/**
 * 输入一个数
 * 求最少+1或者-1几次能变成一个斐波那契数
 *
 * 通过70
 */
public class Q1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //边界值判断
        if(n<1 || n>1000000){
            return;
        }
        //最小的距离
        int min =n;
        //斐波那契数的最新值
        int num = 0;
        //存放第一个数
        int i=1;
        //存放第二个数
        int j;

        while(true){
            //出口，超过[-n,n]这个区域就直接跳出
            if(num/n == 2){
                break;
            }

            //n在num左边的n长的区域
            if(n<num && (num/n == 1)){
                //步数
                int tmp =num%n;
                //刷新min
                if(min>tmp){
                    min = tmp;
                }
            }
            //n在num右侧的n长度的区域
            else if(num!=0 && n >num && (n/num == 1) ){
                //步数
                int tmp =n%num;
                //刷新min
                if(min>tmp){
                    min = tmp;
                }
            }
           //求取下一个斐波那契数
            j = num;
            num = num+i;
            i = j;
        }
        //输出最小步数
        System.out.println(min);
    }
}
