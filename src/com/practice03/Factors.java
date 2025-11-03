package com.practice03;

import java.util.ArrayList;
import java.util.Arrays;

public class Factors {
    public static void main(String[] args) {
        int n = 12;
//        System.out.println(factorofnum(n));
        System.out.println(Arrays.toString(array(n)));

    }
//
//    static int factorofnum(int n){
//        int fac = 1;
//        int i = 1;
//        for(i = 1; i <= n; i++ ){
//            if( n % i == 0 ){
//                fac = i;
//                System.out.print(i + " ");
//            }
//        }
//        return fac;
//    }

    static int[] array(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 1;

        for(i = 1; i <= n; i++ ){
            if( n % i == 0 ){
                ans.add(i);
            }
        }
        int[] sum = new int[ans.size()];
        for (int j = 0; j < ans.size(); j++) {
            sum[j] = ans.get(j);
        }
        return sum;
    }

}
