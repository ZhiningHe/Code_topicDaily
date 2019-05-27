package day7;

import java.util.Scanner;

/**
 * [最小公倍数]
 * 输入： 两个数  5 7
 * 输出： 最小公倍数 35
 *
 * 成功
 */
class Main1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int n =1;
        if(num1==0 || num2==0){
            throw new Exception("输入错误！");
        }
        while (true){
            int num3 = num1*n;
            if(num3 % num2 == 0){
                System.out.println(num3);
                return;
            }
            else{
                n++;
            }
        }
    }
}
