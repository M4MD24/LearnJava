package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_3_composite_pattern;

import java.util.ArrayList;
import java.util.List;

class Folder implements FileSystemComponents {
    private String name;
    private final List<FileSystemComponents> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponents... component) {
        components.addAll(List.of(component));
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemComponents component : components) {
            System.out.print(" ".repeat(COUNT_OF_SPACES));
            component.showDetails();
        }
    }
}