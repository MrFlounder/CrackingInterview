package ChapterOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by guangshuozang on 8/14/15.
 * This is a function that reverse a string in java
 * In java string terminates when meeting it's length
 * In c string terminates with '\0'
 */
public class ExcTwoS1 {
    public boolean reverse(String str){
        char[] charArray;
        charArray = str.toCharArray();
        int i = 0;
        while((str.length() - 1 - i) > i){
            char temp = charArray[i];
            charArray[i] = charArray[str.length() -1 -i];
            charArray[str.length()-1-i] = temp;
            i++;
        }
        System.out.println(new String(charArray));
        return true;
    }

    public static void main(String arg[]) {
        System.out.println("Enter a string here : ");
        try {
            while (true) {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String s = bufferRead.readLine();
                ExcTwoS1 instance = new ExcTwoS1();
                System.out.println(instance.reverse(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
