package ChapterTwo;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by guangshuozang on 8/16/15.
 * This solution used LinkedList remove() method, which should be taking more time, as remove() method would search for
 * node first which is O(n) time.
 */
public class Exc1S2 {
    public LinkedList<Object> removeDups(LinkedList<Object> list){
        Hashtable table = new Hashtable();
        for(Object itr:list)
            if(table.containsKey(itr))
                list.remove(itr);
            else
            table.put(itr,"whatever!");
        return list;
    }

    public static void main(String arg[]){
        LinkedList<Object> list = new LinkedList<Object>();
        Exc1S2 instance = new Exc1S2();
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
