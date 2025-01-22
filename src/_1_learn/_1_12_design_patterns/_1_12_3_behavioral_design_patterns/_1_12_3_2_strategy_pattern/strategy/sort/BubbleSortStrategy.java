package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_2_strategy_pattern.strategy.sort;

public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Bubble Sort");
    }
}