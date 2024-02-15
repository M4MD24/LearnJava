package _2_problem_solving._2_1_w3schools._2_1_1_how_to._2_1_1_4_area_of_rectangle;

import java.util.Scanner;

public class AreaOfRectangleExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width and length to calculate area of rectangle:\nEnter Length = ");
        int length = input.nextInt();

        System.out.print("Enter Width = ");
        int width = input.nextInt();

        int area = (length + width) * 2;
        System.out.print("Result:\n" + "Area of Rectangle = (length + width) * 2\n" + "(" + length + " + " + width + ")" + " * " + 2 + " = " + area);
    }
}