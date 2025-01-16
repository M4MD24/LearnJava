package _1_learn._1_11_solid_principles._1_11_2_open_closed_principle.compliance;

class StudentDiscount implements Discount {
    public double calculate(double price) {
        return price * 0.1;
    }
}