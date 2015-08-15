

/**
 * Created by guangshuozang on 8/15/15.
 * This is only for characters later then a
 * == and .equals() difference:
 *
 *
 * Arrays.toString() is not a wise choice for performance
 * I think I will try to convert the int[] to a long number to compare.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ExcThreeS1 {
    public boolean isPermutation(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        String s1 = getCountStringPresentation(str1);
        String s2 = getCountStringPresentation(str2);
        if(s1.equals(s2))
            return true;
        return false;
    }

    public String getCountStringPresentation(String str){
        char[] charSet = str.toCharArray();
        int i = 0;
        int[] countSet = new int[256];
        while(i<str.length()){
            countSet[str.charAt(i) - 'a']++;
            i++;
        }
        return Arrays.toString(countSet);
    }

    public static void main(String arg[]){

        try{
            while(true) {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter string1 here : ");
                String str1 = bufferRead.readLine();
                System.out.println("Enter string2 here : ");
                String str2 = bufferRead.readLine();
                ExcThreeS1 instance = new ExcThreeS1();
                System.out.println(instance.isPermutation(str1, str2));
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
