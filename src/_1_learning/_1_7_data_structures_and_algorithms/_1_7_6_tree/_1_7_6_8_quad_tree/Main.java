package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_8_quad_tree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final Rectangle BOUNDARY = new Rectangle(
                0,
                0,
                200,
                200
        );
        final Quadtree QUAD_TREE = new Quadtree(BOUNDARY);
        QUAD_TREE.insert(new Point(50, 50));
        QUAD_TREE.insert(new Point(150, 50));
        QUAD_TREE.insert(new Point(50, 150));
        QUAD_TREE.insert(new Point(150, 150));
        QUAD_TREE.insert(new Point(100, 100));
        final Rectangle RANGE = new Rectangle(
                25,
                25,
                150,
                150
        );
        System.out.println("Points found in range:");
        for (final Point POINT : QUAD_TREE.query(RANGE, new ArrayList<>()))
            System.out.println("Point: (" + POINT.row + ", " + POINT.column + ")");
    }
}
