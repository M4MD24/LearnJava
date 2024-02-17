package _1_learning._1_7_data_structures_and_algorithms._1_7_4_graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Graph<T> {
    private final Map<T, List<T>> map = new HashMap<>();

    public void addVertex(T s) {
        map.put(s, new LinkedList<>());
    }

    public void addEdge(T source, T destination, boolean bidirectional) {
        if (!map.containsKey(source)) addVertex(source);
        if (!map.containsKey(destination)) addVertex(destination);
        map.get(source).add(destination);
        if (bidirectional) map.get(destination).add(source);
    }

    public void getVertexCount() {
        System.out.println("The graph has " + map.keySet().size() + " vertex");
    }

    public void getEdgesCount(boolean bidirection) {
        int count = 0;
        for (T v : map.keySet()) count += map.get(v).size();
        if (bidirection) count = count / 2;
        System.out.println("The graph has " + count + " edges.");
    }

    public void hasVertex(T s) {
        if (map.containsKey(s)) System.out.println("The graph contains " + s + " as a vertex.");
        else System.out.println("The graph does not contain " + s + " as a vertex.");
    }

    public void hasEdge(T s, T d) {
        if (map.get(s).contains(d)) System.out.println("The graph has an edge between " + s + " and " + d + ".");
        else System.out.println("The graph has no edge between " + s + " and " + d + ".");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T v : map.keySet()) {
            builder.append(v.toString()).append(": ");
            for (T w : map.get(v)) builder.append(w.toString()).append(" ");
            builder.append("\n");
        }
        return (builder.toString());
    }
}

public class GraphExample {
    public static void main(String[] args) {
        Graph<Integer> g1 = new Graph<>();
        g1.addEdge(1, 1, true);
        g1.addEdge(1, 1, true);
        g1.addEdge(1, 1, true);
        g1.addEdge(1, 1, true);
        g1.addEdge(1, 1, true);
        g1.addEdge(1, 1, true);
        g1.addEdge(1, 1, true);
        System.out.print(g1);
        g1.getVertexCount();
        g1.getEdgesCount(false);
        g1.hasEdge(1, 1);
        g1.hasVertex(1);

        Graph<Integer> g2 = new Graph<>();
        g2.addEdge(1, 1, false);
        g2.addEdge(1, 1, false);
        g2.addEdge(1, 1, false);
        g2.addEdge(1, 1, false);
        g2.addEdge(1, 1, false);
        g2.addEdge(1, 1, false);
        g2.addEdge(1, 1, false);
        System.out.print("\n" + g2);
        g2.getVertexCount();
        g2.getEdgesCount(false);
        g2.hasEdge(1, 1);
        g2.hasVertex(1);
    }
}