package ChapterTwo;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by guangshuozang on 8/16/15.
 * Hashtable doesn't keep the order of linked list element...
 * <E>??
 *
 */
public class Exc1S1 {
    public LinkedList<Object> removeDups(LinkedList<Object> list){
        Hashtable table = new Hashtable();
        LinkedList<Object> returnList = new LinkedList<Object>();
        for(Object itr:list)
        table.put(itr,"whatever!");
        for(Object itr:table.keySet())
        returnList.add(itr);
        return returnList;
    }

    public static void main(String arg[]){
        LinkedList<Object> list = new LinkedList<Object>();
        Exc1S1 instance = new Exc1S1();
        Scanner in = new Scanner(System.in);
        while(true) {
            String s = in.nextLine();
            if(s.equals("esc"))
                break;
            list.add(s);
        }
        System.out.println(list);
        System.out.println(instance.removeDups(list));
    }

}
