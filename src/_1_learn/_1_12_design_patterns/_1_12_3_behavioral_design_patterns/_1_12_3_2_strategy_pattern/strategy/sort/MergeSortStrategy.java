package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_2_strategy_pattern.strategy.sort;

public class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Merge Sort");
    }
}