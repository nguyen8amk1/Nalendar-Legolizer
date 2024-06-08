package nttn.legolization.core.graph;
import java.util.*;
import nttn.legolization.core.graph.outputFormatter.*;
import java.lang.Exception;

public class Graph<T> {
    private final Map<T, List<T>> map = new HashMap<>();
    private GraphOutputFormatter<T> outputFormatter = null;

    public Graph() {
    }

    public Graph (GraphOutputFormatter outputFormatter) {
        this.outputFormatter = outputFormatter;
    }

    public void setOutputFormatter(GraphOutputFormatter outputFormatter) {
        this.outputFormatter = outputFormatter;
    }

    public void addVertex(T s) {
        map.put(s, new LinkedList<T>());
    }

    public void addEdge(T source, T destination,
            boolean bidirectional) {

        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if (bidirectional == true) {
            map.get(destination).add(source);
        }
    }

    public void getVertexCount() {
        System.out.println("The graph has "
                + map.keySet().size()
                + " vertex");
    }

    public void getEdgesCount(boolean bidirection) {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }
        if (bidirection == true) {
            count = count / 2;
        }
        System.out.println("The graph has " + count
                + " edges.");
    }

    public void hasVertex(T s) {
        if (map.containsKey(s)) {
            System.out.println("The graph contains " + s
                    + " as a vertex.");
        }
        else {
            System.out.println("The graph does not contain "
                    + s + " as a vertex.");
        }
    }

    public void hasEdge(T s, T d) {
        if (map.get(s).contains(d)) {
            System.out.println(
                    "The graph has an edge between " + s
                    + " and " + d + ".");
        }
        else {
            System.out.println(
                    "The graph has no edge between " + s
                    + " and " + d + ".");
        }
    }

    public void neighbours(T s) {
        if(!map.containsKey(s)) 
            return ;
        System.out.println("The neighbours of "+s+" are");
        for(T w:map.get(s))
            System.out.print(w+",");
    }

    @Override 
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }

    public String outputFormat() throws Exception {
        if(this.outputFormatter == null) throw new Exception("There is no GraphOutputFormatter");
        return outputFormatter.toString(map);
    }
}
