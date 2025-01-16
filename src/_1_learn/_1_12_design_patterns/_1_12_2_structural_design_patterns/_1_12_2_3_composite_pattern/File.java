package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_3_composite_pattern;

class File implements FileSystemComponents {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println(" ".repeat(COUNT_OF_SPACES) + "File: " + name);
    }
}