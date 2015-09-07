package tree.util;

import java.util.ArrayList;

/**
 * Created by guangshuozang on 9/7/15.
 */
public class GraphNode {
    public State state;
    int value;
    public GraphNode connectingNode1;
    public GraphNode connectingNode2;
    GraphNode(int val){
        this.state = State.Unvisited;
        this.value = val;
    }

    public ArrayList<GraphNode> getAdjacent() {
        ArrayList<GraphNode> list = new ArrayList<>();
        list.add(connectingNode1);
        list.add(connectingNode2);
        return list;
    }
}
