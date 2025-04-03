package level1;
import java.util.*;
public class ToUpper {
    public static String uppercase(String s){
        char[] upper = new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch>='a' && ch<='z') {
                upper[i] = (char) (ch - 32);
            }
            else {
                upper[i] = ch;
            }
        }
        return new String(upper);
    }
    public static boolean compare(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        String user = uppercase(str);
        String builtIn= str.toUpperCase();
        boolean equal = compare(user, builtIn);
        System.out.println("User defined method :" + user);
        System.out.println("Built-In method :  "+ builtIn);
        System.out.println(equal? "Results are same": "They don't match");
    }
}

