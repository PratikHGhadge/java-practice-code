package Pratik;

import java.util.Arrays;

public class Inplacemergesort {
    static void mergsortinplace(int[] arr, int s, int e){
        if(e-s==1) return ;
        int mid = s + (e-s)/2;
        mergsortinplace(arr, s, mid);
        mergsortinplace(arr, mid, e);
        merg(arr, s, mid, e);
    }

    static void merg(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;
        while (i<mid && j <e){
            if (arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<mid){
            mix[k] = arr[i];
            k++;
            i++;
        }
        while (j<e){
            mix[k] = arr[j];
            k++;
            j++;
        }
        for (int l = 0; l < mix.length; l++) arr[s + l] = mix[l];

    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergsortinplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
