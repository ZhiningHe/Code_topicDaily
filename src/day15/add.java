package day15;

/**
 * 不用运算符 算出A+B的值
 * 思路：用位运算
 * ^代表相加 &代表进位 所以和就等于相加结果+进位结果
 * 结束：如果进位结果为0，那么结果就是相加
 *
 * 通过
 */
public class add {
    public int addAB(int A,int B){
        //进位结果若是为0
        if(B==0) return A;
        if(A==0) return B;
        //相加
        int a = A^B;
        //进位，算的是向前一位进的位
        int b = (A&B) <<1;
        //对应位置的两个数相加
        return addAB(a,b);
    }
}
