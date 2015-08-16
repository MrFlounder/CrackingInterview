package ChapterOne;

import java.util.Scanner;

/**
 * Created by guangshuozang on 8/15/15.
 * StringBuilder and StringBuffer difference:
 * StringBuilder is not synchronized, StringBuffer is.
 *
 */
public class Exc4S1 {
    public String convertString(String str, int trueLength){
        char[] charSet = str.toCharArray();
        StringBuilder returnStr = new StringBuilder();
        for(int i = 0; i < trueLength; i++){
            if(charSet[i] == ' ')
                returnStr.append("%20");
            else
                returnStr.append(charSet[i]);
        }
        return returnStr.toString();
    }
    public static void main(String arg[]){
        try{
            while(true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input a string to convert");
                String s = scanner.nextLine();
                System.out.println("Input the true length");
                int l = scanner.nextInt();
                Exc4S1 instance = new Exc4S1();
                System.out.println(instance.convertString(s,l));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
