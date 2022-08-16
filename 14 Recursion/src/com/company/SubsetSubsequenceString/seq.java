package com.company.SubsetSubsequenceString;

import java.util.ArrayList;

public class seq {
    public static void main(String[] args) {
//        subSeq("", "abc");
        ArrayList<String> ans = new ArrayList<>();
        pad("", "12", ans);
        System.out.println(ans);
    }


    public static void subSeq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));
    }


    public static void pad(String p, String up, ArrayList<String> ans){
        if (up.isEmpty()){
            ans.add(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for (int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char) ('a'+i);
            pad(p+ch, up.substring(1), ans);
        }
    }
}
