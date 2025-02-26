package com.example;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.project.Insertion_Sort.InsertionSort;
import com.example.project.Selection_Sort.SelectionSort;

public class Main {
    public static void main(String[] args) {
        // int[] arr = {5, 2, 9, 1, 5};
        // arr = InsertionSort.insertionSort(arr);
        // for (int num : arr) {
        //     System.out.print(num + ", ");
        // }

        ArrayList<String> words = InsertionSort.loadWordsInto(new ArrayList<String>());
        words = InsertionSort.selectionSortWordList(words);


        ArrayList<String> words1 = InsertionSort.loadWordsInto(new ArrayList<String>());
        words = InsertionSort.insertionSortWordList(words1);
    
        // System.out.println(words);
        // for(int i=1; i < words.size();i++){
        //     if(words.get(i).compareTo(words.get(i-1))<0){ //not in alphabetical order
        //         System.out.println(i);
        //     }
        // }

        // int[] arrA = {39,9,23,16,32,42,20,27,6,37,22,12,35,45,8,26,36,29,44,5,1,48,43,10,49,21,18,17,33,30,40,15,34,13,14,41,31,47,24,4,28,25,50,46,7,3,11,19,38,2};
        // InsertionSort.selectionSort(arrA);
        // System.out.println(Arrays.toString(arrA));
        // System.out.println("Selection Loops: " + InsertionSort.getSelectionCount());
        // System.out.println();
        // int[] arrB = {19,41,38,43,18,1,4,16,8,49,33,46,40,48,39,34,26,47,30,2,45,42,23,17,29};
        // InsertionSort.insertionSort(arrB);
        // System.out.println(Arrays.toString(arrB));
        // System.out.println("Insertion Loops: " + InsertionSort.getInsertionCount());

    }
}
