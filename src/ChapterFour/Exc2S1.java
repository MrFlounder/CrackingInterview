package ChapterFour;

import tree.util.Graph;
import tree.util.GraphNode;
import tree.util.State;

import java.util.Stack;

/**
 * Created by guangshuozang on 9/7/15.
 */
//DFS
public class Exc2S1 {
    public boolean DFSearch(Graph g, GraphNode start, GraphNode end){
        Stack<GraphNode> stack = new Stack<GraphNode>();
        if(start==end)
            return true;
        start.state = State.Visited;
        for (GraphNode n : start.getAdjacent()) {
            if (n.state == State.Unvisited)
                DFSearch(g, n, end);
        }
        return false;
    }
}
