package com.example.project.Selection_Sort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // int[] arr = {5, 4, 3, 2, 1, 5, 4, 3, 2, 1};
        // int[] arr = {1, 10, 7, 3, 5, 2, 4, 9, 6, 8};
        // for (int num : arr) {
        //     System.out.print(num + ", ");
        // }
        // arr = SelectionSort.selectionSort(arr);
        // System.out.println();
        // for (int num : arr) {
        //     System.out.print(num + ", ");
        // }

        ArrayList<String> words = SelectionSort.loadWordsInto(new ArrayList<String>());
        words = SelectionSort.selectionSortWordList(words);
        System.out.println(words);
    }
}