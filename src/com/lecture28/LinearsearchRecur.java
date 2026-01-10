package com.lecture28;

import java.util.ArrayList;

public class LinearsearchRecur {
    static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 6, 7};
//        System.out.println(linearsearch(arr, 6, 0));
//        System.out.println(findindex(arr,6,0));
//        System.out.println(findindexlast(arr,6,0));
//        findallindex(arr,6,0);
//        System.out.println(list);
//        System.out.println(findallindex(arr,6,0,new ArrayList<>()));
        System.out.println(findallindex2(arr,6, 0));

    }

    static boolean linearsearch(int[] arr, int target, int index){
        if(index == arr.length -1 ){
            return false;
        }
        return arr[index] == target || linearsearch(arr, target, index + 1);
    }

    static int findindex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target ){
            return index;
        } else {
            return findindex(arr, target, index + 1);
        }
    }

    static int findindexlast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target ){
            return index;
        } else {
            return findindexlast(arr, target, index + 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findallindex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target ){
           list.add(index);
        }
        findallindex(arr, target, index + 1);
    }

    static ArrayList<Integer> findallindex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target ){
            list.add(index);
        }
        return findallindex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findallindex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target ){
            list.add(index);
        }
       ArrayList<Integer> ans = findallindex2(arr, target, index + 1);

        list.addAll(ans);
        return list;
    }
}
