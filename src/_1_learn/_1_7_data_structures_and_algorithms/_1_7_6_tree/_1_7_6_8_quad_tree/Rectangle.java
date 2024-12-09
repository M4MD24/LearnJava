package _1_learn._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_8_quad_tree;

class Rectangle {
    int row,
            column,
            width,
            height;

    Rectangle(
            final int ROW,
            final int COLUMN,
            final int WIDTH,
            final int HEIGHT
    ) {
        this.row = ROW;
        this.column = COLUMN;
        this.width = WIDTH;
        this.height = HEIGHT;
    }

    boolean contains(final Point POINT) {
        return POINT.row >= row &&
                POINT.row < row + width &&
                POINT.column >= column &&
                POINT.column < column + height;
    }

    boolean intersects(final Rectangle RANGE) {
        return !(RANGE.row > row + width ||
                RANGE.row + RANGE.width < row ||
                RANGE.column > column + height ||
                RANGE.column + RANGE.height < column);
    }
}