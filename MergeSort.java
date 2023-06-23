package application;

import java.util.Scanner;

public class MergeSort {
    public void mergeSort() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        mergeSort(array);
        
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void mergeSort(int[] array) {
        if (array == null || array.length <= 1)
            return;

        int n = array.length;
        int[] temp = new int[n];
        mergeSort(array, temp, 0, n - 1);
    }

    private void mergeSort(int[] array, int[] temp, int left, int right) {
        if (left >= right)
            return;

        int mid = left + (right - left) / 2;
        mergeSort(array, temp, left, mid);
        mergeSort(array, temp, mid + 1, right);
        merge(array, temp, left, mid, right);
    }

    private void merge(int[] array, int[] temp, int left, int mid, int right) {
        // Copy elements into the temporary array
        for (int i = left; i <= right; i++)
            temp[i] = array[i];

        int i = left;
        int j = mid + 1;
        int k = left;

        // Merge the two sorted subarrays
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the left subarray
        while (i <= mid) {
            array[k] = temp[i];
            i++;
            k++;
        }

        // No need to copy remaining elements from the right subarray
    }
}

