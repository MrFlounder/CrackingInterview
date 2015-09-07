package tree.util;

/**
 * Created by guangshuozang on 9/7/15.
 */
public class GraphNode {
    State state;
    int value;
    public GraphNode connectingNode1;
    public GraphNode connectingNode2;
    GraphNode(int val){
        this.state = State.Unvisited;
        this.value = val;
    }
}
