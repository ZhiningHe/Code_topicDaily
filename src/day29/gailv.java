package day29;
import java.util.*;

/**
 * 有n个人，每人写一张纸条带有自己的名字
 * 最后随便抓阄，抓到自己算中奖
 * 问最后都没中奖的概率，用**.**%表示
 *
 * idea通过
 *
 */
    // write your code here
    class Main{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int nums = in.nextInt();
            if(nums<2 || nums>20){
                return;
            }
            double result = gailv(nums);
            System.out.println(result*100.00+"%");
        }
        private static double gailv(int nums){
            if(nums == 0|| nums ==1){
                return 1;
            }
            //没中奖的概率是1-中奖的概率
            return (1-1.0/nums)*gailv(--nums);
        }
    }
