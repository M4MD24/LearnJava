package _1_learning._1_5_algorithms._1_5_1_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10);

//        Before Sort
        numbers.add(3);
        numbers.add(1);
        numbers.add(6);
        System.out.println("Before Sorting: " + numbers + "\n");

//        After Sort
        System.out.println("Bubble Sort   : " + bubbleSort(numbers));

        System.out.println("Selection Sort: " + selectionSort(numbers));

        System.out.println("Insertion Sort: " + insertionSort(numbers));

        quickSort(numbers, 0, numbers.size() - 1);
        System.out.println("Quick Sort    : " + numbers);

        Collections.sort(numbers);
        System.out.println("Normal Sort   : " + numbers);
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        return arr;
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) < arr.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(minIndex));
            arr.set(minIndex, temp);
        }
        return arr;
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, key);
        }
        return arr;
    }

    public static void quickSort(ArrayList<Integer> arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(ArrayList<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr.get(j) <= pivot) {
                i++;

                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        int temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }
}