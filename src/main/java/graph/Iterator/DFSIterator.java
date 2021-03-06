package graph.Iterator;

import graph.Search.IGraph;
import graph.Structure.Node;

import java.util.*;

public class DFSIterator extends GraphIterator {

    Stack<Node> stack;

    public DFSIterator(IGraph graph, Node nodeStart) {
        super(graph, nodeStart);
        this.stack = new Stack<Node>();
        this.addNode(nodeStart);
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    @Override
    public void addNode(Node n) {
        this.stack.push(n);
    }

    @Override
    public Node removeNode() {
        return this.stack.pop();
    }
}
