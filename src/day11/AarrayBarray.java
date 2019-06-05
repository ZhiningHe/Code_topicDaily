package day11;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 即B[i]项等于A数组所有数的乘积，但是去除A[i]项。
 * 由于是乘法，所以直接令A[i]项等于1即可。
 * 代码中加个flag标志做判断即可。
 *
 * 通过
 */
class Main1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        if(in.hasNextInt()){
            A.add(in.nextInt());
        }
        int[] B = new int[A.size()];
        if(A.size() != 0){
            B[0] = 1;
            //上三角
            for (int i=1; i<A.size(); i++){
               B[i] = A.get(i-1)*B[i-1];
            }
            int tmp=1;
            //下三角
            for(int j=A.size()-2; j>=0; j--){
                //由下往上计算
                tmp *= A.get(j+1);
                //B的值是上三角*下三角
                B[j] *= tmp;
            }
        }
    }
}
