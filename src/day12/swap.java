package day12;


import java.util.Arrays;

/**
 * 函数内不使用任何临时变量，直接交换两个数的值。
 * 给定一个int数组AB，其第零个元素和第一个元素为待交换的值，请返回交换后的数组。
 */
public class swap {
    //方法1：位运算，c = a^b相当于解得一个钥匙； 因为 a^c=b  b^c=a
    //方法2：加减运算，a = a+b ；
    // b = a-b = a+b-b = a； b交换成功
    // a = a-b = a+b-a = b； a交换成功
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] = AB[0]^AB[1];
        AB[1] = AB[0]^AB[1];
        AB[0] = AB[0]^AB[1];
        return AB;
    }
}
