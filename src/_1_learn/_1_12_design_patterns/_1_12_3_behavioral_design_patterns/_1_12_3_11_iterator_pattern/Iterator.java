package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_11_iterator_pattern;

interface Iterator<T> {
    boolean hasNext();

    T next();
}