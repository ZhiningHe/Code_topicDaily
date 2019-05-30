package day10;

import java.util.*;


/**
 * 在一个网格里，机器人要从左上走到左下
 * 而且只能向右、向下走
 * 返回走法的数
 *
 * 通过
 */
public class Robot {
    private static int count =0;
    public static int countWays(int x, int y) throws Exception {
        if((x+y) >12 || x<0 || y<0){
            throw new Exception("错误");
        }
        return count(x,y);
    }
    private static int count(int x, int y){
        //一条路成功
        if(x ==1 && y==1){
            return 1;
        }
        //路不通
        if(x< 1 || y< 1){
            return 0;
        }
        //从右下角向左上角，向左、向上
        return count(x,y-1) + count(x-1,y);
    }

    public static void main(String[] args) {
        try {
            System.out.println(countWays(2,2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
