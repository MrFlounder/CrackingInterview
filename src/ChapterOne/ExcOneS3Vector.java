package ChapterOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by guangshuozang on 8/14/15.
 * Based on S2, use a bit vector to reduce space usage by a factor of eight
 * It's under a specific condition: Ascii
 * Reference:
 * byte 8 bits, short 16 bits, int 32 bits, long 64 bits
 */
public class ExcOneS3Vector {
    public String isUniqueCharsInString(String str){
        int checker = 0;
        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if ((checker & (1 << val)) > 0)
                return "Replicate";
            checker = checker | (1 << val);
        }
        return "unique";
    }
    public static void main(String arg[]){
        System.out.println("Enter a string here : ");
        try{
            while(true) {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String s = bufferRead.readLine();
                ExcOneS3Vector instance = new ExcOneS3Vector();
                System.out.println(instance.isUniqueCharsInString(s));
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
