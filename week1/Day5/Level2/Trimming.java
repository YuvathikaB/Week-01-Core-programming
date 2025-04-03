package level2;
import java.util.*;
public class Trimming {
    public static int[] indices(String str){
        int start=0,end=str.length()-1;
        while(start<str.length() && str.charAt(start)==' '){
            start++;
        }
        while(end>start && str.charAt(end)==' '){
            end--;
        }
        return new int[]{start,end};
    }
    public static String substring(String str,int start,int end){
        String res = "";
        for (int i = start; i <= end; i++) {
            res += str.charAt(i);
        }
        return res;
    }
    public static boolean compare(String s1, String s2){
        if(s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string : ");
        String str=sc.next();
        int[] index=indices(str);
        String s1=substring(str,index[0],index[1]);
        String s2=str.trim();
        System.out.println("User defined : "+s1);
        System.out.println("Using trim() : "+s1);
        System.out.println(compare(s1,s2)? "They are same": "They are not same");
    }
}
