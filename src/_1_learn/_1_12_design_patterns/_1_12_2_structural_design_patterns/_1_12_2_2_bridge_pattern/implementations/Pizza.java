package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern.implementations;

public abstract class Pizza {
    protected String sauce;
    protected String toppings;
    protected String crust;

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public abstract void assemble();

    public abstract void qualityCheck();
}