package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_295_find_median_from_data_stream;

import java.util.PriorityQueue;

/**
 * <h1>Problem:</h1>
 * <h2>The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.</h2>
 * <br/>
 * <ul>
 *     <li>For example, for arr = [2,3,4], the median is 3.</li>
 *     <li>For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.</li>
 * </ul>
 * <br/>
 * <br/>
 * <h2>Implement the MedianFinder class:</h2>
 * <br/>
 * <ul>
 *     <li>MedianFinder() initializes the MedianFinder object.</li>
 *     <li>void addNum(int num) adds the integer num from the data stream to the data structure.</li>
 *     <li>double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.</li>
 * </ul>
 */

public class FindMedianFromDataStream {
    public static void main(final String[] PARAMETERS) {
        FindMedianFromDataStream medianFinder = new FindMedianFromDataStream();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian());
    }

    private final PriorityQueue<Integer> MAXIMUM_HEAP, MINIMUM_HEAP;

    FindMedianFromDataStream() {
        MAXIMUM_HEAP = new PriorityQueue<>((firstNumber, secondNumber) -> secondNumber - firstNumber);
        MINIMUM_HEAP = new PriorityQueue<>();
    }

    private void addNum(final int NUMBER) {
        if (MAXIMUM_HEAP.isEmpty() || MAXIMUM_HEAP.peek() > NUMBER)
            MAXIMUM_HEAP.add(NUMBER);
        else
            MINIMUM_HEAP.add(NUMBER);
        if (MAXIMUM_HEAP.size() > MINIMUM_HEAP.size() + 1)
            MINIMUM_HEAP.add(MAXIMUM_HEAP.poll());
        else if (MINIMUM_HEAP.size() > MAXIMUM_HEAP.size() + 1)
            MAXIMUM_HEAP.add(MINIMUM_HEAP.poll());
    }

    private double findMedian() {
        if (MAXIMUM_HEAP.size() > MINIMUM_HEAP.size())
            return MAXIMUM_HEAP.peek();
        else if (MINIMUM_HEAP.size() > MAXIMUM_HEAP.size())
            return MINIMUM_HEAP.peek();
        else
            return (MINIMUM_HEAP.peek() + MAXIMUM_HEAP.peek()) / 2.0;
    }
}