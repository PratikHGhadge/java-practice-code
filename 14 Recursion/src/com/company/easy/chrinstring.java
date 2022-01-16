package com.company.easy;

public class chrinstring {
    public static void main(String[] args) {
//        String str ="GeeksforGeeks";
//        System.out.println(recLen(str));
          System.out.println(isPowerOfTwo(3));
    }
    static public boolean isPowerOfTwo(int n) {
        for(int i = 0; i<n; i++){
            int a = (int) Math.pow(2,i);
            if(n%a==0){
                return true;
            }
            return false;
        }
        return false;
    }
//    private static int recLen(String str)
//    {
//
//        // if we reach at the end of the string
//        if (str.equals(""))
//            return 0;
//        else
//            return recLen(str.substring(1)) + 1;
//    }
}
