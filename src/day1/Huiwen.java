package day1;
import java.util.*;

/**
 *
 *
 * 将字符串str2插入到str1中，判断可以出现的回文串个数
 *
 * 通过
 */

class HuiWen{

    static int huiWen(String str1,String str2){
        int num = 0;
        for(int i=0; i<=str1.length(); i++){
            StringBuffer s = new StringBuffer(str1);
            s.insert(i,str2);
            if(isHuiwen(s.toString())){
                num++;
            }
        }
        return num;
    }

    static boolean isHuiwen(String str){
        if(str ==null || str.length() == 1){
            return false;
        }
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j) ){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }



    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(huiWen(str1,str2));
    }
}