package day8;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 输出数组里最小的k个数
 *
 * 输入： n个数 k
 * 输出： 按升序
 *
 * 通过
 */
class Main1{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String string = in.nextLine();
        String[] str = string.split(" ");
        int[] data = new int[str.length-1];
        int k = Integer.parseInt(str[str.length-1]);
        for (int i=0; i<str.length-1; i++){
            data[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(data);
        for (int i=0; i<k; i++){
            System.out.print(data[i]+" ");
        }
        //3 9 6 8 -10 7 -11 19 30 12 23 5
    }
}
