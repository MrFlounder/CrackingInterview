package ChapterFour;

import tree.util.Graph;
import tree.util.GraphNode;
import tree.util.State;

import java.util.Stack;

/**
 * Created by guangshuozang on 9/7/15.
 */
public class Exc2S1 {
    public boolean DFSearch(Graph g, GraphNode start, GraphNode end){
        Stack<GraphNode> stack = new Stack<GraphNode>();
        start.state = State.Visiting;
        stack.push(start);
        for(GraphNode n : start.getAdjacent()){


        }
    }
}
