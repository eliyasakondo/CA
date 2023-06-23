package application;

import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {

    public void radixSort() {
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
        sort(array, maxValue);

        System.out.println("Sorted array: " + Arrays.toString(array));
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

    private void sort(int[] array, int maxValue) {
        int exponent = 1;
        while (maxValue / exponent > 0) {
            countingSort(array, exponent);
            exponent *= 10;
        }
    }

    private void countingSort(int[] array, int exponent) {
        int size = array.length;
        int[] output = new int[size];
        int[] count = new int[10];

        Arrays.fill(count, 0);

        for (int value : array) {
            int digit = (value / exponent) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            int digit = (array[i] / exponent) % 10;
            output[count[digit] - 1] = array[i];
            count[digit]--;
        }

        System.arraycopy(output, 0, array, 0, size);
    }
}

