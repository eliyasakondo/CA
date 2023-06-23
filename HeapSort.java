package application;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {

    public void heapSort() {
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
        int size = array.length;

        // Build heap (rearrange array)
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(array, size, i);
        }

        // One by one extract an element from the heap
        for (int i = size - 1; i > 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call max heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    private void heapify(int[] array, int size, int rootIndex) {
        int largestIndex = rootIndex; // Initialize largest as root
        int leftChildIndex = 2 * rootIndex + 1; // Left child index
        int rightChildIndex = 2 * rootIndex + 2; // Right child index

        // If left child is larger than root
        if (leftChildIndex < size && array[leftChildIndex] > array[largestIndex]) {
            largestIndex = leftChildIndex;
        }

        // If right child is larger than largest so far
        if (rightChildIndex < size && array[rightChildIndex] > array[largestIndex]) {
            largestIndex = rightChildIndex;
        }

        // If largest is not root
        if (largestIndex != rootIndex) {
            // Swap the elements
            int temp = array[rootIndex];
            array[rootIndex] = array[largestIndex];
            array[largestIndex] = temp;

            // Recursively heapify the affected sub-tree
            heapify(array, size, largestIndex);
        }
    }
}

