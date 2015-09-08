package ChapterFour;

import tree.util.Graph;
import tree.util.GraphNode;
import tree.util.State;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by guangshuozang on 9/7/15.
 * Here are both BFS and DFS approaches.
 * If we don't want to go too deep at one node, we'll better try BFS
 *
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
    public boolean BFSearch(Graph g, GraphNode start, GraphNode end){
        LinkedList<GraphNode> q = new LinkedList<>();
        start.state = State.Visiting;
        q.add(start);
        GraphNode u;
        while(!q.isEmpty()){
            u = q.removeFirst();
            if(u!=null){
                for(GraphNode v : u.getAdjacent()){
                    if(v.state == State.Unvisited){
                        if(v==end)
                            return true;
                    }else{
                        v.state = State.Visiting;
                        q.add(v);
                    }
                }
                u.state = State.Visited;
            }
        }
        return false;
    }
}
