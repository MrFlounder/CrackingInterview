/**
 * Created by guangshuozang on 8/13/15.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcOneS1 {

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
        System.out.println("Enter something here : ");

        try{
            while(true) {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String s = bufferRead.readLine();
                ExcOneS1 instance = new ExcOneS1();
                System.out.println(instance.testString(s));
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }



}



