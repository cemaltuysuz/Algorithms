package com.cemaltuysuz.merge;

/**
 * @author cemaltuysuz
 * @date 25.09.2021
 * */

public class Main {

    public static void main(String[] args) {
        // Create data list
        int [] myDataList = {1,5,53,7,52};

        // sort
        mergeSort(myDataList,myDataList.length);

        for (int i : myDataList){
            System.out.print(" | "+ i);
        }
    }

    public static void mergeSort(int[] a, int n) {
        // If not data list's size bigger than 0, finish.
        if (n < 2) {
            return;
        }
        // Divide
        int mid = n / 2;
        int[] l = new int[mid]; // First half
        int[] r = new int[n - mid]; // last half

        // Fill the first array
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        // Fill the second array
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        // loop in method
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        // Go to Conqueror
        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            // Comparisons
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
