package Pratik;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {

        String  s ="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        String ans = "";
        String ans2 = "";
        int j = 0;
        for(int i = a.length()-1; i>=0; i--){
            if(a.charAt(i)>='a' && a.charAt(i)<='z'){
                ans = ans + a.charAt(i);
            }
            if(a.charAt(j)>='a' && a.charAt(j)<='z'){
                ans2 = ans2 + a.charAt(j);
            }
            j++;
        }
        if(ans.equals(ans2)){
            return true;
        }else{
            return false;
        }

    }
}