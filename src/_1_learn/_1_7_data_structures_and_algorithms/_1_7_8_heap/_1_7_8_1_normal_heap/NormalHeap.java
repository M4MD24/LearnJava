package _1_learn._1_7_data_structures_and_algorithms._1_7_8_heap._1_7_8_1_normal_heap;

import java.util.ArrayList;

class NormalHeap {
    private static SortingStatus sortingStatus = SortingStatus.MAX;
    private static final ArrayList<Integer> ELEMENTS = new ArrayList<>();

    public void sortElements(final byte CHOICE) {
        final int SIZE = ELEMENTS.size();
        switch (CHOICE) {
            case -1 -> {
                sortingStatus = SortingStatus.MIN;
                for (int round = SIZE / 2 - 1; round >= 0; round--)
                    heapify(round);
            }
            case 1 -> {
                sortingStatus = SortingStatus.MAX;
                for (int round = SIZE / 2 - 1; round >= 0; round--)
                    heapify(round);
            }
        }
    }

    public void heapify(final int INDEX) {
        final int SIZE = ELEMENTS.size(),
                LEFT = 2 * INDEX + 1,
                RIGHT = 2 * INDEX + 2;
        int elementIndex = INDEX;
        if (sortingStatus == SortingStatus.MAX) {
            if (LEFT < SIZE && ELEMENTS.get(LEFT) > ELEMENTS.get(elementIndex))
                elementIndex = LEFT;
            if (RIGHT < SIZE && ELEMENTS.get(RIGHT) > ELEMENTS.get(elementIndex))
                elementIndex = RIGHT;
        } else {
            if (LEFT < SIZE && ELEMENTS.get(LEFT) < ELEMENTS.get(elementIndex))
                elementIndex = LEFT;
            if (RIGHT < SIZE && ELEMENTS.get(RIGHT) < ELEMENTS.get(elementIndex))
                elementIndex = RIGHT;
        }

        if (elementIndex != INDEX) {
            final int TEMPORARY_ELEMENT = ELEMENTS.get(elementIndex);
            ELEMENTS.set(elementIndex, ELEMENTS.get(INDEX));
            ELEMENTS.set(INDEX, TEMPORARY_ELEMENT);
            heapify(elementIndex);
        }
    }

    public void insertElement(final int ELEMENT) {
        final int SIZE = ELEMENTS.size();
        ELEMENTS.add(ELEMENT);
        if (SIZE != 0)
            for (int index = SIZE / 2 - 1; index >= 0; index--)
                heapify(index);
    }

    public void deleteElement(final int ELEMENT) {
        final int SIZE = ELEMENTS.size();
        int index;
        for (index = 0; index < SIZE; index++)
            if (ELEMENT == ELEMENTS.get(index))
                break;
        final int TEMPORARY_ELEMENT = ELEMENTS.get(index);
        ELEMENTS.set(index, ELEMENTS.get(SIZE - 1));
        ELEMENTS.set(SIZE - 1, TEMPORARY_ELEMENT);
        ELEMENTS.remove(SIZE - 1);
        for (int round = SIZE / 2 - 1; round >= 0; round--)
            heapify(round);
    }

    public void printElements() {
        for (final Integer ELEMENT : ELEMENTS)
            System.out.print(ELEMENT + " ");
        System.out.println();
    }
}