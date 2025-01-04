package _1_learn._1_11_solid_principles._1_11_3_liskov_substitution_principle.compliance;

class Square extends Quadrilateral {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setWidth(int width) {
        this.side = width;
    }

    public void setHeight(int height) {
        this.side = height;
    }

    public int getArea() {
        return side * side;
    }
}