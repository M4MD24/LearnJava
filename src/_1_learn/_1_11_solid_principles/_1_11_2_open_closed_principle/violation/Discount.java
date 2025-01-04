package _1_learn._1_11_solid_principles._1_11_2_open_closed_principle.violation;

class Discount {
    public double calculateDiscount(String type, double price) {
        if (type.equals("Student"))
            return price * 0.1;
        else if (type.equals("Senior"))
            return price * 0.2;
        return 0;
    }
}