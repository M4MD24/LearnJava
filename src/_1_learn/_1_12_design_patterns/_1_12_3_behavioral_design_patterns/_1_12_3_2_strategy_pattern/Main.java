package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_2_strategy_pattern;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_2_strategy_pattern.strategy.sort.BubbleSortStrategy;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_2_strategy_pattern.strategy.sort.MergeSortStrategy;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_2_strategy_pattern.strategy.sort.QuickSortStrategy;

public class Main {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 9, 1, 5};

        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        sortingContext.performSort(NUMBERS);

        sortingContext.setSortingStrategy(new MergeSortStrategy());
        sortingContext.performSort(NUMBERS);

        sortingContext.setSortingStrategy(new QuickSortStrategy());
        sortingContext.performSort(NUMBERS);
    }
}