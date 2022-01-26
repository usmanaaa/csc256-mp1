package Graph;

public class Edge {
    Node src;
    Node dest;

    public Edge(Node src, Node dest) {
        this.src = src;
        this.dest = dest;
    }

    public Node getSrc() {
        return this.src;
    }

    public Node getDest() {
        return this.dest;
    }
}
