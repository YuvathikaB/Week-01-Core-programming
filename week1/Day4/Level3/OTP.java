package level3;
public class OTP {
    public static int otp(){
        return 100000 + (int)(Math.random()*900000);
    }
    public static boolean unique(int[] otps){
        for(int i=0;i<otps.length;i++){
            for(int j=i+1;j<otps.length;j++){
                if(otps[i]==otps[j]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] otpArr =new int[10];
        for(int i=0;i<10;i++){
            otpArr[i]=otp();
        }
        System.out.println("Generated OTPs : ");
        for(int i=0;i<otpArr.length;i++){
            System.out.println(otpArr[i]+ " ");
        }
        System.out.println("Unique OTPs : "+(unique(otpArr)?"YES" : "NO"));
    }
}
