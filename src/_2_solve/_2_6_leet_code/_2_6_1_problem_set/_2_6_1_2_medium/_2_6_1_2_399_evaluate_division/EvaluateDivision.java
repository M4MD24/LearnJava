package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_399_evaluate_division;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an array of variable pairs equations and an array of real numbers values, where equations[i] = [Ai, Bi] and values[i] represent the equation Ai / Bi = values[i]. Each Ai or Bi is a string that represents a single variable.
 * <br/>
 * <br/>
 * You are also given some queries, where queries[j] = [Cj, Dj] represents the jth query where you must find the answer for Cj / Dj = ?.
 * <br/>
 * <br/>
 * Return the answers to all queries. If a single answer cannot be determined, return -1.0.
 * <br/>
 * <br/>
 * Note: The input is always valid. You may assume that evaluating the queries will not result in division by zero and that there is no contradiction.
 * <br/>
 * <br/>
 * Note: The variables that do not occur in the list of equations are undefined, so the answer cannot be determined for them.
 * </h2>
 */

public class EvaluateDivision {
    public static void main(final String[] ARGUMENTS) {
        final List<List<String>> EQUATIONS = new ArrayList<>() {{
            add(List.of("a", "b"));
            add(List.of("b", "c"));
        }};
        final double[] VALUES = {2, 3};
        final List<List<String>> QUERIES = new ArrayList<>() {{
            add(List.of("a", "c"));
            add(List.of("b", "a"));
            add(List.of("a", "e"));
            add(List.of("a", "a"));
            add(List.of("x", "x"));
        }};
        System.out.print(Arrays.toString(calcEquation(EQUATIONS, VALUES, QUERIES)));
    }

    private static double[] calcEquation(final List<List<String>> EQUATIONS, final double[] VALUES, final List<List<String>> QUERIES) {
        final Map<String, Map<String, Double>> GRAPH = new HashMap<>();
        for (int index = 0; index < EQUATIONS.size(); index++) {
            final String FIRST_ELEMENT = EQUATIONS.get(index).get(0),
                    SECOND_ELEMENT = EQUATIONS.get(index).get(1);
            GRAPH.putIfAbsent(FIRST_ELEMENT, new HashMap<>());
            GRAPH.putIfAbsent(SECOND_ELEMENT, new HashMap<>());
            GRAPH.get(FIRST_ELEMENT)
                    .put(SECOND_ELEMENT, VALUES[index]);
            GRAPH.get(SECOND_ELEMENT)
                    .put(FIRST_ELEMENT, 1.0 / VALUES[index]);
        }
        final double[] RESULTS = new double[QUERIES.size()];
        for (int index = 0; index < QUERIES.size(); index++) {
            final String FIRST_ELEMENT = QUERIES.get(index).get(0),
                    SECOND_ELEMENT = QUERIES.get(index).get(1);
            RESULTS[index] = (!GRAPH.containsKey(FIRST_ELEMENT) || !GRAPH.containsKey(SECOND_ELEMENT))
                    ? -1.0
                    : DEPTH_FIRST_SEARCH(GRAPH, FIRST_ELEMENT, SECOND_ELEMENT, new HashSet<>());
        }
        return RESULTS;
    }

    private static double DEPTH_FIRST_SEARCH(final Map<String, Map<String, Double>> GRAPH, final String SOURCE, final String DEST, final Set<String> VISITED) {
        if (SOURCE.equals(DEST))
            return 1.0;
        else {
            VISITED.add(SOURCE);
            for (final String NEIGHBOR : GRAPH.get(SOURCE).keySet())
                if (!VISITED.contains(NEIGHBOR)) {
                    final double RESULT = DEPTH_FIRST_SEARCH(GRAPH, NEIGHBOR, DEST, VISITED);
                    if (RESULT != -1.0)
                        return RESULT * GRAPH.get(SOURCE).get(NEIGHBOR);
                }
            return -1.0;
        }
    }
}