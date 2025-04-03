package level3;
import java.util.Scanner;
public class UniqueCh2 {
    public static int length(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static char[] unique(String str) {
        int size=length(str);
        char[] textArr =new char[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == str.charAt(i)){
                    unique = false;
                    break;
                }
            }
            if (unique) {
                textArr[count] = str.charAt(i);
                count++;
            }
        }
        char[] uniq=new char[count];
        for(int i=0;i<count;i++){
            uniq[i]=textArr[i];
        }
        return uniq;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.next();
        char[]  uniq=unique(str);
        for(int i=0;i<uniq.length;i++){
            System.out.print(uniq[i]+" ");
        }
    }
}





