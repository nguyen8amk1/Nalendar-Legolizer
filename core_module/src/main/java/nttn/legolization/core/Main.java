package nttn.legolization.core;
import nttn.legolization.core.voxel.*;
import nttn.legolization.core.graph.*;

public class Main {
    public static void main(String[] args) {
        Graph<Integer> g = new Graph<Integer>();

        g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 4, true);

        System.out.println("Graph:\n" + g.toString());

        g.getVertexCount();

        g.getEdgesCount(true);

        g.hasEdge(3, 4);

        g.hasVertex(5);

        g.neighbours(1);
    }
}
