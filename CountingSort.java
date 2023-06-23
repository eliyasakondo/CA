package application;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {

    public void countingSort() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(array));

        int maxValue = getMaxValue(array);
        int[] sortedArray = sort(array, maxValue);

        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }

    private int getMaxValue(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    private int[] sort(int[] array, int maxValue) {
        int[] countArray = new int[maxValue + 1];

        for (int value : array) {
            countArray[value]++;
        }

        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] sortedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            sortedArray[countArray[array[i]] - 1] = array[i];
            countArray[array[i]]--;
        }

        return sortedArray;
    }
}

