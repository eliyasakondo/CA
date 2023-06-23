package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinSort {

    public void binSort() {
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

        sort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    private void sort(int[] array) {
        int maxValue = getMaxValue(array);
        int numBins = (int) Math.sqrt(array.length);

        // Create empty bins
        List<List<Integer>> bins = new ArrayList<>();
        for (int i = 0; i < numBins; i++) {
            bins.add(new ArrayList<>());
        }

        // Distribute elements into bins
        for (int value : array) {
            int binIndex = (int) Math.floor(value / (double) (maxValue + 1) * numBins);
            bins.get(binIndex).add(value);
        }

        // Sort elements within each bin and combine them back into the original array
        int index = 0;
        for (List<Integer> bin : bins) {
            int[] sortedBin = bin.stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(sortedBin);
            System.arraycopy(sortedBin, 0, array, index, sortedBin.length);
            index += sortedBin.length;
        }
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
}

