package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_8_quad_tree;

import java.util.ArrayList;
import java.util.List;

class Quadtree {
    private static final int CAPACITY = 4; // max points in a node
    private final Rectangle BOUNDARY;
    private final List<Point> POINTS;
    private boolean divided;
    private Quadtree northeast;
    private Quadtree northwest;
    private Quadtree southeast;
    private Quadtree southwest;

    Quadtree(final Rectangle BOUNDARY) {
        this.BOUNDARY = BOUNDARY;
        this.POINTS = new ArrayList<>();
        this.divided = false;
    }

    void insert(final Point POINT) {
        if (BOUNDARY.contains(POINT))
            if (POINTS.size() < CAPACITY)
                POINTS.add(POINT);
            else {
                if (!divided)
                    subdivide();
                northeast.insert(POINT);
                northwest.insert(POINT);
                southeast.insert(POINT);
                southwest.insert(POINT);
            }
    }

    void subdivide() {
        final int ROW = BOUNDARY.row;
        final int COLUMN = BOUNDARY.column;
        final int WIDTH = BOUNDARY.width / 2;
        final int height = BOUNDARY.height / 2;
        final Rectangle NORTHEAST_RECTANGLE = new Rectangle(
                ROW + WIDTH,
                COLUMN,
                WIDTH,
                height
        );
        northeast = new Quadtree(NORTHEAST_RECTANGLE);
        final Rectangle NORTHWEST_RECTANGLE = new Rectangle(
                ROW,
                COLUMN,
                WIDTH,
                height
        );
        northwest = new Quadtree(NORTHWEST_RECTANGLE);
        final Rectangle SOUTHEAST_RECTANGLE = new Rectangle(
                ROW + WIDTH,
                COLUMN + height,
                WIDTH,
                height
        );
        southeast = new Quadtree(SOUTHEAST_RECTANGLE);
        final Rectangle SOUTHWEST_RECTANGLE = new Rectangle(
                ROW,
                COLUMN + height,
                WIDTH,
                height
        );
        southwest = new Quadtree(SOUTHWEST_RECTANGLE);
        divided = true;
    }

    List<Point> query(final Rectangle RANGE, final List<Point> FOUND) {
        if (BOUNDARY.intersects(RANGE)) {
            for (Point point : POINTS)
                if (RANGE.contains(point))
                    FOUND.add(point);
            if (divided) {
                northeast.query(RANGE, FOUND);
                northwest.query(RANGE, FOUND);
                southeast.query(RANGE, FOUND);
                southwest.query(RANGE, FOUND);
            }
        }
        return FOUND;
    }
}