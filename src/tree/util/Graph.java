package tree.util;

import java.util.ArrayList;

/**
 * Created by guangshuozang on 9/7/15.
 */
public class Graph {
    public GraphNode A;
    public GraphNode B;
    public GraphNode C;
    public GraphNode D;
    public GraphNode E;
    public GraphNode F;
    public ArrayList<GraphNode> getNodes(){
        ArrayList<GraphNode> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.add(D);
        return list;
    }
}
