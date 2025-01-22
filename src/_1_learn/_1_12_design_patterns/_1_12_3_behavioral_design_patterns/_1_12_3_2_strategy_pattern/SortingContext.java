package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_2_strategy_pattern;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_2_strategy_pattern.strategy.sort.SortingStrategy;

class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] array) {
        sortingStrategy.sort(array);
    }
}