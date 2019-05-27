package day6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输出数组中大于等于n/2 的数
 *
 * 通过
 */
public class Main1 {

    public static void main(String[] args) {
        //将控制台的输入存入到int数组里
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String stringArray[] = inputString.split(" ");
        int num[] = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            num[i] = Integer.parseInt(stringArray[i]);
        }
        find(num);

}

    private static void find(int[] data) {

        //给数组排序
        Arrays.sort(data);
        System.out.println(data[data.length/2-1]);
    }
}
