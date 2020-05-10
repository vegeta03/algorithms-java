package com.mine.sorting_and_searching;

public class BubbleSort {

    public static void bubbleSort(int[] listToSort) {
        for (int i = 0; i < listToSort.length; i++) {
            boolean swapped = false;

            for (int j = listToSort.length - 1; j > i; j--) {
                if (listToSort[j] > listToSort[j - 1]) {
                    swap(listToSort, j, j - 1);
                    swapped = true;
                }
            }
            print(listToSort);
            if (!swapped) {
                break;
            }
        }
    }

    public static void print(int[] listToSort) {
        for (int el : listToSort) {
            System.out.println(el + ",");
        }
        System.out.println();
    }

    public static void swap(int[] listToSort, int iIndex, int jIndex) {
        int temp = listToSort[iIndex];
        listToSort[iIndex] = listToSort[jIndex];
        listToSort[jIndex] = temp;
    }
}
