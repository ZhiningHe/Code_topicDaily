package day13;

import java.util.*;

/**
 * 打印正方形
 *
 * 通过
 */
 class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char a = in.next().toCharArray()[0];

        if(n<3 || n>20){
            return;
        }


        /**
         * 方法1：
         */
        //打印第一行
//        for(int i=0; i<n; i++){
//            System.out.print(a);
//        }
//        System.out.println();
//        int row =(int) Math.ceil((double) n/2);
//        for(int i =0; i<row-2; i++){
//            System.out.print(a);
//            for (int j=0; j<n; j++){
//                System.out.print(" ");
//            }
//            System.out.println(a);
//        }
//        //输出最后一行
//        for(int i=0; i<n; i++){
//            System.out.print(a);
//        }


        /**
         * 方法2：
         */
        int col = (n+1)/2;
        for (int i=0; i<col; i++){
            for (int j=0; j<n; j++){
                if(i==0 ||j==0||i==col-1 ||j==n-1){
                    System.out.print(a);
                }else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
 }
