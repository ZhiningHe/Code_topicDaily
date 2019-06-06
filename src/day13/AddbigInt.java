package day13;

import java.math.BigInteger;
import java.util.Scanner;


/**
 * 大数相加
 * 利用BigInteger类
 *
 * 通过
 */
class Main1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            BigInteger n1 = new BigInteger(s1);
            BigInteger n2 = new BigInteger(s2);
            System.out.println(n1.add(n2));
        }
    }
}