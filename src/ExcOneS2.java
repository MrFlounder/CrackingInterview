import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by guangshuozang on 8/14/15.
 * Solution code from book solution number 1
 */
public class ExcOneS2 {
    public static void main(String arg[]) {
        System.out.println("Enter a string here : ");

        try{
            while(true) {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String s = bufferRead.readLine();
                ExcOneS2 instance = new ExcOneS2();
                System.out.println(instance.isUniqueChars2(s));
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

    public String isUniqueChars2(String str) {
        if (str.length() > 256)
            return "Duplicate";
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val])
                return "Duplicate";
            char_set[val] = true;
        }
        return "unique";

    }
}

