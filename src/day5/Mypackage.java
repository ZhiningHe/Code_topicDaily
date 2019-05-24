package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mypackage {

    static int myPackage(int n, ArrayList<Integer> goods) {
        //个数
        int goodsNumber = goods.size();
        int[] a = new int[goodsNumber];
        int result = 0;

        //存到int数组里
        for (int i = 0; i < goodsNumber; i++) {
            a[i] = goods.get(i);
        }
        //排序
        Arrays.sort(a);

        for(int i=0; i<goodsNumber; i++){
            int sum = a[i];
            for(int j=i; j<goodsNumber; j++){
                if(sum < 40){
                    sum += a[j];
                }
                else if (sum == 40) {
                    result++;
                } else {
                    break;
                }
            }
        }
        return result;
    }




        public static void main(String[] args){

            /**
             * 这里数据读入有问题
             */
            Scanner in =  new Scanner(System.in);
            int n = Integer.parseInt(in.nextLine());
            ArrayList<Integer> goods = new ArrayList<>();

            for(int i=0; i<n; i++){
                //最多输入40个
                if(in.nextLine()!= null)
                    goods.add(new Integer(Integer.parseInt(in.nextLine())));
                else break;
            }

            if(in.nextLine()!=null){
                System.err.println("输入个数上限！");
            }

            //输出结果
            System.out.println(myPackage(n,goods));
        }
    }
