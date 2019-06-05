package day12;


import java.util.ArrayList;

/**
 *
 * 在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同，
 * 则称这种编码为格雷码(Gray Code)，请编写一个函数，
 * 使用递归的方法生成N位的格雷码。
 * 给定一个整数n，请返回n位的格雷码，顺序为从0开始
 *
 * 通过
 */
public class GrayCode {
    public String[] getGray(int n) {
        //结果指针
        String[] result ;
        //出口
        if(n == 1){
            result = new String[]{"0","1"};
        }
        else{
            //接收结果
            String[] str = getGray(n-1);
            //为本次递归开辟空间
            result = new String[str.length*2];
            //从头到尾：加0的在前，加1的从后往前。
            //这样才保证相邻两个数只差一位二进制位
            for (int i=0; i<str.length; i++){
                result[i] = "0"+str[i];
                result[result.length-1-i] = "1"+str[i];
            }
        }
        //返回本次结果
        return result;
    }
}
