package level2;
import java.util.*;
public class VowelConsonant2D {
    public static String charType(char ch){
        ch=(ch>='A'&& ch<='Z') ? (char)(ch+32) : ch;
        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }
    public static String[][] vowelsConsonants(String str){
        String[][] res=new String[str.length()][2];
        for(int i=0;i<str.length();i++){
            res[i][0]=String.valueOf(str.charAt(i));
            res[i][1]=charType(str.charAt(i));
        }
        return res;
    }
    public static void display(String[][] res){
        System.out.println("Character\tType");
        for (String[] row : res)
            System.out.println(row[0] + "\t\t" + row[1]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] result = vowelsConsonants(text);
        display(result);
    }
}
