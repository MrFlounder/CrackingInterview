package ChapterOne;

/**
 * Created by guangshuozang on 8/15/15.
 * With sorting
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exc3S2 {

    public boolean isPermutation(String str1, String str2){
        if(sort(str1).equals(sort(str2)))
            return true;
        else return false;
    }

    public String sort(String str){
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static void main(String arg[]){
        try{
            while(true) {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter string1 here : ");
                String str1 = bufferRead.readLine();
                System.out.println("Enter string2 here : ");
                String str2 = bufferRead.readLine();
                Exc3S2 instance = new Exc3S2();
                System.out.println(instance.isPermutation(str1, str2));
            }
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
