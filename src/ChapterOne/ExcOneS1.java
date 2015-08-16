package ChapterOne; /**
 * Created by guangshuozang on 8/13/15.
 * O(n^2) time and O(1) space
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcOneS1 {
    static long startTime;
    static long endTime;
    public String testString(String stringToTest) {

        char[] charArray = stringToTest.toCharArray();

        for (int i = 0; i < stringToTest.length(); i++) {
            int count = 0;
            for(int j= 0; j < stringToTest.length(); j++) {
                if(charArray[i] == charArray[j])
                count ++;
            }
            if(count > 1)
                return "Replicate";
        }
        return "Unique";
    }

    public static void main(String arg[]){
        System.out.println("Enter a string here : ");

        try{
            while(true) {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String s = bufferRead.readLine();
                ExcOneS1 instance = new ExcOneS1();
                startTime = System.currentTimeMillis();
                System.out.println(instance.testString(s));
                endTime = System.currentTimeMillis();
                System.out.println(endTime - startTime);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }



}



