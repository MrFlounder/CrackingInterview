/**
 * Created by guangshuozang on 8/15/15.
 */
import java.util.Scanner;
public class Exc5S1 {
    public String compressString(String str){
        int count = 1;
        int i = 0, k = 0;
        StringBuilder returnStr = new StringBuilder();
        while(i < str.length()-1){
            if(str.charAt(i) != str.charAt(i+1)) {
                returnStr.append(str.charAt(i));
                returnStr.append(count);
                count = 1;
            }else
                count ++;
            i ++;
        }
        returnStr.append(str.charAt(i));
        returnStr.append(count);
        return returnStr.toString();
    }
    public static void main(String arg[]){
        try{
            System.out.println("Input a string here:");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            System.out.println(new Exc5S1().compressString(s));
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
