package day9;


import java.util.Scanner;

/**
 *
 * 每组测试用例仅包含一组数据，每组数据第一行为原字符串，长度不超过 10
 * 仅包含大小写字符与数字。接下来会有一个数字 n 表示有 n 个操作，
 * 再接下来有 n 行，每行两个整数，表示每次操作的(p , l)。
 * 保证输入的操作一定合法，最后得到的字符串长度不超过 1000。
 *
 *  输入
 * ab
 * 2
 * 0 2
 * 1 3
 *
 * 输出
 * abbaabb
 *
 * 通过
 */
 public class StringReverse{
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         //原字符串
         StringBuilder str = new StringBuilder(in.nextLine());
         //更改次数
         int n = in.nextInt();

         for(int i=0; i<n; i++){
             //读取开始结束位置
             int start = in.nextInt();
             //start+len =end
             int end = start+in.nextInt();
             //截取字符串
             StringBuilder tmp = new StringBuilder(str.substring(start,end)) ;
             str.append(tmp.reverse().toString());
         }
         System.out.println(str);
     }
}
