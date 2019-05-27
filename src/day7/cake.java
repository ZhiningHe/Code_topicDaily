package day7;

import java.util.Scanner;

/**
 * [不要二]
 * 输入  W (列) H（行）
 * 输出 半径为2的地方不能放蛋糕，最多存放蛋糕的个数
 *
 * 成功
 */
public class cake {

}


class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();
        int[][] data = new int[H][W];
        if(W<1 ||H>1000){
            System.err.println("输入错误！");
        }
        //行
        for (int i =0; i < H; i++){
            //列
            for (int j=0; j<W; j++){

                if(data[i][j] == 2){
                    continue;
                }else {
                    if (i + 2 < H) {
                        data[i + 2][j] = 2;
                    }
                    if (i - 2 >= 0) {
                        data[i - 2][j] = 2;
                    }
                    if (j - 2 >= 0) {
                        data[i][j - 2] = 2;
                    }
                    if (j + 2 < W) {
                        data[i][j + 2] = 2;
                    }
                }
            }
        }
        int count2 = 0;
        //行
        for (int i =0; i < H; i++) {
            //列
            for (int j = 0; j < W; j++) {
                if(data[i][j] == 2){
                    count2++;
                }
            }
        }
        System.out.println(W*H-count2);
    }
}