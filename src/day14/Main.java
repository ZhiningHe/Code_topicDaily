package day14;

/**
 * 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 * 例如：
 * 1^3=1
 * 2^3=3+5
 * 3^3=7+9+11
 * 4^3=13+15+17+19
 *
 *
 * 通过
 */

import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println(GetSequeOddNum(in.nextInt()));
    }
    public static String GetSequeOddNum(int m)
    {
        /*在这里实现功能*/
        int first = m*m+1-m;
        int tmp = first;
        StringBuffer result = new StringBuffer();
        for(int i =m; i>1; i--){
            result.append(tmp).append('+');
            tmp += 2;
        }
        result.append(tmp);
        String res = result.toString();
        return res;
    }
}
