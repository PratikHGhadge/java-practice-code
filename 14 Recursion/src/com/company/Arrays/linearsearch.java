package com.company.Arrays;

import java.util.ArrayList;
import java.util.List;

public class linearsearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,16,4,5,16,8};
//        System.out.println(search(arr, 19, 0));
//        ArrayList<Integer> list = searchAllindex(arr, 16, 0, new ArrayList<>());
//        System.out.println(list);
        System.out.println(searchAllindex2(arr, 16, 0));
    }
    static int search(int[] arr, int target , int index){
        if (index==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return search(arr, target, index+1);
    }

    static ArrayList<Integer> searchAllindex(int[] arr, int target , int index, ArrayList<Integer> list){
        if (index==arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        return searchAllindex(arr, target, index+1, list);
    }

    static ArrayList<Integer> searchAllindex2(int[] arr, int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index==arr.length){
            return list;
        }
        // this will contain ans for that function call only
        if (arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCells =  searchAllindex2(arr, target, index+1);
        list.addAll(ansFromBelowCells);
        return list;
    }
}
