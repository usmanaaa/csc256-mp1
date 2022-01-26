package Graph;

import java.util.*;

public class Graph {
    HashMap<Node, ArrayList<Node>> adjList;

    public Graph(List<Edge> edges) {
        this.adjList = new HashMap<Node, ArrayList<Node>>();

        for (Edge e : edges) {
            if (!this.adjList.containsKey(e.getSrc()))
                adjList.put(e.src, new ArrayList<Node>());
            if (!this.adjList.containsKey(e.getDest()))
                this.adjList.put(e.dest, new ArrayList<Node>());
            this.adjList.get(e.getSrc()).add(e.getDest());
            this.adjList.get(e.getDest()).add(e.getSrc());
        }
    }

    public void printGraph() {
        for (Node n : this.adjList.keySet()) {
            System.out.println(n.getVal() + ": ");
            for (Node m : this.adjList.get(n)) {
                System.out.println(m.getVal());
            }

        }
    }

    public static void main(String[] args) {
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        List<Edge> edges = Arrays.asList(new Edge(node0, node1), new Edge(node0, node2), new Edge(node1, node2),
                new Edge(node3, node2), new Edge(node4, node5));
        Graph G = new Graph(edges);
        G.printGraph();
    }
}
