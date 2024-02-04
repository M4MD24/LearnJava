package _1_learning._1_2_object_oriented_programming._1_2_10_encapsulation;

class RectangleArea {
    float width, height;

    RectangleArea(float width, float height) {
        this.width = width;
        this.height = height;
    }

    void displayCalculateRectangleArea() {
        float result = width * height;
        System.out.println(result);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        RectangleArea areaRectangle = new RectangleArea(10, 4);
        areaRectangle.displayCalculateRectangleArea();
    }
}