package day6;
import java.util.*;

/**
 * 输入A-B B-C A+B B+C，
 *      1  -1  2   3
 * 计算A B C
 *    1 0 2
 *    通过
 */
public class Main{

    static void candy(int a,int b,int c,int d){
        //计算ABC

        if ((a < -30 ||a> 30 ||a%1 !=0) ||
                (b < -30 ||b> 30||b%1 !=0) ||
                (c < -30 ||c> 30||c%1 !=0) ||
                (d < -30 ||d> 30||d%1 !=0)){
            System.err.println("超出限制！");

        }
        int B = (c-a)/2;
        int C = (d-b)/2;
        int A = a+B;
        //如果ABC都是整数则存在
        if(A%1 ==0 && B%1==0 && C%1==0){
            System.out.println(A+" "+B+" "+C);
        }else{
            System.out.println("No");
        }
    }



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String[] slip;
        slip = text.split(" ",4);
        int a = Integer.parseInt(slip[0]);
        int b = Integer.parseInt(slip[1]);
        int c = Integer.parseInt(slip[2]);
        int d = Integer.parseInt(slip[3]);
        candy(a,b,c,d);
    }
}
